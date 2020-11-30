package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">从前序与中序遍历序列构造二叉树</a>
 *
 * <p>根据一棵树的前序遍历与中序遍历构造二叉树。</p>
 *
 * <p><strong>注意:</strong><br>
 * 你可以假设树中没有重复的元素。</p>
 *
 * <p>例如，给出</p>
 *
 * <pre>前序遍历 preorder =&nbsp;[3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]</pre>
 *
 * <p>返回如下的二叉树：</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>construct-binary-tree-from-inorder-and-postorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 105,
    name = "construct-binary-tree-from-preorder-and-inorder-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.ARRAY}
)
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private static final Map<Integer, Integer> indexes = new HashMap<>();

    /**
     * 前序遍历: 根左右
     * 中序遍历: 左根右
     * 1. 将中序遍历元素与索引关联关系暂存起来.
     * 2. 当前前序遍历第一个节点为根节点, 从中序遍历中找到根节点, 可以计算出左右子树的长度, 然后递归遍历左右子树.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        indexes.clear();
        for (int i = 0; i < n; i++) {
            indexes.put(inorder[i], i);
        }
        return buildTree(preorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode buildTree(int[] preorder, int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {
            return null;
        }
        int rootVal = preorder[preorderLeft];
        TreeNode root = new TreeNode(rootVal);

        int inorderRootIndex = indexes.get(rootVal);
        int leftCount = inorderRootIndex - inorderLeft;
        root.left = buildTree(preorder, preorderLeft + 1, preorderLeft + leftCount, inorderLeft, inorderRootIndex - 1);
        root.right = buildTree(preorder, preorderLeft + leftCount + 1, preorderRight, inorderRootIndex + 1, inorderRight);
        return root;
    }
}
