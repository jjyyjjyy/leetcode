package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class OpenTheLockTest {

    private static final OpenTheLock OPEN_THE_LOCK = new OpenTheLock();

    @ParameterizedTest
    @CsvSource({"'0201,0101,0102,1212,2002',0202,6", "'8888',0009,1", "'8887,8889,8878,8898,8788,8988,7888,9888',8888,-1", "'0000',8888,-1"})
    void openLock(@ConvertWith(CsvToArray.class) String[] deadends, String target, int expect) {
        assertEquals(expect, OPEN_THE_LOCK.openLock(deadends, target));
    }
}
