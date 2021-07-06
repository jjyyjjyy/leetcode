package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class DisplayTableOfFoodOrdersInARestaurantTest {

    private static final DisplayTableOfFoodOrdersInARestaurant DISPLAY_TABLE_OF_FOOD_ORDERS_IN_A_RESTAURANT = new DisplayTableOfFoodOrdersInARestaurant();

    @ParameterizedTest
    @CsvSource({"'[Laura,2,Bean Burrito],[Jhon,2,Beef Burrito],[Melissa,2,Soda]','[Table,Bean Burrito,Beef Burrito,Soda],[2,1,1,1]'"})
    void displayTable(@ConvertWith(CsvToArray.class) String[][] orders,
                      @ConvertWith(CsvToArray.class) String[][] expect) {
        Assertions.assertTrue(ArrayUtil.isSame(ArrayUtil.toArray(DISPLAY_TABLE_OF_FOOD_ORDERS_IN_A_RESTAURANT.displayTable(ArrayUtil.toList(orders))), expect));
    }
}
