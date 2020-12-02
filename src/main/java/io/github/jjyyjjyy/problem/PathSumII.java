package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/path-sum-ii/">路径总和 II</a>
 *
 * <p>给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例:</strong><br>
 * 给定如下二叉树，以及目标和&nbsp;<code>sum = 22</code>，</p>
 *
 * <pre>              <strong>5</strong>
 *              / \
 *             <strong>4</strong>   <strong>8</strong>
 *            /   / \
 *           <strong>11</strong>  13  <strong>4</strong>
 *          /  \    / \
 *         7    <strong>2</strong>  <strong>5</strong>   1
 * </pre>
 *
 * <p>返回:</p>
 *
 * <pre>[
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum</li>
 *   <li>binary-tree-paths</li>
 *   <li>path-sum-iii</li>
 *   <li>path-sum-iv</li>
 * </ul>
 */
@Problem(
    id = 113,
    name = "path-sum-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        return null;
    }
}
