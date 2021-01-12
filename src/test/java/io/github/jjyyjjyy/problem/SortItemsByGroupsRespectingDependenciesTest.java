package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SortItemsByGroupsRespectingDependenciesTest {

    private static final SortItemsByGroupsRespectingDependencies SORT_ITEMS_BY_GROUPS_RESPECTING_DEPENDENCIES = new SortItemsByGroupsRespectingDependencies();

    @ParameterizedTest
    @CsvSource({"8,2,'-1,-1,1,0,0,1,0,-1','[],[6],[5],[6],[3,6],[],[],[]','6,3,4,5,2,0,7,1'"})
    void sortItems(int n, int m, @ConvertWith(CsvToArray.class) int[] group,
                   @ConvertWith(CsvToArray.class) Integer[][] beforeItems,
                   @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, SORT_ITEMS_BY_GROUPS_RESPECTING_DEPENDENCIES.sortItems(n, m, group, ArrayUtil.toList(beforeItems)));
    }
}
