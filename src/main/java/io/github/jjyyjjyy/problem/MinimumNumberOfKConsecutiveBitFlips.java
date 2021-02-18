package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/">K 连续位的最小翻转次数</a>
 *
 * <p>在仅包含 <code>0</code> 和 <code>1</code> 的数组 <code>A</code> 中，一次 <em><code>K</code> 位翻转</em>包括选择一个长度为 <code>K</code> 的（连续）子数组，同时将子数组中的每个 <code>0</code> 更改为 <code>1</code>，而每个 <code>1</code> 更改为 <code>0</code>。</p>
 *
 * <p>返回所需的 <code>K</code> 位翻转的次数，以便数组没有值为 <code>0</code> 的元素。如果不可能，返回 <code>-1</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [0,1,0], K = 1
 * <strong>输出：</strong>2
 * <strong>解释：</strong>先翻转 A[0]，然后翻转 A[2]。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,1,0], K = 2
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [0,0,0,1,0,1,1,0], K = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>
 * 翻转 A[0],A[1],A[2]:&nbsp;A变成 [1,1,1,1,0,1,1,0]
 * 翻转 A[4],A[5],A[6]:&nbsp;A变成 [1,1,1,1,1,0,0,0]
 * 翻转 A[5],A[6],A[7]:&nbsp;A变成 [1,1,1,1,1,1,1,1]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;=&nbsp;30000</code></li>
 * 	<li><code>1 &lt;= K &lt;= A.length</code></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>bulb-switcher</li>
 * </ul>
 */
@Problem(
    id = 1037,
    name = "minimum-number-of-k-consecutive-bit-flips",
    difficulty = Difficulty.HARD,
    tags = {Tag.GREEDY, Tag.SLIDING_WINDOW}
)
public class MinimumNumberOfKConsecutiveBitFlips {

    @Complexity(Complexity.ComplexityType.O_N)
    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int ans = 0, revCnt = 0;
        for (int i = 0; i < n; ++i) {
            if (i >= K && A[i - K] > 1) {
                revCnt ^= 1;
            }
            if (A[i] == revCnt) {
                if (i + K > n) {
                    return -1;
                }
                ++ans;
                revCnt ^= 1;
                A[i] += 2;
            }
        }
        return ans;
    }

    /**
     * 依次遍历数组, 如果当前元素是0则翻转后面K个元素
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int minKBitFlips2(int[] A, int K) {
        int result = 0;
        for (int i = 0; i < A.length - K + 1; i++) {
            if (A[i] == 1) {
                continue;
            }
            for (int j = 0; j < K; j++) {
                A[i + j] = 1 - A[i + j];
            }
            result++;
        }
        for (int i = 0; i < K; i++) {
            if (A[A.length - i - 1] == 0) {
                return -1;
            }
        }
        return result;
    }
}
