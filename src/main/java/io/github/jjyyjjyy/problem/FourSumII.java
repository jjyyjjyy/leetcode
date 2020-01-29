package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/4sum-ii/">四数相加 II</a>
 *
 * <p>给定四个包含整数的数组列表&nbsp;A , B , C , D ,计算有多少个元组 <code>(i, j, k, l)</code>&nbsp;，使得&nbsp;<code>A[i] + B[j] + C[k] + D[l] = 0</code>。</p>
 *
 * <p>为了使问题简单化，所有的 A, B, C, D 具有相同的长度&nbsp;N，且 0 &le; N &le; 500 。所有整数的范围在 -2<sup>28</sup> 到 2<sup>28</sup> - 1 之间，最终结果不会超过&nbsp;2<sup>31</sup> - 1 。</p>
 *
 * <p><strong>例如:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 *
 * <strong>输出:</strong>
 * 2
 *
 * <strong>解释:</strong>
 * 两个元组如下:
 * 1. (0, 0, 0, 1) -&gt; A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -&gt; A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>4sum</li>
 * </ul>
 */
@Problem(
    id = 454,
    name = "4sum-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.BINARY_SEARCH}
)
public class FourSumII {
}
