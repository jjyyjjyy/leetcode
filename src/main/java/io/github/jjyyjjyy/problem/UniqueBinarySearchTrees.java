package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/unique-binary-search-trees/">不同的二叉搜索树</a>
 *
 * <p>给定一个整数 <em>n</em>，求以&nbsp;1 ...&nbsp;<em>n</em>&nbsp;为节点组成的二叉搜索树有多少种？</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 3
 * <strong>输出:</strong> 5
 * <strong>解释:
 * </strong>给定 <em>n</em> = 3, 一共有 5 种不同结构的二叉搜索树:
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>unique-binary-search-trees-ii</li>
 * </ul>
 */
@Problem(
    id = 96,
    name = "unique-binary-search-trees",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DYNAMIC_PROGRAMMING}
)
public class UniqueBinarySearchTrees {

    /**
     * 当前节点的个数等于左边节点的个数乘以右侧节点的个数.
     * a[i]=a[i-1]*a[n-i]
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                nums[i] += nums[j - 1] * nums[i - j];
            }
        }
        return nums[n];
    }
}
