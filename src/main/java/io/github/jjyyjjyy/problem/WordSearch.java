package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/word-search/">单词搜索</a>
 *
 * <p>给定一个二维网格和一个单词，找出该单词是否存在于网格中。</p>
 *
 * <p>单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中&ldquo;相邻&rdquo;单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>board =
 * [
 *   [&#39;A&#39;,&#39;B&#39;,&#39;C&#39;,&#39;E&#39;],
 *   [&#39;S&#39;,&#39;F&#39;,&#39;C&#39;,&#39;S&#39;],
 *   [&#39;A&#39;,&#39;D&#39;,&#39;E&#39;,&#39;E&#39;]
 * ]
 *
 * 给定 word = &quot;<strong>ABCCED</strong>&quot;, 返回 <strong>true</strong>.
 * 给定 word = &quot;<strong>SEE</strong>&quot;, 返回 <strong>true</strong>.
 * 给定 word = &quot;<strong>ABCB</strong>&quot;, 返回 <strong>false</strong>.</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>word-search-ii</li>
 * </ul>
 */
@Problem(
    id = 79,
    name = "word-search",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BACKTRACKING}
)
public class WordSearch {

    private char[][] board;

    private char[] charArray;

    private boolean[][] marked;

    private int m;

    private int n;

    /**
     * 依次遍历矩阵, 将每个元素和其周围元素(上右下左方向)与给定字符做比较.
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        if (this.m == 0) {
            return false;
        }
        this.n = board[0].length;
        this.marked = new boolean[m][n];
        this.board = board;
        this.charArray = word.toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index) {
        int c = board[i][j];
        char target = charArray[index];
        if (index == charArray.length - 1 && c == target) {
            return true;
        }
        if (c == target) {
            marked[i][j] = true;
            index++;
            if (i > 0 && !marked[i - 1][j] && dfs(i - 1, j, index)) {
                return true;
            }
            if (j < n - 1 && !marked[i][j + 1] && dfs(i, j + 1, index)) {
                return true;
            }
            if (i < m - 1 && !marked[i + 1][j] && dfs(i + 1, j, index)) {
                return true;
            }
            if (j > 0 && !marked[i][j - 1] && dfs(i, j - 1, index)) {
                return true;
            }
            marked[i][j] = false;
        }
        return false;
    }

}
