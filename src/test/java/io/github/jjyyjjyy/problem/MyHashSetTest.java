package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class MyHashSetTest {

    @Test
    public void testMyHashSet() {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
        set.remove(2);
        assertFalse(set.contains(2));
    }

}
