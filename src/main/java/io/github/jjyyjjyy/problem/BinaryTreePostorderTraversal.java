package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 *
 * <p>给定一个二叉树，返回它的 <em>后序&nbsp;</em>遍历。</p>
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
 * <strong>输出:</strong> [3,2,1]</pre>
 *
 * <p><strong>进阶:</strong>&nbsp;递归算法很简单，你可以通过迭代算法完成吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-inorder-traversal</li>
 *   <li>n-ary-tree-postorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 145,
    name = "binary-tree-postorder-traversal",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.TREE}
)
public class BinaryTreePostorderTraversal {

    /**
     * 后序遍历: 左右根
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(result, root);
        return result;
    }

    private void postorderTraversal(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(result, root.left);
        postorderTraversal(result, root.right);
        result.add(root.val);
    }
}
