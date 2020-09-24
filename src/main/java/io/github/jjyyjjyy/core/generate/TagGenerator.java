package io.github.jjyyjjyy.core.generate;

import com.alibaba.fastjson.JSON;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

/**
 * @author jy
 */
public class TagGenerator {

    static final String TAG_API = "https://leetcode-cn.com/problems/api/tags/";

    private static final String PACKAGE_NAME = "io.github.jjyyjjyy.core";

    static List<Topic> getTopics() {
        TagResponse tagResponse;
        try {
            tagResponse = JSON.parseObject(HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create(TAG_API)).build(), HttpResponse.BodyHandlers.ofString()).body(), TagResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tagResponse.getTopics();
    }

    static String getTopicEnumName(String origin) {
        return origin.replace(" ", "_").replace("-", "_").toUpperCase();
    }

    public static void main(String[] args) throws Exception {

        TypeSpec.Builder tagBuilder = TypeSpec.enumBuilder("Tag")
            .addModifiers(Modifier.PUBLIC)
            .addField(String.class, "name", Modifier.PRIVATE, Modifier.FINAL)
            .addMethod(MethodSpec.constructorBuilder()
                .addParameter(String.class, "name")
                .addStatement("this.$N = $N", "name", "name").build())
            .addMethod(MethodSpec.methodBuilder("getName")
                .addModifiers(Modifier.PUBLIC)
                .returns(String.class)
                .addStatement("return this.name")
                .build());

        getTopics().forEach(topic -> tagBuilder.addEnumConstant(getTopicEnumName(topic.getName()), TypeSpec.anonymousClassBuilder("$S", Optional.ofNullable(topic.getTranslatedName()).orElse(topic.getName())).build()));

        JavaFile javaFile = JavaFile.builder(PACKAGE_NAME, tagBuilder.build())
            .indent(" ".repeat(4))
            .skipJavaLangImports(true)
            .build();
        javaFile.writeTo(Paths.get("src/main/java/"));

    }
}
