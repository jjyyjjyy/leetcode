package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-paths/">二叉树的所有路径</a>
 *
 * <p>给定一个二叉树，返回所有从根节点到叶子节点的路径。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * <strong>输出:</strong> [&quot;1-&gt;2-&gt;5&quot;, &quot;1-&gt;3&quot;]
 *
 * <strong>解释:</strong> 所有根节点到叶子节点的路径为: 1-&gt;2-&gt;5, 1-&gt;3</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum-ii</li>
 *   <li>smallest-string-starting-from-leaf</li>
 * </ul>
 */
@Problem(
    id = 257,
    name = "binary-tree-paths",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class BinaryTreePaths {

    /**
     * 1. 遍历左右子树.
     * 2. 如果左右子树都为空, 则说明当前节点是叶子节点, 收集拼出来的结果.
     * 3. 分别判断左右子树是否不为空, 如果哪个子树不为空, 则遍历那个子树.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        binaryTreePaths(result, root, root.val + "");
        return result;
    }

    private void binaryTreePaths(List<String> result, TreeNode root, String prefix) {
        if (root.left == null && root.right == null) {
            result.add(prefix);
            return;
        }
        if (root.left != null) {
            binaryTreePaths(result, root.left, prefix + "->" + root.left.val);
        }
        if (root.right != null) {
            binaryTreePaths(result, root.right, prefix + "->" + root.right.val);
        }
    }
}
