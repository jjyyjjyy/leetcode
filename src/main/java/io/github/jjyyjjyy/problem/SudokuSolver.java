package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sudoku-solver/">解数独</a>
 *
 * <p>编写一个程序，通过已填充的空格来解决数独问题。</p>
 *
 * <p>一个数独的解法需<strong>遵循如下规则</strong>：</p>
 *
 * <ol>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一行只能出现一次。</li>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一列只能出现一次。</li>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一个以粗实线分隔的&nbsp;<code>3x3</code>&nbsp;宫内只能出现一次。</li>
 * </ol>
 *
 * <p>空白格用&nbsp;<code>&#39;.&#39;</code>&nbsp;表示。</p>
 *
 * <p><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png"></p>
 *
 * <p><small>一个数独。</small></p>
 *
 * <p><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png"></p>
 *
 * <p><small>答案被标成红色。</small></p>
 *
 * <p><strong>Note:</strong></p>
 *
 * <ul>
 * 	<li>给定的数独序列只包含数字&nbsp;<code>1-9</code>&nbsp;和字符&nbsp;<code>&#39;.&#39;</code>&nbsp;。</li>
 * 	<li>你可以假设给定的数独只有唯一解。</li>
 * 	<li>给定数独永远是&nbsp;<code>9x9</code>&nbsp;形式的。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>valid-sudoku</li>
 *   <li>unique-paths-iii</li>
 * </ul>
 */
@Problem(
    id = 37,
    name = "sudoku-solver",
    difficulty = Difficulty.HARD,
    tags = {Tag.HASH_TABLE, Tag.BACKTRACKING}
)
public class SudokuSolver {
}
