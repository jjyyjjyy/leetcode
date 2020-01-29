package io.github.jjyyjjyy.core.generate;

import lombok.Data;

import java.util.List;

/**
 * @author jy
 */
@Data
public class Topic {

    private String slug;

    private String name;

    private String translatedName;

    private List<Integer> questions;

}
