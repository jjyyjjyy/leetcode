package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/symmetric-tree/">对称二叉树</a>
 *
 * <p>给定一个二叉树，检查它是否是镜像对称的。</p>
 *
 * <p>例如，二叉树&nbsp;<code>[1,2,2,3,4,4,3]</code> 是对称的。</p>
 *
 * <pre>    1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * </pre>
 *
 * <p>但是下面这个&nbsp;<code>[1,2,2,null,3,null,3]</code> 则不是镜像对称的:</p>
 *
 * <pre>    1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>如果你可以运用递归和迭代两种方法解决这个问题，会很加分。</p>
 */
@Problem(
    id = 101,
    name = "symmetric-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class SymmetricTree {

    /**
     * 递归遍历左右子树, 判断是否 left.left == right.right && left.right == right.left.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSymmetric(root.left, root.right);
    }

    /**
     * 1. 维护一个队列, 首先加入root的左右子树.
     * 2. 将队列最后两个子树取出, 判断两个子树是否相等.
     * 2.1. 如果不相等, 则返回false.
     * 2.2. 如果相等再分别将left.left&right.right和left.right&right.left放入队列中.
     * 3. 重复步骤2, 直到队列为空.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || !Objects.equals(left.val, right.val)) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || !Objects.equals(left.val, right.val)) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
