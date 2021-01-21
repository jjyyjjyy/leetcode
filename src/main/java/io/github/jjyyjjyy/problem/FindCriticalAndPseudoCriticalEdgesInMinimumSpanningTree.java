package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/">找到最小生成树里的关键边和伪关键边</a>
 *
 * <p>给你一个 <code>n</code>&nbsp;个点的带权无向连通图，节点编号为 <code>0</code>&nbsp;到 <code>n-1</code>&nbsp;，同时还有一个数组 <code>edges</code>&nbsp;，其中 <code>edges[i] = [from</code><code><sub>i</sub>, to<sub>i</sub>, weight<sub>i</sub>]</code>&nbsp;表示在&nbsp;<code>from<sub>i</sub></code>&nbsp;和&nbsp;<code>to<sub>i</sub></code>&nbsp;节点之间有一条带权无向边。最小生成树&nbsp;(MST) 是给定图中边的一个子集，它连接了所有节点且没有环，而且这些边的权值和最小。</p>
 *
 * <p>请你找到给定图中最小生成树的所有关键边和伪关键边。如果从图中删去某条边，会导致最小生成树的权值和增加，那么我们就说它是一条关键边。伪关键边则是可能会出现在某些最小生成树中但不会出现在所有最小生成树中的边。</p>
 *
 * <p>请注意，你可以分别以任意顺序返回关键边的下标和伪关键边的下标。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/ex1.png" style="height: 262px; width: 259px;"></p>
 *
 * <pre><strong>输入：</strong>n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
 * <strong>输出：</strong>[[0,1],[2,3,4,5]]
 * <strong>解释：</strong>上图描述了给定图。
 * 下图是所有的最小生成树。
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/msts.png" style="height: 553px; width: 540px;">
 * 注意到第 0 条边和第 1 条边出现在了所有最小生成树中，所以它们是关键边，我们将这两个下标作为输出的第一个列表。
 * 边 2，3，4 和 5 是所有 MST 的剩余边，所以它们是伪关键边。我们将它们作为输出的第二个列表。
 * </pre>
 *
 * <p><strong>示例 2 ：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/ex2.png" style="height: 253px; width: 247px;"></p>
 *
 * <pre><strong>输入：</strong>n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
 * <strong>输出：</strong>[[],[0,1,2,3]]
 * <strong>解释：</strong>可以观察到 4 条边都有相同的权值，任选它们中的 3 条可以形成一棵 MST 。所以 4 条边都是伪关键边。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>2 &lt;= n &lt;= 100</code></li>
 * 	<li><code>1 &lt;= edges.length &lt;= min(200, n * (n - 1) / 2)</code></li>
 * 	<li><code>edges[i].length == 3</code></li>
 * 	<li><code>0 &lt;= from<sub>i</sub> &lt; to<sub>i</sub> &lt; n</code></li>
 * 	<li><code>1 &lt;= weight<sub>i</sub>&nbsp;&lt;= 1000</code></li>
 * 	<li>所有 <code>(from<sub>i</sub>, to<sub>i</sub>)</code>&nbsp;数对都是互不相同的。</li>
 * </ul>
 */
@Problem(
    id = 1613,
    name = "find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree",
    difficulty = Difficulty.HARD,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND}
)
public class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m^2*α(n)")
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int m = edges.length;
        int[][] newEdges = new int[m][4];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < 3; ++j) {
                newEdges[i][j] = edges[i][j];
            }
            newEdges[i][3] = i;
        }
        Arrays.sort(newEdges, Comparator.comparingInt(u -> u[2]));

        // 计算 value
        UnionFind ufStd = new UnionFind(n);
        int value = 0;
        for (int i = 0; i < m; ++i) {
            if (ufStd.union(newEdges[i][0], newEdges[i][1])) {
                value += newEdges[i][2];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < m; ++i) {
            // 判断是否是关键边
            UnionFind uf = new UnionFind(n);
            int v = 0;
            for (int j = 0; j < m; ++j) {
                if (i != j && uf.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (uf.setCount != 1 || v > value) {
                ans.get(0).add(newEdges[i][3]);
                continue;
            }

            // 判断是否是伪关键边
            uf = new UnionFind(n);
            uf.union(newEdges[i][0], newEdges[i][1]);
            v = newEdges[i][2];
            for (int j = 0; j < m; ++j) {
                if (i != j && uf.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (v == value) {
                ans.get(1).add(newEdges[i][3]);
            }
        }

        return ans;
    }

    private static class UnionFind {
        private final int[] ids;
        private final int[] ranks;
        // 连通分量数量
        private int setCount;

        public UnionFind(int n) {
            this.setCount = n;
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
            if (ranks[xId] < ranks[xId]) {
                int tmp = xId;
                xId = yId;
                yId = tmp;
            }
            ids[yId] = xId;
            ranks[xId] += ranks[yId];
            setCount--;
            return true;
        }
    }
}
