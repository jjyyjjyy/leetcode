package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/">二叉树的最大深度</a>
 *
 * <p>给定一个二叉树，找出其最大深度。</p>
 *
 * <p>二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例：</strong><br>
 * 给定二叉树 <code>[3,9,20,null,null,15,7]</code>，</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7</pre>
 *
 * <p>返回它的最大深度&nbsp;3 。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>balanced-binary-tree</li>
 *   <li>minimum-depth-of-binary-tree</li>
 *   <li>maximum-depth-of-n-ary-tree</li>
 * </ul>
 */
@Problem(
    id = 104,
    name = "maximum-depth-of-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class MaximumDepthofBinaryTree {
}
