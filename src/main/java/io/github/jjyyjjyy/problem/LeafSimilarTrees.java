package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/leaf-similar-trees/">叶子相似的树</a>
 *
 * <p>请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个&nbsp;<em>叶值序列</em> 。</p>
 *
 * <p><img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png" style="height: 240px; width: 300px;"></p>
 *
 * <p>举个例子，如上图所示，给定一颗叶值序列为&nbsp;<code>(6, 7, 4, 9, 8)</code>&nbsp;的树。</p>
 *
 * <p>如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是&nbsp;<em>叶相似&nbsp;</em>的。</p>
 *
 * <p>如果给定的两个头结点分别为&nbsp;<code>root1</code> 和&nbsp;<code>root2</code>&nbsp;的树是叶相似的，则返回&nbsp;<code>true</code>；否则返回 <code>false</code> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>给定的两颗树可能会有&nbsp;<code>1</code>&nbsp;到&nbsp;<code>100</code>&nbsp;个结点。</li>
 * </ul>
 */
@Problem(
    id = 904,
    name = "leaf-similar-trees",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return false;
    }

}
