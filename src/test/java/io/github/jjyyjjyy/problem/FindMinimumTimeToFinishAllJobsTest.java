package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FindMinimumTimeToFinishAllJobsTest {

    @ParameterizedTest
    @CsvSource({"'3,2,3',3,3", "'1,2,4,7,8',2,11"})
    void minimumTimeRequired(@ConvertWith(CsvToArray.class) int[] jobs, int k, int expect) {
        assertEquals(expect, new FindMinimumTimeToFinishAllJobs().minimumTimeRequired(jobs, k));
    }
}
