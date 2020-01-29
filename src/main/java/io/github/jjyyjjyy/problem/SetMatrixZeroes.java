package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/set-matrix-zeroes/">矩阵置零</a>
 *
 * <p>给定一个&nbsp;<em>m</em> x <em>n</em> 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用<strong><a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>算法<strong>。</strong></p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; [1,1,1],
 * &nbsp; [1,0,1],
 * &nbsp; [1,1,1]
 * ]
 * <strong>输出:</strong>
 * [
 * &nbsp; [1,0,1],
 * &nbsp; [0,0,0],
 * &nbsp; [1,0,1]
 * ]
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; [0,1,2,0],
 * &nbsp; [3,4,5,2],
 * &nbsp; [1,3,1,5]
 * ]
 * <strong>输出:</strong>
 * [
 * &nbsp; [0,0,0,0],
 * &nbsp; [0,4,5,0],
 * &nbsp; [0,3,1,0]
 * ]</pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <ul>
 * 	<li>一个直接的解决方案是使用 &nbsp;O(<em>m</em><em>n</em>)&nbsp;的额外空间，但这并不是一个好的解决方案。</li>
 * 	<li>一个简单的改进方案是使用 O(<em>m</em>&nbsp;+&nbsp;<em>n</em>) 的额外空间，但这仍然不是最好的解决方案。</li>
 * 	<li>你能想出一个常数空间的解决方案吗？</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>game-of-life</li>
 * </ul>
 */
@Problem(
    id = 73,
    name = "set-matrix-zeroes",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class SetMatrixZeroes {
}
