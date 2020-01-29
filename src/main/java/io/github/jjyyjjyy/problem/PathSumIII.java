package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/path-sum-iii/">路径总和 III</a>
 *
 * <p>给定一个二叉树，它的每个结点都存放着一个整数值。</p>
 *
 * <p>找出路径和等于给定数值的路径总数。</p>
 *
 * <p>路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。</p>
 *
 * <p>二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     <strong>5</strong>   <strong>-3</strong>
 *    <strong>/</strong> <strong>\</strong>    <strong>\</strong>
 *   <strong>3</strong>   <strong>2</strong>   <strong>11</strong>
 *  / \   <strong>\</strong>
 * 3  -2   <strong>1</strong>
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -&gt; 3
 * 2.  5 -&gt; 2 -&gt; 1
 * 3.  -3 -&gt; 11
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum</li>
 *   <li>path-sum-ii</li>
 *   <li>path-sum-iv</li>
 *   <li>longest-univalue-path</li>
 * </ul>
 */
@Problem(
    id = 437,
    name = "path-sum-iii",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class PathSumIII {
}
