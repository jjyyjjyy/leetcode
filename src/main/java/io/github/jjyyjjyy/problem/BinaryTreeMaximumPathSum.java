package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/">二叉树中的最大路径和</a>
 *
 * <p>给定一个<strong>非空</strong>二叉树，返回其最大路径和。</p>
 *
 * <p>本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径<strong>至少包含一个</strong>节点，且不一定经过根节点。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 *
 *        <strong>1</strong>
 *       <strong>/ \</strong>
 *      <strong>2</strong>   <strong>3</strong>
 *
 * <strong>输出:</strong> 6
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [-10,9,20,null,null,15,7]
 *
 * &nbsp;  -10
 * &nbsp; &nbsp;/ \
 * &nbsp; 9 &nbsp;<strong>20</strong>
 * &nbsp; &nbsp; <strong>/ &nbsp;\</strong>
 * &nbsp; &nbsp;<strong>15 &nbsp; 7</strong>
 *
 * <strong>输出:</strong> 42</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum</li>
 *   <li>sum-root-to-leaf-numbers</li>
 *   <li>path-sum-iv</li>
 *   <li>longest-univalue-path</li>
 * </ul>
 */
@Problem(
    id = 124,
    name = "binary-tree-maximum-path-sum",
    difficulty = Difficulty.HARD,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class BinaryTreeMaximumPathSum {
}
