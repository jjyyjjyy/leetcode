package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/">二叉树的层平均值</a>
 *
 * <p>给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * <strong>输出:</strong> [3, 14.5, 11]
 * <strong>解释:</strong>
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 * </pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>节点值的范围在32位有符号整数范围内。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 *   <li>binary-tree-level-order-traversal-ii</li>
 * </ul>
 */
@Problem(
    id = 637,
    name = "average-of-levels-in-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class AverageofLevelsinBinaryTree {
}
