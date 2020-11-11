package io.github.jjyyjjyy.problem;

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

    public int nthUglyNumber(int n) {
        return 0;
    }
}
