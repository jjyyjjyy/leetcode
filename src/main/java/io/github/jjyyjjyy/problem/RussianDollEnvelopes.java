package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/russian-doll-envelopes/">俄罗斯套娃信封问题</a>
 *
 * <p>给定一些标记了宽度和高度的信封，宽度和高度以整数对形式&nbsp;<code>(w, h)</code>&nbsp;出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。</p>
 *
 * <p>请计算最多能有多少个信封能组成一组&ldquo;俄罗斯套娃&rdquo;信封（即可以把一个信封放到另一个信封里面）。</p>
 *
 * <p><strong>说明:</strong><br>
 * 不允许旋转信封。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> envelopes = <code>[[5,4],[6,4],[6,7],[2,3]]</code>
 * <strong>输出:</strong> 3
 * <strong>解释:</strong> 最多信封的个数为 <code>3, 组合为: </code>[2,3] =&gt; [5,4] =&gt; [6,7]。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-increasing-subsequence</li>
 * </ul>
 */
@Problem(
    id = 354,
    name = "russian-doll-envelopes",
    difficulty = Difficulty.HARD,
    tags = {Tag.BINARY_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class RussianDollEnvelopes {

    /**
     * 1. 将数组第一维从小到大, 第二维从大到小排序.
     * 2. 定义状态数组dp, 设置每一位为1, 表示选择当前信封.
     * 3. 遍历数组:
     * 3.1. 遍历当前位置之前的元素, 如果第二维比当前小, 则说明可以被选择, dp[i]=max(dp[i],dp[j]+1)
     * 3.2. 比较并更新得到dp数组中最大的数值.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(envelopes, (e1, e2) -> e1[0] == e2[0] ? e2[1] - e1[1] : e1[0] - e2[0]);

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int result = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
