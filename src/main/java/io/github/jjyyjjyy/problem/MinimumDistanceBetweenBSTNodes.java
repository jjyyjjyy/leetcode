package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/">二叉搜索树结点最小距离</a>
 *
 * <p>给定一个二叉搜索树的根结点&nbsp;<code>root</code>, 返回树中任意两节点的差的最小值。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> root = [4,2,6,1,3,null,null]
 * <strong>输出:</strong> 1
 * <strong>解释:</strong>
 * 注意，root是树结点对象(TreeNode object)，而不是数组。
 *
 * 给定的树 [4,2,6,1,3,null,null] 可表示为下图:
 *
 *           4
 *         /   \
 *       2      6
 *      / \
 *     1   3
 *
 * 最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。</pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>二叉树的大小范围在 <code>2</code> 到&nbsp;<code>100</code>。</li>
 * 	<li>二叉树总是有效的，每个节点的值都是整数，且不重复。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-inorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 799,
    name = "minimum-distance-between-bst-nodes",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.RECURSION}
)
public class MinimumDistanceBetweenBSTNodes {

    /**
     * 计算当前节点与子节点相差的最小值要找左子树的最大值和右子树的最小值, 与根节点相减, 比较再得到最小差值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(min, Math.abs(root.val - findMax(root.left)));
            min = Math.min(min, minDiffInBST(root.left));
        }
        if (root.right != null) {
            min = Math.min(min, Math.abs(root.val - findMin(root.right)));
            min = Math.min(min, minDiffInBST(root.right));
        }
        return min;
    }

    private int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    private int findMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}
