package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/">在每个树行中找最大值</a>
 *
 * <p>您需要在二叉树的每一行中找到最大的值。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *
 *           1
 *          / \
 *         3   2
 *        / \   \
 *       5   3   9
 *
 * <strong>输出:</strong> [1, 3, 9]
 * </pre>
 */
@Problem(
    id = 515,
    name = "find-largest-value-in-each-tree-row",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class FindLargestValueinEachTreeRow {
}
