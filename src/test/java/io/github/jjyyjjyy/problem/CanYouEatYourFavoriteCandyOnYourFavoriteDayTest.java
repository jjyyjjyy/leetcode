package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class CanYouEatYourFavoriteCandyOnYourFavoriteDayTest {

    private static final CanYouEatYourFavoriteCandyOnYourFavoriteDay CAN_YOU_EAT_YOUR_FAVORITE_CANDY_ON_YOUR_FAVORITE_DAY = new CanYouEatYourFavoriteCandyOnYourFavoriteDay();

    @ParameterizedTest
    @CsvSource({"'7,4,5,3,8','[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]','false,true,true,false,false'"})
    void canEat(@ConvertWith(CsvToArray.class) int[] candiesCount,
                @ConvertWith(CsvToArray.class) int[][] queries,
                @ConvertWith(CsvToArray.class) boolean[] expect) {
        assertArrayEquals(expect, CAN_YOU_EAT_YOUR_FAVORITE_CANDY_ON_YOUR_FAVORITE_DAY.canEat(candiesCount, queries));
    }
}
