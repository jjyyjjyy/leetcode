package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/count-complete-tree-nodes/">完全二叉树的节点个数</a>
 *
 * <p>给出一个<strong>完全二叉树</strong>，求出该树的节点个数。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <p><a href="https://baike.baidu.com/item/%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91/7773232?fr=aladdin">完全二叉树</a>的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~&nbsp;2<sup>h</sup>&nbsp;个节点。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 *     1
 *    / \
 *   2   3
 *  / \  /
 * 4  5 6
 *
 * <strong>输出:</strong> 6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>closest-binary-search-tree-value</li>
 * </ul>
 */
@Problem(
    id = 222,
    name = "count-complete-tree-nodes",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.BINARY_SEARCH}
)
public class CountCompleteTreeNodes {

    @Complexity(Complexity.ComplexityType.O_N)
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    @Complexity(Complexity.ComplexityType.O_N)
    public int countNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                result++;
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
}
