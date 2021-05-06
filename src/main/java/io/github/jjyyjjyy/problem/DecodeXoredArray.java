package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/decode-xored-array/">解码异或后的数组</a>
 *
 * <p><strong>未知</strong> 整数数组 <code>arr</code> 由 <code>n</code> 个非负整数组成。</p>
 *
 * <p>经编码后变为长度为 <code>n - 1</code> 的另一个整数数组 <code>encoded</code> ，其中 <code>encoded[i] = arr[i] XOR arr[i + 1]</code> 。例如，<code>arr = [1,0,2,1]</code> 经编码后得到 <code>encoded = [1,2,3]</code> 。</p>
 *
 * <p>给你编码后的数组 <code>encoded</code> 和原数组 <code>arr</code> 的第一个元素 <code>first</code>（<code>arr[0]</code>）。</p>
 *
 * <p>请解码返回原数组 <code>arr</code> 。可以证明答案存在并且是唯一的。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>encoded = [1,2,3], first = 1
 * <strong>输出：</strong>[1,0,2,1]
 * <strong>解释：</strong>若 arr = [1,0,2,1] ，那么 first = 1 且 encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>encoded = [6,2,7,3], first = 4
 * <strong>输出：</strong>[4,2,0,7,4]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>2 <= n <= 10<sup>4</sup></code></li>
 * 	<li><code>encoded.length == n - 1</code></li>
 * 	<li><code>0 <= encoded[i] <= 10<sup>5</sup></code></li>
 * 	<li><code>0 <= first <= 10<sup>5</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1839,
    name = "decode-xored-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class DecodeXoredArray {

    /**
     * a^b=c => a^a^b=a^c=b
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }
}
