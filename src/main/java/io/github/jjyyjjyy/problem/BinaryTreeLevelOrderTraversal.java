package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/">二叉树的层次遍历</a>
 *
 * <p>给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。</p>
 *
 * <p>例如:<br>
 * 给定二叉树:&nbsp;<code>[3,9,20,null,null,15,7]</code>,</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 *
 * <p>返回其层次遍历结果：</p>
 *
 * <pre>[
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-zigzag-level-order-traversal</li>
 *   <li>binary-tree-level-order-traversal-ii</li>
 *   <li>minimum-depth-of-binary-tree</li>
 *   <li>binary-tree-vertical-order-traversal</li>
 *   <li>average-of-levels-in-binary-tree</li>
 *   <li>n-ary-tree-level-order-traversal</li>
 *   <li>cousins-in-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 102,
    name = "binary-tree-level-order-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.BREADTH_FIRST_SEARCH}
)
public class BinaryTreeLevelOrderTraversal {
}
