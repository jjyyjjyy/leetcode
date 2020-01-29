package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/n-queens-ii/">N皇后 II</a>
 *
 * <p><em>n&nbsp;</em>皇后问题研究的是如何将 <em>n</em>&nbsp;个皇后放置在 <em>n</em>&times;<em>n</em> 的棋盘上，并且使皇后彼此之间不能相互攻击。</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/8-queens.png" style="height: 276px; width: 258px;"></p>
 *
 * <p><small>上图为 8 皇后问题的一种解法。</small></p>
 *
 * <p>给定一个整数 <em>n</em>，返回 <em>n</em> 皇后不同的解决方案的数量。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 4
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 4 皇后问题存在如下两个不同的解法。
 * [
 * &nbsp;[&quot;.Q..&quot;, &nbsp;// 解法 1
 * &nbsp; &quot;...Q&quot;,
 * &nbsp; &quot;Q...&quot;,
 * &nbsp; &quot;..Q.&quot;],
 *
 * &nbsp;[&quot;..Q.&quot;, &nbsp;// 解法 2
 * &nbsp; &quot;Q...&quot;,
 * &nbsp; &quot;...Q&quot;,
 * &nbsp; &quot;.Q..&quot;]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>n-queens</li>
 * </ul>
 */
@Problem(
    id = 52,
    name = "n-queens-ii",
    difficulty = Difficulty.HARD,
    tags = {Tag.BACKTRACKING}
)
public class NQueensII {
}
