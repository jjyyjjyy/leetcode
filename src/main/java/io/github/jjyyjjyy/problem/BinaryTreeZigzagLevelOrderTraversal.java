package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/">二叉树的锯齿形层次遍历</a>
 *
 * <p>给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。</p>
 *
 * <p>例如：<br>
 * 给定二叉树&nbsp;<code>[3,9,20,null,null,15,7]</code>,</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 *
 * <p>返回锯齿形层次遍历如下：</p>
 *
 * <pre>[
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 * </ul>
 */
@Problem(
    id = 103,
    name = "binary-tree-zigzag-level-order-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.TREE, Tag.BREADTH_FIRST_SEARCH}
)
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return null;
    }
}
