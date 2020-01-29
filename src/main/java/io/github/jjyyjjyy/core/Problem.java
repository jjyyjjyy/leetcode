package io.github.jjyyjjyy.core;

import java.lang.annotation.*;

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
