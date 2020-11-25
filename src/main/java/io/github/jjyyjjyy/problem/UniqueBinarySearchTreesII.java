package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 1. 依次遍历数字, 当前元素为root节点.
     * 2. 分别递归遍历左侧数字和右侧数字, 并分别从左右两侧遍历的结果和root组装成一个树.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "4^n/(sqrtn)")
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftResult = generateTrees(start, i - 1);
            List<TreeNode> rightResult = generateTrees(i + 1, end);
            for (TreeNode leftNode : leftResult) {
                for (TreeNode rightNode : rightResult) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
