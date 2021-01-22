package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/add-to-array-form-of-integer/">数组形式的整数加法</a>
 *
 * <p>对于非负整数&nbsp;<code>X</code>&nbsp;而言，<em><code>X</code></em>&nbsp;的<em>数组形式</em>是每位数字按从左到右的顺序形成的数组。例如，如果&nbsp;<code>X = 1231</code>，那么其数组形式为&nbsp;<code>[1,2,3,1]</code>。</p>
 *
 * <p>给定非负整数 <code>X</code> 的数组形式&nbsp;<code>A</code>，返回整数&nbsp;<code>X+K</code>&nbsp;的数组形式。</p>
 *
 * <p>&nbsp;</p>
 *
 * <ol>
 * </ol>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,2,0,0], K = 34
 * <strong>输出：</strong>[1,2,3,4]
 * <strong>解释：</strong>1200 + 34 = 1234
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [2,7,4], K = 181
 * <strong>输出：</strong>[4,5,5]
 * <strong>解释：</strong>274 + 181 = 455
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [2,1,5], K = 806
 * <strong>输出：</strong>[1,0,2,1]
 * <strong>解释：</strong>215 + 806 = 1021
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * <strong>输出：</strong>[1,0,0,0,0,0,0,0,0,0,0]
 * <strong>解释：</strong>9999999999 + 1 = 10000000000
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 10000</code></li>
 * 	<li><code>0 &lt;= A[i] &lt;= 9</code></li>
 * 	<li><code>0 &lt;= K &lt;= 10000</code></li>
 * 	<li>如果&nbsp;<code>A.length &gt; 1</code>，那么&nbsp;<code>A[0] != 0</code></li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>add-two-numbers</li>
 *   <li>plus-one</li>
 *   <li>add-binary</li>
 *   <li>add-strings</li>
 * </ul>
 */
@Problem(
    id = 1031,
    name = "add-to-array-form-of-integer",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class AddToArrayFormOfInteger {

    /**
     * 从后向前遍历, 相加得到结果.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();
        int t = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int current = A[i] + K % 10 + t;
            result.addFirst(current % 10);
            t = current / 10;
            K /= 10;
        }
        while (K > 0 || t > 0) {
            int current = K % 10 + t;
            result.addFirst(current % 10);
            t = current / 10;
            K /= 10;
        }
        return result;
    }
}
