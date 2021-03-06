package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/path-sum/">路径总和</a>
 *
 * <p>给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例:</strong>&nbsp;<br>
 * 给定如下二叉树，以及目标和 <code>sum = 22</code>，</p>
 *
 * <pre>              <strong>5</strong>
 *              / \
 *             <strong>4 </strong>  8
 *            /   / \
 *           <strong>11 </strong> 13  4
 *          /  \      \
 *         7    <strong>2</strong>      1
 * </pre>
 *
 * <p>返回 <code>true</code>, 因为存在目标和为 22 的根节点到叶子节点的路径 <code>5-&gt;4-&gt;11-&gt;2</code>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>path-sum-ii</li>
 *   <li>binary-tree-maximum-path-sum</li>
 *   <li>sum-root-to-leaf-numbers</li>
 *   <li>path-sum-iii</li>
 *   <li>path-sum-iv</li>
 * </ul>
 */
@Problem(
    id = 112,
    name = "path-sum",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        return false;
    }
}
