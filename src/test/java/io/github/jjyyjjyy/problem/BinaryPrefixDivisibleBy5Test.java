package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static io.github.jjyyjjyy.util.ArrayUtil.toPrimitiveBooleanArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class BinaryPrefixDivisibleBy5Test {

    private static final BinaryPrefixDivisibleBy5 BINARY_PREFIX_DIVISIBLE_BY_5 = new BinaryPrefixDivisibleBy5();

    @ParameterizedTest
    @CsvSource({"'0,1,1','true,false,false'", "'1,1,1','false,false,false'", "'0,1,1,1,1,1','true,false,false,false,true,false'", "'1,1,1,0,1','false,false,false,false,false'"})
    void prefixesDivBy5(@ConvertWith(CsvToArray.class) int[] A,
                        @ConvertWith(CsvToArray.class) boolean[] expect) {
        assertArrayEquals(expect, toPrimitiveBooleanArray(BINARY_PREFIX_DIVISIBLE_BY_5.prefixesDivBy5(A)));
    }
}
