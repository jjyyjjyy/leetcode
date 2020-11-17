package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/">二叉树的层次遍历 II</a>
 *
 * <p>给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）</p>
 *
 * <p>例如：<br>
 * 给定二叉树 <code>[3,9,20,null,null,15,7]</code>,</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 *
 * <p>返回其自底向上的层次遍历为：</p>
 *
 * <pre>[
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 *   <li>average-of-levels-in-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 107,
    name = "binary-tree-level-order-traversal-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.BREADTH_FIRST_SEARCH}
)
public class BinaryTreeLevelOrderTraversalII {

    /**
     * 1. 维护一个先进先出的队列, 将root放入队列.
     * 2. 取出队列当前所有元素.
     * 3. 遍历所有元素, 如果有左右子树, 则加入到队列中.
     * 4. 重复步骤2.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> currentLevel = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.addFirst(currentLevel);
        }
        return result;
    }

}
