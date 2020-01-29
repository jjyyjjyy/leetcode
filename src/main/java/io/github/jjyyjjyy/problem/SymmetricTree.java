package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

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
}
