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

    ComplexityType value();

    String complexity() default "";

    enum ComplexityType {

        O_1("O(1)"),
        O_LOG_N("O(logn)"),
        O_N("O(n)"),
        O_N_LOG_N("O(nlogn)"),
        O_N_POW_2_LOG_N("O(nlogn)"),
        O_M_N("O(m*n)"),
        O_M_AND_N("O(m+n)"),
        O_LOG_M_N("O(log(mn))"),
        O_N_EXPONENT("O(n*2^n)"),
        O_N_POW_2("O(n^2)"),
        O_N_POW_3("O(n^3)"),
        O_N_FACTORIAL("O(n!)"),
        O_DEFINE("");

        private final String description;

        ComplexityType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
