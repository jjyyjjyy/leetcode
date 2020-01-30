package io.github.jjyyjjyy.core;

import java.lang.annotation.*;

/**
 * 复杂度
 *
 * @author jy
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Complexity {

    String value();
}
