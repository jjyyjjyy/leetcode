package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/">N叉树的层序遍历</a>
 *
 * <p>给定一个 N 叉树，返回其节点值的<em>层序遍历</em>。 (即从左到右，逐层遍历)。</p>
 *
 * <p>例如，给定一个&nbsp;<code>3叉树</code>&nbsp;:</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/narytreeexample.png" style="width: 100%; max-width: 300px;"></p>
 *
 * <p>&nbsp;</p>
 *
 * <p>返回其层序遍历:</p>
 *
 * <pre>[
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>树的深度不会超过&nbsp;<code>1000</code>。</li>
 * 	<li>树的节点总数不会超过&nbsp;<code>5000</code>。</li>
 * </ol>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>binary-tree-level-order-traversal</li>
 *   <li>n-ary-tree-preorder-traversal</li>
 *   <li>n-ary-tree-postorder-traversal</li>
 * </ul>
 */
@Problem(
    id = 764,
    name = "n-ary-tree-level-order-traversal",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.BREADTH_FIRST_SEARCH}
)
public class NaryTreeLevelOrderTraversal {
}
