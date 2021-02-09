package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/subarrays-with-k-different-integers/">K 个不同整数的子数组</a>
 *
 * <p>给定一个正整数数组 <code>A</code>，如果 <code>A</code>&nbsp;的某个子数组中不同整数的个数恰好为 <code>K</code>，则称 <code>A</code> 的这个连续、不一定独立的子数组为<em>好子数组</em>。</p>
 *
 * <p>（例如，<code>[1,2,3,1,2]</code> 中有&nbsp;<code>3</code>&nbsp;个不同的整数：<code>1</code>，<code>2</code>，以及&nbsp;<code>3</code>。）</p>
 *
 * <p>返回&nbsp;<code>A</code>&nbsp;中<em>好子数组</em>的数目。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输出：</strong>A = [1,2,1,2,3], K = 2
 * <strong>输入：</strong>7
 * <strong>解释：</strong>恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,2,1,3,4], K = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 20000</code></li>
 * 	<li><code>1 &lt;= A[i] &lt;= A.length</code></li>
 * 	<li><code>1 &lt;= K &lt;= A.length</code></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-substring-without-repeating-characters</li>
 *   <li>longest-substring-with-at-most-two-distinct-characters</li>
 *   <li>longest-substring-with-at-most-k-distinct-characters</li>
 * </ul>
 */
@Problem(
    id = 1034,
    name = "subarrays-with-k-different-integers",
    difficulty = Difficulty.HARD,
    tags = {Tag.TWO_POINTERS, Tag.SLIDING_WINDOW}
)
public class SubarraysWithKDifferentIntegers {

    /**
     * K个不同子数组的数量 = 最多K个不同子数组的数量 - 最多K-1个不同子数组的数量
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int subarraysWithKDistinct(int[] A, int K) {
        return mostSubArrayWithKDistinct(A, K) - mostSubArrayWithKDistinct(A, K - 1);
    }

    private int mostSubArrayWithKDistinct(int[] arr, int k) {
        int result = 0;

        // 统计区间内不相同的数字个数
        int[] freq = new int[arr.length + 1];

        int left = 0;
        int right = 0;
        int count = 0;
        while (right < arr.length) {
            if (freq[arr[right]]++ == 0) {
                count++;
            }
            right++;
            while (count > k) {
                if (--freq[arr[left]] == 0) {
                    count--;
                }
                left++;
            }
            result += right - left;
        }
        return result;
    }
}
