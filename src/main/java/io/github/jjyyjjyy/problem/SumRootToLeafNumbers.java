package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">求根到叶子节点数字之和</a>
 *
 * <p>给定一个二叉树，它的每个结点都存放一个&nbsp;<code>0-9</code>&nbsp;的数字，每条从根到叶子节点的路径都代表一个数字。</p>
 *
 * <p>例如，从根到叶子节点路径 <code>1-&gt;2-&gt;3</code> 代表数字 <code>123</code>。</p>
 *
 * <p>计算从根到叶子节点生成的所有数字之和。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 *     1
 *    / \
 *   2   3
 * <strong>输出:</strong> 25
 * <strong>解释:</strong>
 * 从根到叶子节点路径 <code>1-&gt;2</code> 代表数字 <code>12</code>.
 * 从根到叶子节点路径 <code>1-&gt;3</code> 代表数字 <code>13</code>.
 * 因此，数字总和 = 12 + 13 = <code>25</code>.</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 * &nbsp;/ \
 * 5   1
 * <strong>输出:</strong> 1026
 * <strong>解释:</strong>
 * 从根到叶子节点路径 <code>4-&gt;9-&gt;5</code> 代表数字 495.
 * 从根到叶子节点路径 <code>4-&gt;9-&gt;1</code> 代表数字 491.
 * 从根到叶子节点路径 <code>4-&gt;0</code> 代表数字 40.
 * 因此，数字总和 = 495 + 491 + 40 = <code>1026</code>.</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum</li>
 *   <li>binary-tree-maximum-path-sum</li>
 *   <li>smallest-string-starting-from-leaf</li>
 * </ul>
 */
@Problem(
    id = 129,
    name = "sum-root-to-leaf-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class SumRootToLeafNumbers {

    /**
     * 每个节点的值=当前节点的val加上上一个节点的值*10
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int sumNumbers(TreeNode root) {
        return sumNumbers(0, root);
    }

    private int sumNumbers(int sum, TreeNode root) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return sumNumbers(sum, root.left) + sumNumbers(sum, root.right);
    }
}
