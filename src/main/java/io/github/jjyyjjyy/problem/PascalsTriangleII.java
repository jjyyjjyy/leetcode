package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/pascals-triangle-ii/">杨辉三角 II</a>
 *
 * <p>给定一个非负索引&nbsp;<em>k</em>，其中 <em>k</em>&nbsp;&le;&nbsp;33，返回杨辉三角的第 <em>k </em>行。</p>
 *
 * <p><img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif"></p>
 *
 * <p><small>在杨辉三角中，每个数是它左上方和右上方的数的和。</small></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 3
 * <strong>输出:</strong> [1,3,3,1]
 * </pre>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <p>你可以优化你的算法到 <em>O</em>(<em>k</em>) 空间复杂度吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>pascals-triangle</li>
 * </ul>
 */
@Problem(
    id = 119,
    name = "pascals-triangle-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class PascalsTriangleII {

    /**
     * 每一行元素: stem:[C((1),(n)), C((2),(n)), C((3),(n)), ..., C((k),(n))]
     * 每列元素值: stem:[C((k),(n))=C((k-1),(n))xx(n-k+1)/k]
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        result.add(1);
        long pre = 1;
        for (int k = 1; k < rowIndex + 1; k++) {
            long cur = pre * (rowIndex - k + 1) / k;
            result.add((int) cur);
            pre = cur;
        }
        return result;
    }

    /**
     * 从后向前遍历, 第j位的值等于第j-1位加上第j位之和.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        result.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
            result.add(1);
        }
        return result;
    }
}
