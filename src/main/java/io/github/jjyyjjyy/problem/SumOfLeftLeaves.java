package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/sum-of-left-leaves/">左叶子之和</a>
 *
 * <p>计算给定二叉树的所有左叶子之和。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24</pre>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 404,
    name = "sum-of-left-leaves",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class SumOfLeftLeaves {

    /**
     * 1. 递归遍历子树.
     * 2. 如果左子树为叶子节点, 则加上左子树的值. 否则递归遍历左子树, 重复步骤2.
     * 3. 如果右子树不为空且不是叶子节点, 则递归遍历右子树, 重复步骤2.
     * 4. 将左右子树结果相加得到所有左边叶子节点之和.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        int val = 0;
        if (root.left != null) {
            if (isLeaf(root.left)) {
                val += root.left.val;
            } else {
                val += dfs(root.left);
            }
        }
        if (root.right != null && !isLeaf(root.right)) {
            val += dfs(root.right);
        }
        return val;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

}
