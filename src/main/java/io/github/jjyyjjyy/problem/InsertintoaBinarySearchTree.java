package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/">二叉搜索树中的插入操作</a>
 *
 * <p>给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 保证原始二叉搜索树中不存在新值。</p>
 *
 * <p>注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。</p>
 *
 * <p>例如,&nbsp;</p>
 *
 * <pre>
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和 插入的值: 5
 * </pre>
 *
 * <p>你可以返回这个二叉搜索树:</p>
 *
 * <pre>
 *          4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 * </pre>
 *
 * <p>或者这个树也是有效的:</p>
 *
 * <pre>
 *          5
 *        /   \
 *       2     7
 *      / \
 *     1   3
 *          \
 *           4
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-a-binary-search-tree</li>
 * </ul>
 */
@Problem(
    id = 784,
    name = "insert-into-a-binary-search-tree",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE}
)
public class InsertintoaBinarySearchTree {
}
