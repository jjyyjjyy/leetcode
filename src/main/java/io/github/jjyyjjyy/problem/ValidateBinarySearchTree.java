package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">验证二叉搜索树</a>
 *
 * <p>给定一个二叉树，判断其是否是一个有效的二叉搜索树。</p>
 *
 * <p>假设一个二叉搜索树具有如下特征：</p>
 *
 * <ul>
 * 	<li>节点的左子树只包含<strong>小于</strong>当前节点的数。</li>
 * 	<li>节点的右子树只包含<strong>大于</strong>当前节点的数。</li>
 * 	<li>所有左子树和右子树自身必须也是二叉搜索树。</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 *     2
 *    / \
 *   1   3
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:
 * </strong>    5
 *    / \
 *   1   4
 * &nbsp;    / \
 * &nbsp;   3   6
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 输入为: [5,1,4,null,null,3,6]。
 * &nbsp;    根节点的值为 5 ，但是其右子节点值为 4 。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-inorder-traversal</li>
 *   <li>find-mode-in-binary-search-tree</li>
 * </ul>
 */
@Problem(
    id = 98,
    name = "validate-binary-search-tree",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class ValidateBinarySearchTree {

    /**
     * 1. 递归判断left<root<right.
     * 2. 找到左子树的最大值和右子树的最小值, 判断leftMax<root<rightMin.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val >= root.val || root.right != null && root.right.val <= root.val) {
            return false;
        }
        if (!(isValidBST(root.left) && isValidBST(root.right))) {
            return false;
        }

        TreeNode leftMax = root.left;
        while (leftMax != null && leftMax.right != null) {
            leftMax = leftMax.right;
        }

        TreeNode rightMin = root.right;
        while (rightMin != null && rightMin.left != null) {
            rightMin = rightMin.left;
        }
        return (leftMax == null || leftMax.val < root.val) && (rightMin == null || rightMin.val > root.val);
    }
}
