package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UniqueBinarySearchTreesIITest {

    private static final UniqueBinarySearchTreesII UNIQUE_BINARY_SEARCH_TREES_II = new UniqueBinarySearchTreesII();

    @ParameterizedTest
    @CsvSource({"3,5"})
    void generateTrees(int n, int expect) {
        assertEquals(expect, UNIQUE_BINARY_SEARCH_TREES_II.generateTrees(n).size());
    }
}
