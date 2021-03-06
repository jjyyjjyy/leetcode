package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/same-tree/">相同的树</a>
 *
 * <p>给定两个二叉树，编写一个函数来检验它们是否相同。</p>
 *
 * <p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入: </strong>      1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:  </strong>    1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong>       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * <strong>输出:</strong> false
 * </pre>
 */
@Problem(
    id = 100,
    name = "same-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
    }
}
