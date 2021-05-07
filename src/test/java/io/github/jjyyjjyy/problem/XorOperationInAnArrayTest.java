package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class XorOperationInAnArrayTest {

    private static final XorOperationInAnArray XOR_OPERATION_IN_AN_ARRAY = new XorOperationInAnArray();

    @ParameterizedTest
    @CsvSource({"5,0,8", "4,3,8", "1,7,7", "10,5,2"})
    void xorOperation(int n, int start, int expect) {
        assertEquals(expect, XOR_OPERATION_IN_AN_ARRAY.xorOperation(n, start));
    }
}
