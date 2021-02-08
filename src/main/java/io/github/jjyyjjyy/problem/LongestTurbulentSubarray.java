package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/longest-turbulent-subarray/">最长湍流子数组</a>
 *
 * <p>当 <code>A</code>&nbsp;的子数组&nbsp;<code>A[i], A[i+1], ..., A[j]</code>&nbsp;满足下列条件时，我们称其为<em>湍流子数组</em>：</p>
 *
 * <ul>
 * 	<li>若&nbsp;<code>i &lt;= k &lt; j</code>，当 <code>k</code>&nbsp;为奇数时，&nbsp;<code>A[k] &gt; A[k+1]</code>，且当 <code>k</code> 为偶数时，<code>A[k] &lt; A[k+1]</code>；</li>
 * 	<li><strong>或 </strong>若&nbsp;<code>i &lt;= k &lt; j</code>，当 <code>k</code> 为偶数时，<code>A[k] &gt; A[k+1]</code>&nbsp;，且当 <code>k</code>&nbsp;为奇数时，&nbsp;<code>A[k] &lt; A[k+1]</code>。</li>
 * </ul>
 *
 * <p>也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。</p>
 *
 * <p>返回 <code>A</code> 的最大湍流子数组的<strong>长度</strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[9,4,2,10,7,8,8,1,9]
 * <strong>输出：</strong>5
 * <strong>解释：</strong>(A[1] &gt; A[2] &lt; A[3] &gt; A[4] &lt; A[5])
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[4,8,12,16]
 * <strong>输出：</strong>2
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>[100]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 40000</code></li>
 * 	<li><code>0 &lt;= A[i] &lt;= 10^9</code></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-subarray</li>
 * </ul>
 */
@Problem(
    id = 1020,
    name = "longest-turbulent-subarray",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.DYNAMIC_PROGRAMMING, Tag.SLIDING_WINDOW}
)
public class LongestTurbulentSubarray {

    /**
     * 1. 维护窗口左右两个指针.
     * 2. 依次遍历数组:
     * 2.1. 如果左指针和右指针在同一个位置, 如果当前位置和下一个位置元素相等, 则左右指针都右移一位, 否则只有右指针向右移一位.
     * 2.2. 如果当前位置符合湍流, 则右指针右移一位, 否则左指针移到当前位置.
     * 2.3. 计算当前窗口大小, 记录最大窗口长度.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int maxTurbulenceSize(int[] arr) {
        int max = 1;
        int left = 0;
        int right = 0;
        while (right < arr.length - 1) {
            if (right == left) {
                if (arr[left] == arr[left + 1]) {
                    left++;
                }
                right++;
            } else {
                if (arr[right - 1] < arr[right] && arr[right] > arr[right + 1] || arr[right - 1] > arr[right] && arr[right] < arr[right + 1]) {
                    right++;
                } else {
                    left = right;
                }
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
