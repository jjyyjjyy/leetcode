package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-provinces/">省份数量</a>
 *
 * <div class="original__bRMd">
 * <div>
 * <p>有 <code>n</code> 个城市，其中一些彼此相连，另一些没有相连。如果城市 <code>a</code> 与城市 <code>b</code> 直接相连，且城市 <code>b</code> 与城市 <code>c</code> 直接相连，那么城市 <code>a</code> 与城市 <code>c</code> 间接相连。</p>
 *
 * <p><strong>省份</strong> 是一组直接或间接相连的城市，组内不含其他没有相连的城市。</p>
 *
 * <p>给你一个 <code>n x n</code> 的矩阵 <code>isConnected</code> ，其中 <code>isConnected[i][j] = 1</code> 表示第 <code>i</code> 个城市和第 <code>j</code> 个城市直接相连，而 <code>isConnected[i][j] = 0</code> 表示二者不直接相连。</p>
 *
 * <p>返回矩阵中 <strong>省份</strong> 的数量。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/graph1.jpg" style="width: 222px; height: 142px;" />
 * <pre>
 * <strong>输入：</strong>isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * <strong>输出：</strong>2
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/graph2.jpg" style="width: 222px; height: 142px;" />
 * <pre>
 * <strong>输入：</strong>isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 <= n <= 200</code></li>
 * 	<li><code>n == isConnected.length</code></li>
 * 	<li><code>n == isConnected[i].length</code></li>
 * 	<li><code>isConnected[i][j]</code> 为 <code>1</code> 或 <code>0</code></li>
 * 	<li><code>isConnected[i][i] == 1</code></li>
 * 	<li><code>isConnected[i][j] == isConnected[j][i]</code></li>
 * </ul>
 * </div>
 * </div>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>number-of-connected-components-in-an-undirected-graph</li>
 *   <li>robot-return-to-origin</li>
 *   <li>sentence-similarity</li>
 *   <li>sentence-similarity-ii</li>
 *   <li>the-earliest-moment-when-everyone-become-friends</li>
 * </ul>
 */
@Problem(
    id = 547,
    name = "number-of-provinces",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND}
)
public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        return 0;
    }

}
