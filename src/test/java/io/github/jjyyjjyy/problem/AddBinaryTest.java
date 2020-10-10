package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class AddBinaryTest {

    private static final AddBinary ADD_BINARY = new AddBinary();

    @ParameterizedTest
    @CsvSource({"11,1,100", "1010,1011,10101"})
    void addBinary(String a, String b, String expect) {
        Assertions.assertEquals(expect, ADD_BINARY.addBinary(a, b));
    }
}
