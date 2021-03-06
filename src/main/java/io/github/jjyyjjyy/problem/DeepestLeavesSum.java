package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/deepest-leaves-sum/">层数最深叶子节点的和</a>
 *
 * <p>给你一棵二叉树，请你返回层数最深的叶子节点的和。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/12/28/1483_ex1.png" style="height: 265px; width: 273px;"></strong></p>
 *
 * <pre><strong>输入：</strong>root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * <strong>输出：</strong>15
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>树中节点数目在&nbsp;<code>1</code>&nbsp;到&nbsp;<code>10^4</code>&nbsp;之间。</li>
 * 	<li>每个节点的值在&nbsp;<code>1</code>&nbsp;到&nbsp;<code>100</code> 之间。</li>
 * </ul>
 */
@Problem(
    id = 1254,
    name = "deepest-leaves-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class DeepestLeavesSum {
}
