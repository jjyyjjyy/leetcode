package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/min-cost-to-connect-all-points/">连接所有点的最小费用</a>
 *
 * <p>给你一个<code>points</code>&nbsp;数组，表示 2D 平面上的一些点，其中&nbsp;<code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>&nbsp;。</p>
 *
 * <p>连接点&nbsp;<code>[x<sub>i</sub>, y<sub>i</sub>]</code> 和点&nbsp;<code>[x<sub>j</sub>, y<sub>j</sub>]</code>&nbsp;的费用为它们之间的 <strong>曼哈顿距离</strong>&nbsp;：<code>|x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> - y<sub>j</sub>|</code>&nbsp;，其中&nbsp;<code>|val|</code>&nbsp;表示&nbsp;<code>val</code>&nbsp;的绝对值。</p>
 *
 * <p>请你返回将所有点连接的最小总费用。只有任意两点之间 <strong>有且仅有</strong>&nbsp;一条简单路径时，才认为所有点都已连接。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2020/08/26/d.png" style="height:268px; width:214px" /></p>
 *
 * <pre>
 * <strong>输入：</strong>points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * <strong>输出：</strong>20
 * <strong>解释：
 * </strong><img alt="" src="https://assets.leetcode.com/uploads/2020/08/26/c.png" style="height:268px; width:214px" />
 * 我们可以按照上图所示连接所有点得到最小总费用，总费用为 20 。
 * 注意到任意两个点之间只有唯一一条路径互相到达。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>points = [[3,12],[-2,5],[-4,1]]
 * <strong>输出：</strong>18
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>points = [[0,0],[1,1],[1,0],[-1,1]]
 * <strong>输出：</strong>4
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>points = [[-1000000,-1000000],[1000000,1000000]]
 * <strong>输出：</strong>4000000
 * </pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>points = [[0,0]]
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= points.length &lt;= 1000</code></li>
 * 	<li><code>-10<sup>6</sup>&nbsp;&lt;= x<sub>i</sub>, y<sub>i</sub> &lt;= 10<sup>6</sup></code></li>
 * 	<li>所有点&nbsp;<code>(x<sub>i</sub>, y<sub>i</sub>)</code>&nbsp;两两不同。</li>
 * </ul>
 */
@Problem(
    id = 1706,
    name = "min-cost-to-connect-all-points",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.UNION_FIND}
)
public class MinCostToConnectAllPoints {

    private static int distance(int[][] points, int x, int y) {
        return Math.abs(points[x][0] - points[y][0]) + Math.abs(points[x][1] - points[y][1]);
    }

    /**
     * 最小生成树-Kruskal算法.
     * <p>
     * 1. 计算每个点的距离, 并将每个点之间的边按照长度排好序.
     * 2. 创建一个并查集.
     * 3. 遍历边, 尝试将边上的两点加入到并查集里.
     * 3.1. 如果已经加入过, 则不作处理.
     * 3.2. 如果将两点成功加入到并查集里, 则累加当前边的长度.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2_LOG_N)
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new Edge(i, j, distance(points, i, j)));
            }
        }
        UnionFind unionFind = new UnionFind(n);
        edges.sort(Comparator.comparingInt(a -> a.length));
        int result = 0;
        int num = 1;

        for (Edge edge : edges) {
            if (unionFind.union(edge.x, edge.y)) {
                result += edge.length;
                if (++num == n) {
                    // 此时已经遍历结束, 后面union肯定全返回false 可以提前退出.
                    break;
                }
            }
        }

        return result;
    }

    private static class Edge {
        private final int x;
        private final int y;
        private final int length;

        private Edge(int x, int y, int length) {
            this.x = x;
            this.y = y;
            this.length = length;
        }
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

        public boolean union(int x, int y) {
            int xId = find(x);
            int yId = find(y);
            if (xId == yId) {
                return false;
            }
            if (ranks[xId] < ranks[yId]) {
                int tmp = xId;
                xId = yId;
                yId = tmp;
            }
            ranks[xId] += ranks[yId];
            ids[yId] = xId;
            return true;
        }
    }
}
