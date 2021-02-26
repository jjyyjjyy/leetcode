package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NumberOfValidWordsForEachPuzzleTest {

    private static final NumberOfValidWordsForEachPuzzle NUMBER_OF_VALID_WORDS_FOR_EACH_PUZZLE = new NumberOfValidWordsForEachPuzzle();

    @ParameterizedTest
    @CsvSource({"'aaaa,asas,able,ability,actt,actor,access','aboveyz,abrodyz,abslute,absoryz,actresz,gaswxyz','1,1,3,2,4,0'"})
    void findNumOfValidWords(@ConvertWith(CsvToArray.class) String[] words,
                             @ConvertWith(CsvToArray.class) String[] puzzles,
                             @ConvertWith(CsvToArray.class) Integer[] expect) {
        Assertions.assertArrayEquals(expect, NUMBER_OF_VALID_WORDS_FOR_EACH_PUZZLE.findNumOfValidWords(words, puzzles).toArray(Integer[]::new));
    }
}
