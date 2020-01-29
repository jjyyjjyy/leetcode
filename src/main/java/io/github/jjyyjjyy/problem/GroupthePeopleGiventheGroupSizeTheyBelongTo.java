package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/group-the-people-given-the-group-size-they-belong-to/">用户分组</a>
 *
 * <p>有&nbsp;<code>n</code>&nbsp;位用户参加活动，他们的&nbsp;<strong>ID</strong>&nbsp;从 <code>0</code> 到 <code>n - 1</code>，每位用户都 <strong>恰好</strong> 属于某一用户组。给你一个长度为 <code>n</code> 的数组&nbsp;<code>groupSizes</code>，其中包含每位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。</p>
 *
 * <p>你可以任何顺序返回解决方案，ID 的顺序也不受限制。此外，题目给出的数据保证至少存在一种解决方案。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>groupSizes = [3,3,3,3,3,1,3]
 * <strong>输出：</strong>[[5],[0,1,2],[3,4,6]]
 * <strong>解释：</strong>
 * 其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>groupSizes = [2,1,3,3,3,2]
 * <strong>输出：</strong>[[1],[0,5],[2,3,4]]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>groupSizes.length == n</code></li>
 * 	<li><code>1 &lt;= n&nbsp;&lt;= 500</code></li>
 * 	<li><code>1 &lt;=&nbsp;groupSizes[i] &lt;= n</code></li>
 * </ul>
 */
@Problem(
    id = 1407,
    name = "group-the-people-given-the-group-size-they-belong-to",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY}
)
public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
}
