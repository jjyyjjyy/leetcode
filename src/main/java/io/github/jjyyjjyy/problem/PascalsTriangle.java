package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/pascals-triangle/">杨辉三角</a>
 *
 * <p>给定一个非负整数&nbsp;<em>numRows，</em>生成杨辉三角的前&nbsp;<em>numRows&nbsp;</em>行。</p>
 *
 * <p><img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif"></p>
 *
 * <p><small>在杨辉三角中，每个数是它左上方和右上方的数的和。</small></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 5
 * <strong>输出:</strong>
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>pascals-triangle-ii</li>
 * </ul>
 */
@Problem(
    id = 118,
    name = "pascals-triangle",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        return Collections.emptyList();
    }
}
