package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-subarray-sum-with-one-deletion/">删除一次得到子数组最大和</a>
 *
 * <p>给你一个整数数组，返回它的某个&nbsp;<strong>非空</strong> 子数组（连续元素）在执行一次可选的删除操作后，所能得到的最大元素总和。</p>
 *
 * <p>换句话说，你可以从原数组中选出一个子数组，并可以决定要不要从中删除一个元素（只能删一次哦），（删除后）子数组中至少应当有一个元素，然后该子数组（剩下）的元素总和是所有子数组之中最大的。</p>
 *
 * <p>注意，删除一个元素后，子数组 <strong>不能为空</strong>。</p>
 *
 * <p>请看示例：</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,-2,0,3]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>我们可以选出 [1, -2, 0, 3]，然后删掉 -2，这样得到 [1, 0, 3]，和最大。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,-2,-2,3]
 * <strong>输出：</strong>3
 * <strong>解释：</strong>我们直接选出 [3]，这就是最大和。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [-1,-1,-1,-1]
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>最后得到的子数组不能为空，所以我们不能选择 [-1] 并从中删去 -1 来得到 0。
 *      我们应该直接选择 [-1]，或者选择 [-1, -1] 再从中删去一个 -1。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= arr.length &lt;= 10^5</code></li>
 * 	<li><code>-10^4 &lt;= arr[i] &lt;= 10^4</code></li>
 * </ul>
 */
@Problem(
    id = 1288,
    name = "maximum-subarray-sum-with-one-deletion",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class MaximumSubarraySumwithOneDeletion {
}
