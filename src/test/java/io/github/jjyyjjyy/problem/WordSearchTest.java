package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class WordSearchTest {

    private static final WordSearch WORD_SEARCH = new WordSearch();

    @ParameterizedTest
    @CsvSource({"'[ABCE],[SFCS],[ADEE]',ABCCED,true", "'[ABCE],[SFCS],[ADEE]',ABCB,false"})
    void exist(@ConvertWith(CsvToArray.class) char[][] board, String word, boolean expect) {
        assertEquals(expect, WORD_SEARCH.exist(board, word));
    }
}
