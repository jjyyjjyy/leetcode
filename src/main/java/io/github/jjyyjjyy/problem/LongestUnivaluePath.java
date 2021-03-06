package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-univalue-path/">最长同值路径</a>
 *
 * <p>给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。</p>
 *
 * <p><strong>注意</strong>：两个节点之间的路径长度由它们之间的边数表示。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <p>输入:</p>
 *
 * <pre>
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * </pre>
 *
 * <p>输出:</p>
 *
 * <pre>
 * 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <p>输入:</p>
 *
 * <pre>
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * </pre>
 *
 * <p>输出:</p>
 *
 * <pre>
 * 2
 * </pre>
 *
 * <p><strong>注意:</strong> 给定的二叉树不超过10000个结点。&nbsp;树的高度不超过1000。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-maximum-path-sum</li>
 *   <li>count-univalue-subtrees</li>
 *   <li>path-sum-iii</li>
 * </ul>
 */
@Problem(
    id = 687,
    name = "longest-univalue-path",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.RECURSION}
)
public class LongestUnivaluePath {
}
