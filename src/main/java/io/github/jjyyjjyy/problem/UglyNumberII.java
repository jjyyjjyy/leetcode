package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/ugly-number-ii/">丑数 II</a>
 *
 * <p>编写一个程序，找出第 <code>n</code> 个丑数。</p>
 *
 * <p>丑数就是只包含质因数&nbsp;<code>2, 3, 5</code> 的<strong>正整数</strong>。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> n = 10
 * <strong>输出:</strong> 12
 * <strong>解释: </strong><code>1, 2, 3, 4, 5, 6, 8, 9, 10, 12</code> 是前 10 个丑数。</pre>
 *
 * <p><strong>说明:&nbsp;</strong>&nbsp;</p>
 *
 * <ol>
 * 	<li><code>1</code>&nbsp;是丑数。</li>
 * 	<li><code>n</code>&nbsp;<strong>不超过</strong>1690。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-k-sorted-lists</li>
 *   <li>count-primes</li>
 *   <li>ugly-number</li>
 *   <li>perfect-squares</li>
 *   <li>super-ugly-number</li>
 * </ul>
 */
@Problem(
    id = 264,
    name = "ugly-number-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class UglyNumberII {

    private static final int CAPACITY = 1690;

    private static final int[] UGLY_NUMBERS = new int[CAPACITY];

    static {
        UGLY_NUMBERS[0] = 1;
        int ugly;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        for (int i = 1; i < CAPACITY; i++) {
            ugly = Math.min(Math.min(UGLY_NUMBERS[p2] * 2, UGLY_NUMBERS[p3] * 3), UGLY_NUMBERS[p5] * 5);
            UGLY_NUMBERS[i] = ugly;

            if (ugly == UGLY_NUMBERS[p2] * 2) {
                p2++;
            }
            if (ugly == UGLY_NUMBERS[p3] * 3) {
                p3++;
            }
            if (ugly == UGLY_NUMBERS[p5] * 5) {
                p5++;
            }
        }
    }

    /**
     * 计算出前1690个丑数, 然后根据索引直接取值即可.
     * <p>
     * 计算丑数的方法:
     * 1. 首先确定第一个数是1.
     * 2. 维护三个指针p2, p3, p5. 找到每个指针乘以因子的最小值, 放入数组中, 然后将该指针前进一位.
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public int nthUglyNumber(int n) {
        return UGLY_NUMBERS[n - 1];
    }
}
