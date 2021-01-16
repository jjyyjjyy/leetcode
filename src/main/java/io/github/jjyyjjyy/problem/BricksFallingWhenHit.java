package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/bricks-falling-when-hit/">打砖块</a>
 *
 * <p>我们有一组包含1和0的网格；其中1表示砖块。&nbsp;当且仅当一块砖直接连接到网格的顶部，或者它至少有一块相邻（4&nbsp;个方向之一）砖块不会掉落时，它才不会落下。</p>
 *
 * <p>我们会依次消除一些砖块。每当我们消除&nbsp;(i, j) 位置时， 对应位置的砖块（若存在）会消失，然后其他的砖块可能因为这个消除而落下。</p>
 *
 * <p>返回一个数组表示每次消除操作对应落下的砖块数目。</p>
 *
 * <pre><strong>示例 1：</strong>
 * <strong>输入：</strong>
 * grid = [[1,0,0,0],[1,1,1,0]]
 * hits = [[1,0]]
 * <strong>输出:</strong> [2]
 * <strong>解释: </strong>
 * 如果我们消除(1, 0)位置的砖块, 在(1, 1) 和(1, 2) 的砖块会落下。所以我们应该返回2。</pre>
 *
 * <pre><strong>示例 2：</strong>
 * <strong>输入：</strong>
 * grid = [[1,0,0,0],[1,1,0,0]]
 * hits = [[1,1],[1,0]]
 * <strong>输出：</strong>[0,0]
 * <strong>解释：</strong>
 * 当我们消除(1, 0)的砖块时，(1, 1)的砖块已经由于上一步消除而消失了。所以每次消除操作不会造成砖块落下。注意(1, 0)砖块不会记作落下的砖块。</pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li>网格的行数和列数的范围是[1, 200]。</li>
 * 	<li>消除的数字不会超过网格的区域。</li>
 * 	<li>可以保证每次的消除都不相同，并且位于网格的内部。</li>
 * 	<li>一个消除的位置可能没有砖块，如果这样的话，就不会有砖块落下。</li>
 * </ul>
 */
@Problem(
    id = 821,
    name = "bricks-falling-when-hit",
    difficulty = Difficulty.HARD,
    tags = {Tag.UNION_FIND}
)
public class BricksFallingWhenHit {

    public int[] hitBricks(int[][] grid, int[][] hits) {
        return null;

    }
}
