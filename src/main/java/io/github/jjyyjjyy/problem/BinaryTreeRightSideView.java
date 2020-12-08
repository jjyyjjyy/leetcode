package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-right-side-view/">二叉树的右视图</a>
 *
 * <p>给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;[1,2,3,null,5,null,4]
 * <strong>输出:</strong>&nbsp;[1, 3, 4]
 * <strong>解释:
 * </strong>
 *    1            &lt;---
 *  /   \
 * 2     3         &lt;---
 *  \     \
 *   5     4       &lt;---
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>populating-next-right-pointers-in-each-node</li>
 *   <li>boundary-of-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 199,
    name = "binary-tree-right-side-view",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class BinaryTreeRightSideView {

    /**
     * BFS
     * 层序遍历, 找到每一层最后一个元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (i == size - 1) {
                    result.add(current.val);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return result;
    }

    /**
     * DFS
     * 1. 递归先遍历右子树, 再遍历左子树.
     * 2. 如果当前深度与size相同, 则说明还没有加入元素, 将当前节点元素加入到结果集中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root, 0);
        return result;
    }

    private void dfs(List<Integer> result, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (result.size() == depth) {
            result.add(root.val);
        }
        depth++;
        dfs(result, root.right, depth);
        dfs(result, root.left, depth);
    }
}
