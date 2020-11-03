package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/excel-sheet-column-number/">Excel表列序号</a>
 *
 * <p>给定一个Excel表格中的列名称，返回其相应的列序号。</p>
 *
 * <p>例如，</p>
 *
 * <pre>    A -&gt; 1
 *     B -&gt; 2
 *     C -&gt; 3
 *     ...
 *     Z -&gt; 26
 *     AA -&gt; 27
 *     AB -&gt; 28
 *     ...
 * </pre>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;A&quot;
 * <strong>输出:</strong> 1
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;AB&quot;
 * <strong>输出:</strong> 28
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入: </strong>&quot;ZY&quot;
 * <strong>输出:</strong> 701</pre>
 *
 * <p><strong>致谢：</strong><br>
 * 特别感谢&nbsp;<a href="http://leetcode.com/discuss/user/ts">@ts</a>&nbsp;添加此问题并创建所有测试用例。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>excel-sheet-column-title</li>
 * </ul>
 */
@Problem(
    id = 171,
    name = "excel-sheet-column-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        return 0;
    }
}
