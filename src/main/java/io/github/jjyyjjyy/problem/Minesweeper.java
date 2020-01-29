package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minesweeper/">扫雷游戏</a>
 *
 * <p>让我们一起来玩扫雷游戏！</p>
 *
 * <p>给定一个代表游戏板的二维字符矩阵。&nbsp;<strong>&#39;M&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>地雷，<strong>&#39;E&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>空方块，<strong>&#39;B&#39;&nbsp;</strong>代表没有相邻（上，下，左，右，和所有4个对角线）地雷的<strong>已挖出的</strong>空白方块，<strong>数字</strong>（&#39;1&#39; 到 &#39;8&#39;）表示有多少地雷与这块<strong>已挖出的</strong>方块相邻，<strong>&#39;X&#39;</strong>&nbsp;则表示一个<strong>已挖出的</strong>地雷。</p>
 *
 * <p>现在给出在所有<strong>未挖出的</strong>方块中（&#39;M&#39;或者&#39;E&#39;）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：</p>
 *
 * <ol>
 * 	<li>如果一个地雷（&#39;M&#39;）被挖出，游戏就结束了- 把它改为&nbsp;<strong>&#39;X&#39;</strong>。</li>
 * 	<li>如果一个<strong>没有相邻地雷</strong>的空方块（&#39;E&#39;）被挖出，修改它为（&#39;B&#39;），并且所有和其相邻的方块都应该被递归地揭露。</li>
 * 	<li>如果一个<strong>至少与一个地雷相邻</strong>的空方块（&#39;E&#39;）被挖出，修改它为数字（&#39;1&#39;到&#39;8&#39;），表示相邻地雷的数量。</li>
 * 	<li>如果在此次点击中，若无更多方块可被揭露，则返回面板。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入:</strong>
 *
 * [[&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 *  [&#39;E&#39;, &#39;E&#39;, &#39;M&#39;, &#39;E&#39;, &#39;E&#39;],
 *  [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 *  [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;]]
 *
 * Click : [3,0]
 *
 * <strong>输出:</strong>
 *
 * [[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]
 *
 * <strong>解释:</strong>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/minesweeper_example_1.png" style="width: 100%; max-width: 400px">
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入:</strong>
 *
 * [[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]
 *
 * Click : [1,2]
 *
 * <strong>输出:</strong>
 *
 * [[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;X&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 *  [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]
 *
 * <strong>解释:</strong>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/minesweeper_example_2.png" style="width: 100%; max-width: 400px">
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>输入矩阵的宽和高的范围为 [1,50]。</li>
 * 	<li>点击的位置只能是未被挖出的方块 (&#39;M&#39; 或者 &#39;E&#39;)，这也意味着面板至少包含一个可点击的方块。</li>
 * 	<li>输入面板不会是游戏结束的状态（即有地雷已被挖出）。</li>
 * 	<li>简单起见，未提及的规则在这个问题中可被忽略。例如，当游戏结束时你不需要挖出所有地雷，考虑所有你可能赢得游戏或标记方块的情况。</li>
 * </ol>
 */
@Problem(
    id = 529,
    name = "minesweeper",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH}
)
public class Minesweeper {
}
