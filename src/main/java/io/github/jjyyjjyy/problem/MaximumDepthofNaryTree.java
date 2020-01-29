package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/">N叉树的最大深度</a>
 *
 * <p>给定一个 N 叉树，找到其最大深度。</p>
 *
 * <p>最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。</p>
 *
 * <p>例如，给定一个&nbsp;<code>3叉树</code>&nbsp;:</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/narytreeexample.png" style="width: 100%; max-width: 300px;"></p>
 *
 * <p>&nbsp;</p>
 *
 * <p>我们应返回其最大深度，3。</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>树的深度不会超过&nbsp;<code>1000</code>。</li>
 * 	<li>树的节点总不会超过&nbsp;<code>5000</code>。</li>
 * </ol>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-depth-of-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 774,
    name = "maximum-depth-of-n-ary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class MaximumDepthofNaryTree {
}
