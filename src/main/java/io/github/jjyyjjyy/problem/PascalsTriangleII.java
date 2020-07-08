package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Collections;
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

    public List<Integer> getRow(int rowIndex) {
        return Collections.emptyList();
    }
}
