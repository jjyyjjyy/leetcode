package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-absolute-difference/">最小绝对差</a>
 *
 * <p>给你个整数数组&nbsp;<code>arr</code>，其中每个元素都 <strong>不相同</strong>。</p>
 *
 * <p>请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [4,2,1,3]
 * <strong>输出：</strong>[[1,2],[2,3],[3,4]]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,3,6,10,15]
 * <strong>输出：</strong>[[1,3]]
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [3,8,-10,23,19,-4,-14,27]
 * <strong>输出：</strong>[[-14,-10],[19,23],[23,27]]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>2 &lt;= arr.length &lt;= 10^5</code></li>
 * 	<li><code>-10^6 &lt;= arr[i] &lt;= 10^6</code></li>
 * </ul>
 */
@Problem(
    id = 1818,
    name = "minimum-absolute-difference",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class MinimumAbsoluteDifference {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        return -1;
    }

}
