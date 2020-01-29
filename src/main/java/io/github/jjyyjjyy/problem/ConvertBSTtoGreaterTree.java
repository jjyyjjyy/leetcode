package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/convert-bst-to-greater-tree/">把二叉搜索树转换为累加树</a>
 *
 * <p>给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。</p>
 *
 * <p><strong>例如：</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> 二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * <strong>输出:</strong> 转换为累加树:
 *              18
 *             /   \
 *           20     13
 * </pre>
 */
@Problem(
    id = 538,
    name = "convert-bst-to-greater-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class ConvertBSTtoGreaterTree {
}
