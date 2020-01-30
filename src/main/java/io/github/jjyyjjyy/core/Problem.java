package io.github.jjyyjjyy.core;

import java.lang.annotation.*;

/**
 * 题目元数据
 *
 * @author jy
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Problem {

    int id();

    String name();

    Difficulty difficulty();

    boolean paidOnly() default false;

    Tag[] tags();
}
