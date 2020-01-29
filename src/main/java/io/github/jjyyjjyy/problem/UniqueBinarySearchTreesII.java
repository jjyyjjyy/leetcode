package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/unique-binary-search-trees-ii/">不同的二叉搜索树 II</a>
 *
 * <p>给定一个整数 <em>n</em>，生成所有由 1 ...&nbsp;<em>n</em> 为节点所组成的<strong>二叉搜索树</strong>。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 3
 * <strong>输出:</strong>
 * [
 * &nbsp; [1,null,3,2],
 * &nbsp; [3,2,null,1],
 * &nbsp; [3,1,null,null,2],
 * &nbsp; [2,1,3],
 * &nbsp; [1,null,2,null,3]
 * ]
 * <strong>解释:</strong>
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>unique-binary-search-trees</li>
 *   <li>different-ways-to-add-parentheses</li>
 * </ul>
 */
@Problem(
    id = 95,
    name = "unique-binary-search-trees-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DYNAMIC_PROGRAMMING}
)
public class UniqueBinarySearchTreesII {
}
