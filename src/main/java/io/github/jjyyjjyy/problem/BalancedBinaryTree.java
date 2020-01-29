package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/balanced-binary-tree/">平衡二叉树</a>
 *
 * <p>给定一个二叉树，判断它是否是高度平衡的二叉树。</p>
 *
 * <p>本题中，一棵高度平衡二叉树定义为：</p>
 *
 * <blockquote>
 * <p>一个二叉树<em>每个节点&nbsp;</em>的左右两个子树的高度差的绝对值不超过1。</p>
 * </blockquote>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <p>给定二叉树 <code>[3,9,20,null,null,15,7]</code></p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7</pre>
 *
 * <p>返回 <code>true</code> 。<br>
 * <br>
 * <strong>示例 2:</strong></p>
 *
 * <p>给定二叉树 <code>[1,2,2,3,3,null,null,4,4]</code></p>
 *
 * <pre>       1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * </pre>
 *
 * <p>返回&nbsp;<code>false</code> 。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-depth-of-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 110,
    name = "balanced-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class BalancedBinaryTree {
}
