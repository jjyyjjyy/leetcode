package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-right-side-view/">二叉树的右视图</a>
 *
 * <p>给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>&nbsp;[1,2,3,null,5,null,4]
 * <strong>输出:</strong>&nbsp;[1, 3, 4]
 * <strong>解释:
 * </strong>
 *    1            &lt;---
 *  /   \
 * 2     3         &lt;---
 *  \     \
 *   5     4       &lt;---
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>populating-next-right-pointers-in-each-node</li>
 *   <li>boundary-of-binary-tree</li>
 * </ul>
 */
@Problem(
    id = 199,
    name = "binary-tree-right-side-view",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        return null;
    }
}
