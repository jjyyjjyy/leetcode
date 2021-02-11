package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class KthLargestTest {

    @ParameterizedTest
    @CsvSource({"3,'4,5,8,2','3,5,10,9,4','4,5,5,8,8'"})
    void add(int k,
             @ConvertWith(CsvToArray.class) int[] nums,
             @ConvertWith(CsvToArray.class) int[] adds,
             @ConvertWith(CsvToArray.class) int[] expects) {
        KthLargest kthLargest = new KthLargest(k, nums);
        for (int i = 0; i < adds.length; i++) {
            Assertions.assertEquals(expects[i], kthLargest.add(adds[i]));
        }
    }
}
