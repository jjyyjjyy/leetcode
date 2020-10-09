package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class CountAndSayTest {

    private static final CountAndSay COUNT_AND_SAY = new CountAndSay();

    @ParameterizedTest
    @CsvSource({"1,1", "2,11", "3,21", "4,1211", "5,111221"})
    void countAndSay(int n, String expect) {
        Assertions.assertEquals(expect, COUNT_AND_SAY.countAndSay(n));
    }
}
