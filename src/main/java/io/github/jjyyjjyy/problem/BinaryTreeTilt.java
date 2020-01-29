package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-tilt/">二叉树的坡度</a>
 *
 * <p>给定一个二叉树，计算<strong>整个树</strong>的坡度。</p>
 *
 * <p>一个树的<strong>节点的坡度</strong>定义即为，该节点左子树的结点之和和右子树结点之和的<strong>差的绝对值</strong>。空结点的的坡度是0。</p>
 *
 * <p><strong>整个树</strong>的坡度就是其所有节点的坡度之和。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *          1
 *        /   \
 *       2     3
 * <strong>输出:</strong> 1
 * <strong>解释:</strong>
 * 结点的坡度 2 : 0
 * 结点的坡度 3 : 0
 * 结点的坡度 1 : |2-3| = 1
 * 树的坡度 : 0 + 0 + 1 = 1
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>任何子树的结点的和不会超过32位整数的范围。</li>
 * 	<li>坡度的值不会超过32位整数的范围。</li>
 * </ol>
 */
@Problem(
    id = 563,
    name = "binary-tree-tilt",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class BinaryTreeTilt {
}
