package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/n-queens/">N皇后</a>
 *
 * <p><em>n&nbsp;</em>皇后问题研究的是如何将 <em>n</em>&nbsp;个皇后放置在 <em>n</em>&times;<em>n</em> 的棋盘上，并且使皇后彼此之间不能相互攻击。</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/8-queens.png"></p>
 *
 * <p><small>上图为 8 皇后问题的一种解法。</small></p>
 *
 * <p>给定一个整数 <em>n</em>，返回所有不同的&nbsp;<em>n&nbsp;</em>皇后问题的解决方案。</p>
 *
 * <p>每一种解法包含一个明确的&nbsp;<em>n</em> 皇后问题的棋子放置方案，该方案中 <code>&#39;Q&#39;</code> 和 <code>&#39;.&#39;</code> 分别代表了皇后和空位。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 4
 * <strong>输出:</strong> [
 *  [&quot;.Q..&quot;,  // 解法 1
 *   &quot;...Q&quot;,
 *   &quot;Q...&quot;,
 *   &quot;..Q.&quot;],
 *
 *  [&quot;..Q.&quot;,  // 解法 2
 *   &quot;Q...&quot;,
 *   &quot;...Q&quot;,
 *   &quot;.Q..&quot;]
 * ]
 * <strong>解释:</strong> 4 皇后问题存在两个不同的解法。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>n-queens-ii</li>
 *   <li>grid-illumination</li>
 * </ul>
 */
@Problem(
    id = 51,
    name = "n-queens",
    difficulty = Difficulty.HARD,
    tags = {Tag.BACKTRACKING}
)
public class NQueens {
}
