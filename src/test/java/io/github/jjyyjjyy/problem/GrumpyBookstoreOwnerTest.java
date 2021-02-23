package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class GrumpyBookstoreOwnerTest {

    private static final GrumpyBookstoreOwner GRUMPY_BOOKSTORE_OWNER = new GrumpyBookstoreOwner();

    @ParameterizedTest
    @CsvSource({"'1,0,1,2,1,1,7,5','0,1,0,1,0,1,0,1',3,16"})
    void maxSatisfied(@ConvertWith(CsvToArray.class) int[] customers,
                      @ConvertWith(CsvToArray.class) int[] grumpy,
                      int X, int expect) {
        assertEquals(expect, GRUMPY_BOOKSTORE_OWNER.maxSatisfied(customers, grumpy, X));
    }
}
