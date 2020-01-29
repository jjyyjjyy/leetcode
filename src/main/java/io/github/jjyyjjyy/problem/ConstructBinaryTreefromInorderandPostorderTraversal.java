package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">从中序与后序遍历序列构造二叉树</a>
 *
 * <p>根据一棵树的中序遍历与后序遍历构造二叉树。</p>
 *
 * <p><strong>注意:</strong><br>
 * 你可以假设树中没有重复的元素。</p>
 *
 * <p>例如，给出</p>
 *
 * <pre>中序遍历 inorder =&nbsp;[9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]</pre>
 *
 * <p>返回如下的二叉树：</p>
 *
 * <pre>    3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>construct-binary-tree-from-preorder-and-inorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 106,
    name = "construct-binary-tree-from-inorder-and-postorder-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.ARRAY}
)
public class ConstructBinaryTreefromInorderandPostorderTraversal {
}
