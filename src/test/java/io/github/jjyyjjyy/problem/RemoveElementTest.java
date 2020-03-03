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

    private RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @CsvSource({"'3,2,2,3',3", "'0,1,2,2,3,0,4,2',2"})
    void removeElement(@ConvertWith(CsvToArray.class) int[] param, int result) {
        Assertions.assertEquals(result, removeElement.removeElement(param, result));
    }
}
