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

    public enum ComplexityType {

        O_1("O(1)"),
        O_LOG_N("O(logn)"),
        O_N("O(n)"),
        O_N_LOG_N("O(nlogn)"),
        O_M_N("O(m*n)"),
        O_N_POW_2("O(n^2)"),
        O_N_POW_3("O(n^3)"),
        O_N_FACTORIAL("O(n!)");

        private final String description;

        ComplexityType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
