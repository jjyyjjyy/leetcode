package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UniqueBinarySearchTreesTest {

    private static final UniqueBinarySearchTrees UNIQUE_BINARY_SEARCH_TREES = new UniqueBinarySearchTrees();

    @ParameterizedTest
    @CsvSource({"3,5"})
    void numTrees(int n, int expect) {
        assertEquals(expect, UNIQUE_BINARY_SEARCH_TREES.numTrees(n));
    }
}
