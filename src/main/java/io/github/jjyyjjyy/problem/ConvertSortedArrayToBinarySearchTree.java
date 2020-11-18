package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;
import io.github.jjyyjjyy.core.TreeNode;

/**
 * <a href="https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/">将有序数组转换为二叉搜索树</a>
 *
 * <p>将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。</p>
 *
 * <p>本题中，一个高度平衡二叉树是指一个二叉树<em>每个节点&nbsp;</em>的左右两个子树的高度差的绝对值不超过 1。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>convert-sorted-list-to-binary-search-tree</li>
 * </ul>
 */
@Problem(
    id = 108,
    name = "convert-sorted-array-to-binary-search-tree",
    difficulty = Difficulty.EASY,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }

}
