package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;
    }
}
