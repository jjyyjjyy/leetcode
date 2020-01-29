package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-in-a-binary-search-tree/">二叉搜索树中的搜索</a>
 *
 * <p>给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。</p>
 *
 * <p>例如，</p>
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
 * 和值: 2
 * </pre>
 *
 * <p>你应该返回如下子树:</p>
 *
 * <pre>
 *       2
 *      / \
 *     1   3
 * </pre>
 *
 * <p>在上述示例中，如果要找的值是 <code>5</code>，但因为没有节点值为 <code>5</code>，我们应该返回 <code>NULL</code>。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>closest-binary-search-tree-value</li>
 *   <li>insert-into-a-binary-search-tree</li>
 * </ul>
 */
@Problem(
    id = 783,
    name = "search-in-a-binary-search-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE}
)
public class SearchinaBinarySearchTree {
}
