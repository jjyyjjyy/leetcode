package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/">二叉树展开为链表</a>
 *
 * <p>给定一个二叉树，<a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95/8010757" target="_blank">原地</a>将它展开为链表。</p>
 *
 * <p>例如，给定二叉树</p>
 *
 * <pre>
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6</pre>
 *
 * <p>将其展开为：</p>
 *
 * <pre>
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>flatten-a-multilevel-doubly-linked-list</li>
 * </ul>
 */
@Problem(
    id = 114,
    name = "flatten-binary-tree-to-linked-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class FlattenBinaryTreeToLinkedList {

    /**
     * 1. flatten左子树.
     * 2. 找到左子树最右的节点.
     * 3. flatten右子树.
     * 4. root的右子树=root原来的左子树, 左子树最右的节点的右子树=root原来的右子树.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        flatten(left);
        TreeNode right = root.right;
        root.right = left;
        root.left = null;

        while (root.right != null) {
            root = root.right;
        }
        flatten(right);
        root.right = right;
    }

}
