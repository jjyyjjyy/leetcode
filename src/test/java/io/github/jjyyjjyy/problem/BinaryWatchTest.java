package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class BinaryWatchTest {

    private static final BinaryWatch BINARY_WATCH = new BinaryWatch();

    @ParameterizedTest
    @CsvSource({"1,'0:01,0:02,0:04,0:08,0:16,0:32,1:00,2:00,4:00,8:00'", "9,''"})
    void readBinaryWatch(int turnedOn, @ConvertWith(CsvToArray.class) String[] expect) {
        assertArrayEquals(expect, BINARY_WATCH.readBinaryWatch(turnedOn).toArray(String[]::new));
    }
}
