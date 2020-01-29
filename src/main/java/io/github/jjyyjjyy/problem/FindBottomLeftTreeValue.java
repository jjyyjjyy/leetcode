package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-bottom-left-tree-value/">找树左下角的值</a>
 *
 * <p>给定一个二叉树，在树的最后一行找到最左边的值。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *
 *     2
 *    / \
 *   1   3
 *
 * <strong>输出:</strong>
 * 1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 2: </strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *
 *         1
 *        / \
 *       2   3
 *      /   / \
 *     4   5   6
 *        /
 *       7
 *
 * <strong>输出:</strong>
 * 7
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意:</strong> 您可以假设树（即给定的根节点）不为 <strong>NULL</strong>。</p>
 */
@Problem(
    id = 513,
    name = "find-bottom-left-tree-value",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class FindBottomLeftTreeValue {
}
