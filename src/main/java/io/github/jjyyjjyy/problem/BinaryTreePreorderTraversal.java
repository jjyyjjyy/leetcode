package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 *
 * <p>给定一个二叉树，返回它的&nbsp;<em>前序&nbsp;</em>遍历。</p>
 *
 * <p>&nbsp;<strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * <strong>输出:</strong> [1,2,3]
 * </pre>
 *
 * <p><strong>进阶:</strong>&nbsp;递归算法很简单，你可以通过迭代算法完成吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-inorder-traversal</li>
 *   <li>verify-preorder-sequence-in-binary-search-tree</li>
 *   <li>n-ary-tree-preorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 144,
    name = "binary-tree-preorder-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.TREE}
)
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        return null;
    }

}
