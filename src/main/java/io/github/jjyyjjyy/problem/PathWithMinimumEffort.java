package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/path-with-minimum-effort/">最小体力消耗路径</a>
 *
 * <p>你准备参加一场远足活动。给你一个二维 <code>rows x columns</code> 的地图 <code>heights</code> ，其中 <code>heights[row][col]</code> 表示格子 <code>(row, col)</code> 的高度。一开始你在最左上角的格子 <code>(0, 0)</code> ，且你希望去最右下角的格子 <code>(rows-1, columns-1)</code> （注意下标从 <strong>0</strong> 开始编号）。你每次可以往 <strong>上</strong>，<strong>下</strong>，<strong>左</strong>，<strong>右</strong> 四个方向之一移动，你想要找到耗费 <strong>体力</strong> 最小的一条路径。</p>
 *
 * <p>一条路径耗费的 <strong>体力值</strong> 是路径上相邻格子之间 <strong>高度差绝对值</strong> 的 <strong>最大值</strong> 决定的。</p>
 *
 * <p>请你返回从左上角走到右下角的最小<strong> 体力消耗值</strong> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex1.png" style="width: 300px; height: 300px;" /></p>
 *
 * <pre>
 * <b>输入：</b>heights = [[1,2,2],[3,8,2],[5,3,5]]
 * <b>输出：</b>2
 * <b>解释：</b>路径 [1,3,5,3,5] 连续格子的差值绝对值最大为 2 。
 * 这条路径比路径 [1,2,2,2,5] 更优，因为另一条路径差值最大值为 3 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex2.png" style="width: 300px; height: 300px;" /></p>
 *
 * <pre>
 * <b>输入：</b>heights = [[1,2,3],[3,8,4],[5,3,5]]
 * <b>输出：</b>1
 * <b>解释：</b>路径 [1,2,3,4,5] 的相邻格子差值绝对值最大为 1 ，比路径 [1,3,5,3,5] 更优。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex3.png" style="width: 300px; height: 300px;" />
 * <pre>
 * <b>输入：</b>heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
 * <b>输出：</b>0
 * <b>解释：</b>上图所示路径不需要消耗任何体力。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>rows == heights.length</code></li>
 * 	<li><code>columns == heights[i].length</code></li>
 * 	<li><code>1 <= rows, columns <= 100</code></li>
 * 	<li><code>1 <= heights[i][j] <= 10<sup>6</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1753,
    name = "path-with-minimum-effort",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND, Tag.GRAPH, Tag.BINARY_SEARCH}
)
public class PathWithMinimumEffort {

    /**
     * 1. 计算上下/左右边的权重, 按照权重大小排序.
     * 2. 依次遍历边, 加入到并查集里, 如果第一个和最后一个顶点在一个连通分量里, 则当前权重就是最后的结果.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(mn*log(mn))")
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int id = i * n + j;
                if (i > 0) {
                    edges.add(new int[]{id - n, id, Math.abs(heights[i][j] - heights[i - 1][j])});
                }
                if (j > 0) {
                    edges.add(new int[]{id - 1, id, Math.abs(heights[i][j] - heights[i][j - 1])});
                }
            }
        }
        edges.sort(Comparator.comparingInt(a -> a[2]));

        UnionFind unionFind = new UnionFind(m * n);
        int result = 0;
        for (int[] edge : edges) {
            unionFind.union(edge[0], edge[1]);
            if (unionFind.isConnected(0, m * n - 1)) {
                result = edge[2];
                break;
            }
        }

        return result;
    }

    private static class UnionFind {
        private final int[] ids;
        private final int[] ranks;

        public UnionFind(int n) {
            this.ids = new int[n];
            this.ranks = new int[n];
            for (int i = 0; i < n; i++) {
                this.ids[i] = i;
                this.ranks[i] = 1;
            }
        }

        public int find(int x) {
            if (x != ids[x]) {
                ids[x] = find(ids[x]);
            }
            return ids[x];
        }

        public void union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return;
            }
            if (ranks[x] < ranks[y]) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            ids[y] = x;
            ranks[x] += ranks[y];
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
