package io.github.jjyyjjyy.core.generate;

import java.util.List;

/**
 * @author jy
 */
public class Topic {

    private String slug;

    private String name;

    private String translatedName;

    private List<Integer> questions;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
    }

    public List<Integer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Integer> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Topic{" +
            "slug='" + slug + '\'' +
            ", name='" + name + '\'' +
            ", translatedName='" + translatedName + '\'' +
            ", questions=" + questions +
            '}';
    }
}
