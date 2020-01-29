package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/">两数之和 IV - 输入 BST</a>
 *
 * <p>给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。</p>
 *
 * <p><strong>案例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>案例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * <strong>输出:</strong> False
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>two-sum</li>
 *   <li>two-sum-ii-input-array-is-sorted</li>
 *   <li>two-sum-iii-data-structure-design</li>
 *   <li>two-sum-bsts</li>
 * </ul>
 */
@Problem(
    id = 653,
    name = "two-sum-iv-input-is-a-bst",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class TwoSumIVInputisaBST {
}
