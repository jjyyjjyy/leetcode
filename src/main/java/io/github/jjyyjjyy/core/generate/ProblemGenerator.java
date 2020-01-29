package io.github.jjyyjjyy.core.generate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Tag;

import javax.lang.model.element.Modifier;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jy
 */
public class ProblemGenerator {

    private static final String PROBLEM_API = "https://leetcode-cn.com/api/problems/all/";

    private static final String LEETCODE_API = "https://leetcode-cn.com/graphql/";

    public static void main(String[] args) throws Exception {

        JSON.parseObject(HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create(PROBLEM_API)).build(), HttpResponse.BodyHandlers.ofString()).body())
            .getJSONArray("stat_status_pairs")
            .parallelStream()
            .map(r -> ((JSONObject) r).getJSONObject("stat").getString("question__title_slug"))
            .forEach(name -> {
                String body = "{\n" +
                              "    \"operationName\": \"questionData\",\n" +
                              "    \"variables\": {\n" +
                              "        \"titleSlug\": \"" + name + "\"\n" +
                              "    },\n" +
                              "    \"query\": \"query questionData($titleSlug: String!) {\\n  question(titleSlug: $titleSlug) {\\n    questionId\\n title\\n    translatedTitle\\n    translatedContent\\n    isPaidOnly\\n    difficulty\\n   metaData\\n similarQuestions\\n      topicTags {\\n      name\\n         }\\n   codeSnippets {\\n      lang\\n      langSlug\\n      code\\n    }\\n mysqlSchemas\\n  }\\n}\\n\"\n" +
                              "}\n";
                try {
                    JSONObject question = JSON.parseObject(HttpClient.newHttpClient()
                        .send(HttpRequest
                                .newBuilder(URI.create(LEETCODE_API))
                                .header("Content-Type", "application/json")
                                .POST(HttpRequest.BodyPublishers.ofString(body))
                                .build(),
                            HttpResponse.BodyHandlers.ofString()).body())
                        .getJSONObject("data")
                        .getJSONObject("question");

                    boolean isPaidOnly = question.getBooleanValue("isPaidOnly");
                    String codeSnippets = question.getString("codeSnippets");
                    if (isPaidOnly || codeSnippets == null) {
                        return;
                    }
                    int id = question.getIntValue("questionId");
                    String title = customTitle(question.getString("title"));
                    String cnName = question.getString("translatedTitle");
                    String content = question.getString("translatedContent");
                    Difficulty difficulty = Difficulty.valueOf(question.getString("difficulty").toUpperCase());
                    String similarQuestions = JSONArray.parseArray(question.getString("similarQuestions"), Problem.class).stream().map(Problem::getTitleSlug).map(q -> "  <li>" + q + "</li>").collect(Collectors.joining("\n"));
                    CodeBlock.Builder tagBuilder = CodeBlock.builder();
                    tagBuilder.add("{");
                    List<Tag> topicTags = question.getJSONArray("topicTags").toJavaList(Topic.class).stream().map(n -> Tag.valueOf(TagGenerator.getTopicEnumName(n.getName()))).collect(Collectors.toList());
                    for (int i = 0; i < topicTags.size(); i++) {
                        tagBuilder.add("$T.$L" + (i == topicTags.size() - 1 ? "" : ","), Tag.class, topicTags.get(i));
                    }
                    tagBuilder.add("}");
                    TypeSpec.Builder type = TypeSpec.classBuilder(title)
                        .addModifiers(Modifier.PUBLIC)
                        .addAnnotation(AnnotationSpec.builder(io.github.jjyyjjyy.core.Problem.class)
                            .addMember("id", "$L", id)
                            .addMember("name", "$S", name)
                            .addMember("difficulty", "$T.$L", Difficulty.class, difficulty)
                            .addMember("tags", tagBuilder.build())
                            .build())
                        .addJavadoc("<a href=\"https://leetcode-cn.com/problems/" + name + "/\">" + cnName + "</a>\n\n")
                        .addJavadoc(content.replace("$", "").replace("*/", "") + "\n\n");
                    if (!similarQuestions.isBlank()) {
                        type.addJavadoc("相似问题: \n<ul>\n" + similarQuestions + "\n</ul>\n\n");
                    }
                    JavaFile.builder("io.github.jjyyjjyy.problem", type.build())
                        .indent(" ".repeat(4))
                        .skipJavaLangImports(true)
                        .build()
                        .writeTo(Paths.get("src/main/java/"));


                } catch (Exception e) {
                    System.err.println(name);
                    throw new RuntimeException(e);
                }
            });
    }

    private static String customTitle(String origin) {
        origin = origin.replaceAll("[\\s-,%()?`']", "");
        char c = origin.charAt(0);
        if (!Character.isDigit(c)) {
            return origin;
        }
        String replacer = switch (c) {
            case '0':
                yield "Zero";
            case '1':
                yield "One";
            case '2':
                yield "Two";
            case '3':
                yield "Three";
            case '4':
                yield "Four";
            default:
                yield String.valueOf(c);
        };
        return replacer + customTitle(origin.substring(1));
    }

}
