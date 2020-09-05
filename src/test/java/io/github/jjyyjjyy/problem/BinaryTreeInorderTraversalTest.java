package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jy
 */
class BinaryTreeInorderTraversalTest {

    private static final BinaryTreeInorderTraversal BINARY_TREE_INORDER_TRAVERSAL = new BinaryTreeInorderTraversal();

    @Test
    void inorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        treeNode.right = right;
        right.left = new TreeNode(3);
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, ArrayUtil.toIntArray(BINARY_TREE_INORDER_TRAVERSAL.inorderTraversal(treeNode)));
    }
}
