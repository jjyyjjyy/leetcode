package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-of-bst/">二叉搜索树的范围和</a>
 *
 * <p>给定二叉搜索树的根结点&nbsp;<code>root</code>，返回 <code>L</code> 和 <code>R</code>（含）之间的所有结点的值的和。</p>
 *
 * <p>二叉搜索树保证具有唯一的值。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>root = [10,5,15,3,7,null,18], L = 7, R = 15
 * <strong>输出：</strong>32
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * <strong>输出：</strong>23
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>树中的结点数量最多为&nbsp;<code>10000</code>&nbsp;个。</li>
 * 	<li>最终的答案保证小于&nbsp;<code>2^31</code>。</li>
 * </ol>
 */
@Problem(
    id = 975,
    name = "range-sum-of-bst",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.RECURSION}
)
public class RangeSumOfBST {

    /**
     * 1. 如果当前节点比high大, 遍历左子树.
     * 2. 如果当前节点比low小, 遍历右子树.
     * 3. 将当前节点的值+左右子树的和.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
