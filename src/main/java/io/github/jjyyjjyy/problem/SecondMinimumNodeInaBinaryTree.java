package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/">二叉树中第二小的节点</a>
 *
 * <p>给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为&nbsp;<code>2</code>&nbsp;或&nbsp;<code>0</code>。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。&nbsp;</p>
 *
 * <p>给出这样的一个二叉树，你需要输出所有节点中的<strong>第二小的值。</strong>如果第二小的值不存在的话，输出 -1 <strong>。</strong></p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *     2
 *    / \
 *   2   5
 *      / \
 *     5   7
 *
 * <strong>输出:</strong> 5
 * <strong>说明:</strong> 最小的值是 2 ，第二小的值是 5 。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 *     2
 *    / \
 *   2   2
 *
 * <strong>输出:</strong> -1
 * <strong>说明:</strong> 最小的值是 2, 但是不存在第二小的值。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>kth-smallest-element-in-a-bst</li>
 * </ul>
 */
@Problem(
    id = 671,
    name = "second-minimum-node-in-a-binary-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class SecondMinimumNodeInaBinaryTree {
}
