package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/">移除最多的同行或同列石头</a>
 *
 * <p>在二维平面上，我们将石头放置在一些整数坐标点上。每个坐标点上最多只能有一块石头。<br>
 * <br>
 * 现在，<em>move</em> 操作将会移除与网格上的某一块石头共享一列或一行的一块石头。<br>
 * <br>
 * 我们最多能执行多少次 <em>move</em> 操作？</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
 * <strong>输出：</strong>5
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>stones = [[0,0]]
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= stones.length &lt;= 1000</code></li>
 * 	<li><code>0 &lt;= stones[i][j] &lt; 10000</code></li>
 * </ol>
 */
@Problem(
    id = 984,
    name = "most-stones-removed-with-same-row-or-column",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND}
)
public class MostStonesRemovedWithSameRowOrColumn {

    /**
     * 连通图的顶点可以减小到最后1个点, 所以最多可删除的点数等于点总数减去连通图中联通分量的个数.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public int removeStones(int[][] stones) {
        UnionFind unionFind = new UnionFind();
        int n = stones.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    unionFind.union(i, j);
                }
            }
        }
        int points = 0;
        for (int i = 0; i < n; i++) {
            if (unionFind.id[i] == i) {
                points++;
            }
        }
        return n - points;
    }

    private static class UnionFind {
        private final int[] id;

        public UnionFind() {
            this.id = new int[1000];
            for (int i = 0; i < 1000; i++) {
                id[i] = i;
            }
        }

        public void union(int x, int y) {
            id[find(x)] = find(y);
        }

        public int find(int i) {
            if (i != id[i]) {
                id[i] = find(id[i]);
            }
            return id[i];
        }
    }

}
