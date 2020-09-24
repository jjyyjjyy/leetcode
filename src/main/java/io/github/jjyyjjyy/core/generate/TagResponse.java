package io.github.jjyyjjyy.core.generate;

import java.util.List;

/**
 * @author jy
 */
public class TagResponse {

    private List<Topic> topics;

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "TagResponse{" +
            "topics=" + topics +
            '}';
    }
}
