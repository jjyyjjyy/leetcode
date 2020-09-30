package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/valid-sudoku/">有效的数独</a>
 *
 * <p>判断一个&nbsp;9x9 的数独是否有效。只需要<strong>根据以下规则</strong>，验证已经填入的数字是否有效即可。</p>
 *
 * <ol>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一行只能出现一次。</li>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一列只能出现一次。</li>
 * 	<li>数字&nbsp;<code>1-9</code>&nbsp;在每一个以粗实线分隔的&nbsp;<code>3x3</code>&nbsp;宫内只能出现一次。</li>
 * </ol>
 *
 * <p><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height: 250px; width: 250px;"></p>
 *
 * <p><small>上图是一个部分填充的有效的数独。</small></p>
 *
 * <p>数独部分空格内已填入了数字，空白格用&nbsp;<code>&#39;.&#39;</code>&nbsp;表示。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 *   [&quot;5&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;],
 *   [&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;,&quot;9&quot;,&quot;5&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;],
 *   [&quot;.&quot;,&quot;9&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;],
 *   [&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;3&quot;],
 *   [&quot;4&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;],
 *   [&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;],
 *   [&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;8&quot;,&quot;.&quot;],
 *   [&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;4&quot;,&quot;1&quot;,&quot;9&quot;,&quot;.&quot;,&quot;.&quot;,&quot;5&quot;],
 *   [&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;9&quot;]
 * ]
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; [&quot;8&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;],
 * &nbsp; [&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;,&quot;9&quot;,&quot;5&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;],
 * &nbsp; [&quot;.&quot;,&quot;9&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;],
 * &nbsp; [&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;3&quot;],
 * &nbsp; [&quot;4&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;],
 * &nbsp; [&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;],
 * &nbsp; [&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;8&quot;,&quot;.&quot;],
 * &nbsp; [&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;4&quot;,&quot;1&quot;,&quot;9&quot;,&quot;.&quot;,&quot;.&quot;,&quot;5&quot;],
 * &nbsp; [&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;9&quot;]
 * ]
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 除了第一行的第一个数字从<strong> 5</strong> 改为 <strong>8 </strong>以外，空格内其他数字均与 示例1 相同。
 *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>一个有效的数独（部分已被填充）不一定是可解的。</li>
 * 	<li>只需要根据以上规则，验证已经填入的数字是否有效即可。</li>
 * 	<li>给定数独序列只包含数字&nbsp;<code>1-9</code>&nbsp;和字符&nbsp;<code>&#39;.&#39;</code>&nbsp;。</li>
 * 	<li>给定数独永远是&nbsp;<code>9x9</code>&nbsp;形式的。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sudoku-solver</li>
 * </ul>
 */
@Problem(
    id = 36,
    name = "valid-sudoku",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE}
)
public class ValidSudoku {

    /**
     * 1. 创建三个数组, 保存所有的行&列&分组. 每个元素属于的分组编号为 stem:[i / 3 * 3 + j / 3] .
     * 2. 遍历数组, 将每个非空数字所在行&列&分组的值加1. 如果所在行&列&分组的值大于1, 说明之前有重复的数字, 返回false.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int num = c - '1';
                rows[i][num]++;
                columns[j][num]++;

                int boxIndex = i / 3 * 3 + j / 3;
                boxes[boxIndex][num]++;
                if (rows[i][num] > 1 || columns[j][num] > 1 || boxes[boxIndex][num] > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
