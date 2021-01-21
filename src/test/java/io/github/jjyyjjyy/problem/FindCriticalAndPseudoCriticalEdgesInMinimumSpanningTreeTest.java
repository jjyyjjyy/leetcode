package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTreeTest {

    private static final FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree FIND_CRITICAL_AND_PSEUDO_CRITICAL_EDGES_IN_MINIMUM_SPANNING_TREE = new FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree();

    @ParameterizedTest
    @CsvSource({"5,'[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]','[0,1],[2,3,4,5]'", "4,'[0,1,1],[1,2,1],[2,3,1],[0,3,1]','[],[0,1,2,3]'"})
    void findCriticalAndPseudoCriticalEdges(int n, @ConvertWith(CsvToArray.class) int[][] edges, @ConvertWith(CsvToArray.class) Integer[][] expect) {
        assertTrue(ArrayUtil.isSame(ArrayUtil.toArray(FIND_CRITICAL_AND_PSEUDO_CRITICAL_EDGES_IN_MINIMUM_SPANNING_TREE.findCriticalAndPseudoCriticalEdges(n, edges)), expect));
    }
}
