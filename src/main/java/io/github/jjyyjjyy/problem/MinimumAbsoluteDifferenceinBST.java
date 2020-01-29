package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/">二叉搜索树的最小绝对差</a>
 *
 * <p>给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。</p>
 *
 * <p><strong>示例 :</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * <strong>输出:</strong>
 * 1
 *
 * <strong>解释:
 * </strong>最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 * </pre>
 *
 * <p><strong>注意: </strong>树中至少有2个节点。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>k-diff-pairs-in-an-array</li>
 * </ul>
 */
@Problem(
    id = 530,
    name = "minimum-absolute-difference-in-bst",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class MinimumAbsoluteDifferenceinBST {
}
