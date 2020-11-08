package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.CsvToListNode;
import io.github.jjyyjjyy.util.ListNodeUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class AddTwoNumbersTest {

    private static final AddTwoNumbers ADD_TWO_NUMBERS = new AddTwoNumbers();

    @ParameterizedTest
    @CsvSource({"'2,4,3','5,6,4','7,0,8'"})
    void addTwoNumbers(@ConvertWith(CsvToListNode.class) ListNode l1,
                       @ConvertWith(CsvToListNode.class) ListNode l2,
                       @ConvertWith(CsvToListNode.class) ListNode expect
    ) {
        assertTrue(ListNodeUtil.isSame(ADD_TWO_NUMBERS.addTwoNumbers(l1, l2), expect));
    }
}
