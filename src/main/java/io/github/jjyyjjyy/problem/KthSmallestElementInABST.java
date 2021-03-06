package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/">二叉搜索树中第K小的元素</a>
 *
 * <p>给定一个二叉搜索树，编写一个函数&nbsp;<code>kthSmallest</code>&nbsp;来查找其中第&nbsp;<strong>k&nbsp;</strong>个最小的元素。</p>
 *
 * <p><strong>说明：</strong><br>
 * 你可以假设 k 总是有效的，1 &le; k &le; 二叉搜索树元素个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 * &nbsp;  2
 * <strong>输出:</strong> 1</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * <strong>输出:</strong> 3</pre>
 *
 * <p><strong>进阶：</strong><br>
 * 如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化&nbsp;<code>kthSmallest</code>&nbsp;函数？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-inorder-traversal</li>
 *   <li>second-minimum-node-in-a-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 230,
    name = "kth-smallest-element-in-a-bst",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.BINARY_SEARCH}
)
public class KthSmallestElementInABST {

    public int kthSmallest(TreeNode root, int k) {
        return -1;
    }
}
