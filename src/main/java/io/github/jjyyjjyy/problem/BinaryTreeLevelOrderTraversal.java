package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    @Complexity(Complexity.ComplexityType.O_N)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                current.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(current);
        }
        return result;
    }
}
