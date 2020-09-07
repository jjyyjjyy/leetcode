package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jy
 */
class BSTIteratorTest {

    @Test
    void next() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        TreeNode right = new TreeNode(15);
        root.right = right;
        right.left = new TreeNode(9);
        right.right = new TreeNode(20);

        BSTIterator iterator = new BSTIterator(root);
        assertEquals(3, iterator.next());
        assertEquals(7, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(15, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
