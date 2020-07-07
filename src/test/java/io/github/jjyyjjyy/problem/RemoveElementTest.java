package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class RemoveElementTest {

    private static final RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @CsvSource({"'3,2,2,3',3,2", "'0,1,2,2,3,0,4,2',2,5"})
    void removeElement(@ConvertWith(CsvToArray.class) int[] param1, int param2, int result) {
        Assertions.assertEquals(result, removeElement.removeElement(param1, param2));
    }
}
