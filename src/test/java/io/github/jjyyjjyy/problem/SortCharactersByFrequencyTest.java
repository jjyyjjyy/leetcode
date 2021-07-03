package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SortCharactersByFrequencyTest {

    private static final SortCharactersByFrequency SORT_CHARACTERS_BY_FREQUENCY = new SortCharactersByFrequency();

    @ParameterizedTest
    @CsvSource({"tree,eert", "cccaaa,aaaccc", "Aabb,bbAa"})
    void frequencySort(String s, String expect) {
        assertEquals(expect, SORT_CHARACTERS_BY_FREQUENCY.frequencySort(s));
    }
}
