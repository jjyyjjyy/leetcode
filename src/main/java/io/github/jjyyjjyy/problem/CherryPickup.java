package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/cherry-pickup/">摘樱桃</a>
 *
 * <p>一个N x N的网格<code>(grid)</code>&nbsp;代表了一块樱桃地，每个格子由以下三种数字的一种来表示：</p>
 *
 * <ul>
 * 	<li>0 表示这个格子是空的，所以你可以穿过它。</li>
 * 	<li>1 表示这个格子里装着一个樱桃，你可以摘到樱桃然后穿过它。</li>
 * 	<li>-1 表示这个格子里有荆棘，挡着你的路。</li>
 * </ul>
 *
 * <p>你的任务是在遵守下列规则的情况下，尽可能的摘到最多樱桃：</p>
 *
 * <ul>
 * 	<li>从位置&nbsp;(0, 0) 出发，最后到达 (N-1, N-1) ，只能向下或向右走，并且只能穿越有效的格子（即只可以穿过值为0或者1的格子）；</li>
 * 	<li>当到达 (N-1, N-1) 后，你要继续走，直到返回到 (0, 0) ，只能向上或向左走，并且只能穿越有效的格子；</li>
 * 	<li>当你经过一个格子且这个格子包含一个樱桃时，你将摘到樱桃并且这个格子会变成空的（值变为0）；</li>
 * 	<li>如果在 (0, 0) 和 (N-1, N-1) 之间不存在一条可经过的路径，则没有任何一个樱桃能被摘到。</li>
 * </ul>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> grid =
 * [[0, 1, -1],
 *  [1, 0, -1],
 *  [1, 1,  1]]
 * <strong>输出:</strong> 5
 * <strong>解释：</strong>
 * 玩家从（0,0）点出发，经过了向下走，向下走，向右走，向右走，到达了点(2, 2)。
 * 在这趟单程中，总共摘到了4颗樱桃，矩阵变成了[[0,1,-1],[0,0,-1],[0,0,0]]。
 * 接着，这名玩家向左走，向上走，向上走，向左走，返回了起始点，又摘到了1颗樱桃。
 * 在旅程中，总共摘到了5颗樱桃，这是可以摘到的最大值了。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li><code>grid</code> 是一个&nbsp;<code>N</code> * <code>N</code> 的二维数组，N的取值范围是<code>1 &lt;= N &lt;= 50</code>。</li>
 * 	<li>每一个&nbsp;<code>grid[i][j]</code> 都是集合&nbsp;<code>{-1, 0, 1}</code>其中的一个数。</li>
 * 	<li>可以保证起点&nbsp;<code>grid[0][0]</code>&nbsp;和终点&nbsp;<code>grid[N-1][N-1]</code>&nbsp;的值都不会是 -1。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-path-sum</li>
 *   <li>dungeon-game</li>
 * </ul>
 */
@Problem(
    id = 741,
    name = "cherry-pickup",
    difficulty = Difficulty.HARD,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class CherryPickup {
}
