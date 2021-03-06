package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/island-perimeter/">岛屿的周长</a>
 *
 * <p>给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地&nbsp;0 表示水域。</p>
 *
 * <p>网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。</p>
 *
 * <p>岛屿中没有&ldquo;湖&rdquo;（&ldquo;湖&rdquo; 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 :</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * <strong>输出:</strong> 16
 *
 * <strong>解释:</strong> 它的周长是下面图片中的 16 个黄色的边：
 *
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/island.png">
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>max-area-of-island</li>
 *   <li>flood-fill</li>
 *   <li>coloring-a-border</li>
 * </ul>
 */
@Problem(
    id = 463,
    name = "island-perimeter",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE}
)
public class IslandPerimeter {
}
