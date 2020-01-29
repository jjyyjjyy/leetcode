package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/diameter-of-binary-tree/">二叉树的直径</a>
 *
 * <p>给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。</p>
 *
 * <p><strong>示例 :</strong><br />
 * 给定二叉树</p>
 *
 * <pre>
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * </pre>
 *
 * <p>返回&nbsp;<strong>3</strong>, 它的长度是路径 [4,2,1,3] 或者&nbsp;[5,2,1,3]。</p>
 *
 * <p><strong>注意：</strong>两结点之间的路径长度是以它们之间边的数目表示。</p>
 */
@Problem(
    id = 543,
    name = "diameter-of-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class DiameterofBinaryTree {
}
