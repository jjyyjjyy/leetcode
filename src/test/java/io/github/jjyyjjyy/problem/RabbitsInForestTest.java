package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RabbitsInForestTest {

    private static final RabbitsInForest RABBITS_IN_FOREST = new RabbitsInForest();

    @ParameterizedTest
    @CsvSource({"'1,1,2',5", "'10,10,10',11", "'',0", "'1,0,1,0,0',5", "'0,0,1,1,1',6"})
    void numRabbits(@ConvertWith(CsvToArray.class) int[] answers, int expect) {
        assertEquals(expect, RABBITS_IN_FOREST.numRabbits(answers));
    }
}
