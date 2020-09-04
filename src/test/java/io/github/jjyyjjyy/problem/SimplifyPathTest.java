package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SimplifyPathTest {

    private static final SimplifyPath SIMPLIFY_PATH = new SimplifyPath();

    @ParameterizedTest
    @CsvSource({"/home/,/home", "/../,/", "/home//foo/,/home/foo", "/a/./b/../../c/,/c", "/a/../../b/../c//.//,/c", "/a//b////c/d//././/..,/a/b/c"})
    void simplifyPath(String path, String expect) {
        Assertions.assertEquals(expect, SIMPLIFY_PATH.simplifyPath(path));
    }
}
