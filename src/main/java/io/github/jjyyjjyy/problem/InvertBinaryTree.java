package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/invert-binary-tree/">翻转二叉树</a>
 *
 * <p>翻转一棵二叉树。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <p>输入：</p>
 *
 * <pre>     4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9</pre>
 *
 * <p>输出：</p>
 *
 * <pre>     4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1</pre>
 *
 * <p><strong>备注:</strong><br>
 * 这个问题是受到 <a href="https://twitter.com/mxcl" target="_blank">Max Howell </a>的 <a href="https://twitter.com/mxcl/status/608682016205344768" target="_blank">原问题</a> 启发的 ：</p>
 *
 * <blockquote>谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。</blockquote>
 */
@Problem(
    id = 226,
    name = "invert-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        return null;
    }
}
