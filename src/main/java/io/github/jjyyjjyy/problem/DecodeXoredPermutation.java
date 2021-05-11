package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/decode-xored-permutation/">解码异或后的排列</a>
 *
 * <p>给你一个整数数组 <code>perm</code> ，它是前 <code>n</code> 个正整数的排列，且 <code>n</code> 是个 <strong>奇数</strong> 。</p>
 *
 * <p>它被加密成另一个长度为 <code>n - 1</code> 的整数数组 <code>encoded</code> ，满足 <code>encoded[i] = perm[i] XOR perm[i + 1]</code> 。比方说，如果 <code>perm = [1,3,2]</code> ，那么 <code>encoded = [2,1]</code> 。</p>
 *
 * <p>给你 <code>encoded</code> 数组，请你返回原始数组 <code>perm</code> 。题目保证答案存在且唯一。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><b>输入：</b>encoded = [3,1]
 * <b>输出：</b>[1,2,3]
 * <b>解释：</b>如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><b>输入：</b>encoded = [6,5,4,6]
 * <b>输出：</b>[2,4,1,5,3]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>3 &lt;= n &lt; 10<sup>5</sup></code></li>
 * 	<li><code>n</code> 是奇数。</li>
 * 	<li><code>encoded.length == n - 1</code></li>
 * </ul>
 */
@Problem(
    id = 1835,
    name = "decode-xored-permutation",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION}
)
public class DecodeXoredPermutation {

    /**
     * 1. encoded所有奇数位下标元素异或的结果等于第二位到n的异或结果, 再和1~n异或, 就得到第一个数.
     * 2. a ^ b = c => a ^ c = a ^ b ^ a = b, 所以找到第一个数, 就可以推断出后面的数.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }

        int[] result = new int[n];
        result[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }
}
