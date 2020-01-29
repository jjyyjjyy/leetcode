package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/subtree-of-another-tree/">另一个树的子树</a>
 *
 * <p>给定两个非空二叉树 <strong>s</strong> 和 <strong>t</strong>，检验&nbsp;<strong>s</strong> 中是否包含和 <strong>t</strong> 具有相同结构和节点值的子树。<strong>s</strong> 的一个子树包括 <strong>s</strong> 的一个节点和这个节点的所有子孙。<strong>s</strong> 也可以看做它自身的一棵子树。</p>
 *
 * <p><strong>示例 1:</strong><br />
 * 给定的树 s:</p>
 *
 * <pre>
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * </pre>
 *
 * <p>给定的树 t：</p>
 *
 * <pre>
 *    4
 *   / \
 *  1   2
 * </pre>
 *
 * <p>返回 <strong>true</strong>，因为 t 与 s 的一个子树拥有相同的结构和节点值。</p>
 *
 * <p><strong>示例 2:</strong><br />
 * 给定的树 s：</p>
 *
 * <pre>
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * </pre>
 *
 * <p>给定的树 t：</p>
 *
 * <pre>
 *    4
 *   / \
 *  1   2
 * </pre>
 *
 * <p>返回 <strong>false</strong>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-univalue-subtrees</li>
 *   <li>most-frequent-subtree-sum</li>
 * </ul>
 */
@Problem(
    id = 572,
    name = "subtree-of-another-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class SubtreeofAnotherTree {
}
