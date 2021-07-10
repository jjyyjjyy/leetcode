package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author jy
 */
class TimeMapTest {

    @Test
    void testTimeMap() {
        TimeMap map = new TimeMap();
        map.set("foo", "bar", 1);
        assertEquals("bar", map.get("foo", 1));
        assertEquals("bar", map.get("foo", 2));
        assertNull(map.get("foo", 0));
        map.set("foo", "bar2", 4);
        assertEquals("bar2", map.get("foo", 4));
        assertEquals("bar2", map.get("foo", 5));
        assertNull(map.get("foo", 0));
    }
}
