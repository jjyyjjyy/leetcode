package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

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

    private static final int MOD = 1000000007;

    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] rec = new int[n];
        System.arraycopy(nums1, 0, rec, 0, n);
        Arrays.sort(rec);
        int sum = 0, maxn = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int j = binarySearch(rec, nums2[i]);
            if (j < n) {
                maxn = Math.max(maxn, diff - (rec[j] - nums2[i]));
            }
            if (j > 0) {
                maxn = Math.max(maxn, diff - (nums2[i] - rec[j - 1]));
            }
        }
        return (sum - maxn + MOD) % MOD;
    }

    public int binarySearch(int[] rec, int target) {
        int low = 0, high = rec.length - 1;
        if (rec[high] < target) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (rec[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
