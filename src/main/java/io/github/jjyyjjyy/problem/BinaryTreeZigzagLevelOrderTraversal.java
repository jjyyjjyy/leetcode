package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    @Complexity(Complexity.ComplexityType.O_N)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean seq = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if (seq) {
                    currentLevel.add(currentNode.val);
                } else {
                    currentLevel.addFirst(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            seq = !seq;
            result.add(currentLevel);
        }
        return result;
    }
}
