package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/count-good-meals/">大餐计数</a>
 *
 * <p><strong>大餐</strong> 是指 <strong>恰好包含两道不同餐品</strong> 的一餐，其美味程度之和等于 2 的幂。</p>
 *
 * <p>你可以搭配 <strong>任意</strong> 两道餐品做一顿大餐。</p>
 *
 * <p>给你一个整数数组 <code>deliciousness</code> ，其中 <code>deliciousness[i]</code> 是第 <code>i<sup>​​​​​​</sup>​​​​</code>​​​​ 道餐品的美味程度，返回你可以用数组中的餐品做出的不同 <strong>大餐</strong> 的数量。结果需要对 <code>10<sup>9</sup> + 7</code> 取余。</p>
 *
 * <p>注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>deliciousness = [1,3,5,7,9]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>大餐的美味程度组合为 (1,3) 、(1,7) 、(3,5) 和 (7,9) 。
 * 它们各自的美味程度之和分别为 4 、8 、8 和 16 ，都是 2 的幂。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>deliciousness = [1,1,1,3,3,3,7]
 * <strong>输出：</strong>15
 * <strong>解释：</strong>大餐的美味程度组合为 3 种 (1,1) ，9 种 (1,3) ，和 3 种 (1,7) 。</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 <= deliciousness.length <= 10<sup>5</sup></code></li>
 * 	<li><code>0 <= deliciousness[i] <= 2<sup>20</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1830,
    name = "count-good-meals",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class CountGoodMeals {

    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int countPairs(int[] deliciousness) {
        int max = Arrays.stream(deliciousness).max().getAsInt() * 2;
        int mod = 1000000007;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : deliciousness) {
            for (int j = 1; j <= max; j <<= 1) {
                Integer count = map.getOrDefault(j - val, 0);
                result = (result + count) % mod;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return result;
    }
}
