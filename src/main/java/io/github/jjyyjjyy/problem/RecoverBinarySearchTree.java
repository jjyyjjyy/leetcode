package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/recover-binary-search-tree/">恢复二叉搜索树</a>
 *
 * <p>二叉搜索树中的两个节点被错误地交换。</p>
 *
 * <p>请在不改变其结构的情况下，恢复这棵树。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,3,null,null,2]
 *
 * &nbsp;  1
 * &nbsp; /
 * &nbsp;3
 * &nbsp; \
 * &nbsp;  2
 *
 * <strong>输出:</strong> [3,1,null,null,2]
 *
 * &nbsp;  3
 * &nbsp; /
 * &nbsp;1
 * &nbsp; \
 * &nbsp;  2
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,1,4,null,null,2]
 *
 *   3
 *  / \
 * 1   4
 * &nbsp;  /
 * &nbsp; 2
 *
 * <strong>输出:</strong> [2,1,4,null,null,3]
 *
 *   2
 *  / \
 * 1   4
 * &nbsp;  /
 *  &nbsp;3</pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <ul>
 * 	<li>使用 O(<em>n</em>) 空间复杂度的解法很容易实现。</li>
 * 	<li>你能想出一个只使用常数空间的解决方案吗？</li>
 * </ul>
 */
@Problem(
    id = 99,
    name = "recover-binary-search-tree",
    difficulty = Difficulty.HARD,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class RecoverBinarySearchTree {
}
