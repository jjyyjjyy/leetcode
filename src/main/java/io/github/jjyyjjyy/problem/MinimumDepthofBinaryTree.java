package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/">二叉树的最小深度</a>
 *
 * <p>给定一个二叉树，找出其最小深度。</p>
 *
 * <p>最小深度是从根节点到最近叶子节点的最短路径上的节点数量。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <p>给定二叉树&nbsp;<code>[3,9,20,null,null,15,7]</code>,</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7</pre>
 *
 * <p>返回它的最小深度 &nbsp;2.</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 *   <li>maximum-depth-of-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 111,
    name = "minimum-depth-of-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class MinimumDepthofBinaryTree {
}
