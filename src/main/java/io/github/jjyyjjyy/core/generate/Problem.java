package io.github.jjyyjjyy.core.generate;

/**
 * @author jy
 */
public class Problem {

    private String titleSlug;

    public String getTitleSlug() {
        return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
        this.titleSlug = titleSlug;
    }

    @Override
    public String toString() {
        return "Problem{" +
            "titleSlug='" + titleSlug + '\'' +
            '}';
    }
}
