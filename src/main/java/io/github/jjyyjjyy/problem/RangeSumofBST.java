package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-of-bst/">二叉搜索树的范围和</a>
 *
 * <p>给定二叉搜索树的根结点&nbsp;<code>root</code>，返回 <code>L</code> 和 <code>R</code>（含）之间的所有结点的值的和。</p>
 *
 * <p>二叉搜索树保证具有唯一的值。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>root = [10,5,15,3,7,null,18], L = 7, R = 15
 * <strong>输出：</strong>32
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * <strong>输出：</strong>23
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>树中的结点数量最多为&nbsp;<code>10000</code>&nbsp;个。</li>
 * 	<li>最终的答案保证小于&nbsp;<code>2^31</code>。</li>
 * </ol>
 */
@Problem(
    id = 975,
    name = "range-sum-of-bst",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.RECURSION}
)
public class RangeSumofBST {
}
