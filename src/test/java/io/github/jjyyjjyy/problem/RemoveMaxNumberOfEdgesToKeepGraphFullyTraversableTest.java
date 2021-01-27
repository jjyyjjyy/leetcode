package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {

    private static final RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable REMOVE_MAX_NUMBER_OF_EDGES_TO_KEEP_GRAPH_FULLY_TRAVERSABLE = new RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable();

    @ParameterizedTest
    @CsvSource({"4,'[3,1,2],[3,2,3],[1,1,3],[1,2,4],[1,1,2],[2,3,4]',2", "4,'[3,1,2],[3,2,3],[1,1,4],[2,1,4]',0", "4,'[3,2,3],[1,1,2],[2,3,4]',-1"})
    void maxNumEdgesToRemove(int n, @ConvertWith(CsvToArray.class) int[][] edges, int expect) {
        assertEquals(expect, REMOVE_MAX_NUMBER_OF_EDGES_TO_KEEP_GRAPH_FULLY_TRAVERSABLE.maxNumEdgesToRemove(n, edges));
    }
}
