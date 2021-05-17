package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/cousins-in-binary-tree/">二叉树的堂兄弟节点</a>
 *
 * <p>在二叉树中，根节点位于深度 <code>0</code> 处，每个深度为 <code>k</code> 的节点的子节点位于深度 <code>k+1</code> 处。</p>
 *
 * <p>如果二叉树的两个节点深度相同，但<strong>父节点不同</strong>，则它们是一对<em>堂兄弟节点</em>。</p>
 *
 * <p>我们给出了具有唯一值的二叉树的根节点 <code>root</code>，以及树中两个不同节点的值 <code>x</code> 和 <code>y</code>。</p>
 *
 * <p>只有与值 <code>x</code> 和 <code>y</code> 对应的节点是堂兄弟节点时，才返回 <code>true</code>。否则，返回 <code>false</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：<br>
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-01.png" style="height: 160px; width: 180px;"></strong></p>
 *
 * <pre><strong>输入：</strong>root = [1,2,3,4], x = 4, y = 3
 * <strong>输出：</strong>false
 * </pre>
 *
 * <p><strong>示例 2：<br>
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-02.png" style="height: 160px; width: 201px;"></strong></p>
 *
 * <pre><strong>输入：</strong>root = [1,2,3,null,4,null,5], x = 5, y = 4
 * <strong>输出：</strong>true
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-03.png" style="height: 160px; width: 156px;"></strong></p>
 *
 * <pre><strong>输入：</strong>root = [1,2,3,null,4], x = 2, y = 3
 * <strong>输出：</strong>false</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>二叉树的节点数介于&nbsp;<code>2</code> 到&nbsp;<code>100</code>&nbsp;之间。</li>
 * 	<li>每个节点的值都是唯一的、范围为&nbsp;<code>1</code> 到&nbsp;<code>100</code>&nbsp;的整数。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 * </ul>
 */
@Problem(
    id = 1035,
    name = "cousins-in-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.BREADTH_FIRST_SEARCH}
)
public class CousinsInBinaryTree {

    /**
     * BFS遍历树, 找到x和y的深度和父节点, 比较深度是否相同, 父节点是否不同
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depthX = 0;
        int depthY = 0;
        TreeNode xParent = null;
        TreeNode yParent = null;

        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = queue.poll();
                if (parent.left != null) {
                    if (parent.left.val == x) {
                        depthX = depth;
                        xParent = parent;
                    }
                    if (parent.left.val == y) {
                        depthY = depth;
                        yParent = parent;
                    }
                    queue.add(parent.left);
                }
                if (parent.right != null) {
                    if (parent.right.val == x) {
                        depthX = depth;
                        xParent = parent;
                    }
                    if (parent.right.val == y) {
                        depthY = depth;
                        yParent = parent;
                    }
                    queue.add(parent.right);
                }
            }
            depth++;
        }
        return depthX == depthY && xParent != yParent;
    }
}
