package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/increasing-order-search-tree/">递增顺序查找树</a>
 *
 * <p>给定一个树，<strong>按中序遍历</strong>重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 ：</strong></p>
 *
 * <pre><strong>输入：</strong>[5,3,6,2,4,null,8,1,null,null,null,7,9]
 *
 *        5
 *       / \
 *     3    6
 *    / \    \
 *   2   4    8
 * &nbsp;/        / \
 * 1        7   9
 *
 * <strong>输出：</strong>[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 *
 *  1
 * &nbsp; \
 * &nbsp;  2
 * &nbsp;   \
 * &nbsp;    3
 * &nbsp;     \
 * &nbsp;      4
 * &nbsp;       \
 * &nbsp;        5
 * &nbsp;         \
 * &nbsp;          6
 * &nbsp;           \
 * &nbsp;            7
 * &nbsp;             \
 * &nbsp;              8
 * &nbsp;               \
 *                  9  </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>给定树中的结点数介于 1 和&nbsp;100 之间。</li>
 * 	<li>每个结点都有一个从 0 到 1000 范围内的唯一整数值。</li>
 * </ol>
 */
@Problem(
    id = 933,
    name = "increasing-order-search-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class IncreasingOrderSearchTree {

    /**
     * 1. 左中右遍历树, 插入到集合里.
     * 2. 遍历集合, 一直向右添加节点.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inorder(list, root);

        TreeNode dummyNode = new TreeNode();
        TreeNode currentNode = dummyNode;
        for (TreeNode treeNode : list) {
            currentNode.right = treeNode;
            currentNode = treeNode;
            currentNode.left = null;
        }
        return dummyNode.right;
    }

    private void inorder(List<TreeNode> list, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(list, root.left);
        list.add(root);
        inorder(list, root.right);
    }

}
