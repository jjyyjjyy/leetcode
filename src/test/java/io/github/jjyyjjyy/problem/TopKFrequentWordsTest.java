package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class TopKFrequentWordsTest {

    private static final TopKFrequentWords TOP_K_FREQUENT_WORDS = new TopKFrequentWords();

    @ParameterizedTest
    @CsvSource({"'i,love,leetcode,i,love,coding',2,'i,love'", "'the,day,is,sunny,the,the,the,sunny,is,is',4,'the,is,sunny,day'"})
    void topKFrequent(@ConvertWith(CsvToArray.class) String[] words, int k,
                      @ConvertWith(CsvToArray.class) String[] expect) {
        Assertions.assertArrayEquals(expect, TOP_K_FREQUENT_WORDS.topKFrequent(words, k).toArray(String[]::new));
    }
}
