package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/">有序矩阵中第K小的元素</a>
 *
 * <p>给定一个&nbsp;<em>n x n&nbsp;</em>矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。<br />
 * 请注意，它是排序后的第k小元素，而不是第k个元素。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 *
 * 返回 13。
 * </pre>
 *
 * <p><strong>说明: </strong><br />
 * 你可以假设 k 的值永远是有效的, 1 &le; k &le; n<sup>2&nbsp;</sup>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-k-pairs-with-smallest-sums</li>
 *   <li>kth-smallest-number-in-multiplication-table</li>
 *   <li>find-k-th-smallest-pair-distance</li>
 *   <li>k-th-smallest-prime-fraction</li>
 * </ul>
 */
@Problem(
    id = 378,
    name = "kth-smallest-element-in-a-sorted-matrix",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.BINARY_SEARCH}
)
public class KthSmallestElementinaSortedMatrix {
}
