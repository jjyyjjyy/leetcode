package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/excel-sheet-column-title/">Excel表列名称</a>
 *
 * <p>给定一个正整数，返回它在 Excel 表中相对应的列名称。</p>
 *
 * <p>例如，</p>
 *
 * <pre>    1 -&gt; A
 *     2 -&gt; B
 *     3 -&gt; C
 *     ...
 *     26 -&gt; Z
 *     27 -&gt; AA
 *     28 -&gt; AB
 *     ...
 * </pre>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1
 * <strong>输出:</strong> &quot;A&quot;
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 28
 * <strong>输出:</strong> &quot;AB&quot;
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> 701
 * <strong>输出:</strong> &quot;ZY&quot;
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>excel-sheet-column-number</li>
 * </ul>
 */
@Problem(
    id = 168,
    name = "excel-sheet-column-title",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class ExcelSheetColumnTitle {
}
