package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.NestedInteger;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jy
 */
class MiniParserTest {

    private static final MiniParser MINI_PARSER = new MiniParser();

    @Test
    void deserialize() {
        NestedInteger nestedInteger = MINI_PARSER.deserialize("324");
        assertNotNull(nestedInteger);
        assertTrue(nestedInteger.isInteger());
        assertEquals(324, nestedInteger.getInteger());

        nestedInteger = MINI_PARSER.deserialize("[123,[456,[789]]]");
        assertFalse(nestedInteger.isInteger());
        List<NestedInteger> nestedIntegers = nestedInteger.getList();
        assertEquals(2, nestedIntegers.size());
        nestedInteger = nestedIntegers.get(0);
        assertTrue(nestedInteger.isInteger());
        assertEquals(123, nestedInteger.getInteger());
        nestedInteger = nestedIntegers.get(1);
        assertFalse(nestedInteger.isInteger());
        nestedIntegers = nestedInteger.getList();
        assertEquals(456, nestedIntegers.get(0).getInteger());
        nestedIntegers = nestedIntegers.get(1).getList();
        assertEquals(1, nestedIntegers.size());
        nestedInteger = nestedIntegers.get(0);
        assertEquals(789, nestedInteger.getInteger());

    }
}
