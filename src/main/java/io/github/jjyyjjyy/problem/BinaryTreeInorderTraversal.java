package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">二叉树的中序遍历</a>
 *
 * <p>给定一个二叉树，返回它的<em>中序&nbsp;</em>遍历。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * <strong>输出:</strong> [1,3,2]</pre>
 *
 * <p><strong>进阶:</strong>&nbsp;递归算法很简单，你可以通过迭代算法完成吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>validate-binary-search-tree</li>
 *   <li>binary-tree-preorder-traversal</li>
 *   <li>binary-tree-postorder-traversal</li>
 *   <li>binary-search-tree-iterator</li>
 *   <li>kth-smallest-element-in-a-bst</li>
 *   <li>closest-binary-search-tree-value-ii</li>
 *   <li>inorder-successor-in-bst</li>
 *   <li>convert-binary-search-tree-to-sorted-doubly-linked-list</li>
 *   <li>minimum-distance-between-bst-nodes</li>
 * </ul>
 */
@Problem(
    id = 94,
    name = "binary-tree-inorder-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.TREE, Tag.HASH_TABLE}
)
public class BinaryTreeInorderTraversal {

    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
