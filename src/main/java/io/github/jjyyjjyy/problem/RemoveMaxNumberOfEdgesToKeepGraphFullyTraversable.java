package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/">保证图可完全遍历</a>
 *
 * <p>Alice 和 Bob 共有一个无向图，其中包含 n 个节点和 3&nbsp; 种类型的边：</p>
 *
 * <ul>
 * 	<li>类型 1：只能由 Alice 遍历。</li>
 * 	<li>类型 2：只能由 Bob 遍历。</li>
 * 	<li>类型 3：Alice 和 Bob 都可以遍历。</li>
 * </ul>
 *
 * <p>给你一个数组 <code>edges</code> ，其中 <code>edges[i] = [type<sub>i</sub>, u<sub>i</sub>, v<sub>i</sub>]</code>&nbsp;表示节点 <code>u<sub>i</sub></code> 和 <code>v<sub>i</sub></code> 之间存在类型为 <code>type<sub>i</sub></code> 的双向边。请你在保证图仍能够被 Alice和 Bob 完全遍历的前提下，找出可以删除的最大边数。如果从任何节点开始，Alice 和 Bob 都可以到达所有其他节点，则认为图是可以完全遍历的。</p>
 *
 * <p>返回可以删除的最大边数，如果 Alice 和 Bob 无法完全遍历图，则返回 -1 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/06/5510ex1.png" style="height: 191px; width: 179px;"></strong></p>
 *
 * <pre><strong>输入：</strong>n = 4, edges = [[3,1,2],[3,2,3],[1,1,3],[1,2,4],[1,1,2],[2,3,4]]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>如果删除<strong> </strong>[1,1,2] 和 [1,1,3] 这两条边，Alice 和 Bob 仍然可以完全遍历这个图。再删除任何其他的边都无法保证图可以完全遍历。所以可以删除的最大边数是 2 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/06/5510ex2.png" style="height: 190px; width: 178px;"></strong></p>
 *
 * <pre><strong>输入：</strong>n = 4, edges = [[3,1,2],[3,2,3],[1,1,4],[2,1,4]]
 * <strong>输出：</strong>0
 * <strong>解释：</strong>注意，删除任何一条边都会使 Alice 和 Bob 无法完全遍历这个图。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/06/5510ex3.png" style="height: 190px; width: 178px;"></strong></p>
 *
 * <pre><strong>输入：</strong>n = 4, edges = [[3,2,3],[1,1,2],[2,3,4]]
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>在当前图中，Alice 无法从其他节点到达节点 4 。类似地，Bob 也不能达到节点 1 。因此，图无法完全遍历。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= n &lt;= 10^5</code></li>
 * 	<li><code>1 &lt;= edges.length &lt;= min(10^5, 3 * n * (n-1) / 2)</code></li>
 * 	<li><code>edges[i].length == 3</code></li>
 * 	<li><code>1 &lt;= edges[i][0] &lt;= 3</code></li>
 * 	<li><code>1 &lt;= edges[i][1] &lt; edges[i][2] &lt;= n</code></li>
 * 	<li>所有元组 <code>(type<sub>i</sub>, u<sub>i</sub>, v<sub>i</sub>)</code> 互不相同</li>
 * </ul>
 */
@Problem(
    id = 1701,
    name = "remove-max-number-of-edges-to-keep-graph-fully-traversable",
    difficulty = Difficulty.HARD,
    tags = {Tag.UNION_FIND}
)
public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {

    /**
     * 1. 分别为alice和bob维护两个并查集.
     * 2. 首先遍历共享边, 先尝试在alice中加入, 如果已经属于一个连通分量, 则结果+1并在bob中加入该边.
     * 3. 然后遍历特殊边, 尝试在各自的并查集里加入边, 如果已经属于一个连通分量, 则结果+1.
     * 4. 遍历结束, 如果alice或bob的连通分量不为1, 则说明不能遍历完整个图, 返回-1.
     * 5. 返回累加的结果.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(m*α(n))")
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);

        int result = 0;

        for (int[] edge : edges) {
            edge[1]--;
            edge[2]--;
            if (edge[0] == 3) {
                if (!alice.union(edge[1], edge[2])) {
                    result++;
                } else {
                    bob.union(edge[1], edge[2]);
                    // 如果alice.union返回true, 那么这条边在bob中一定不属于同一个连通分量, 所以此处不需要result++.
                }
            }
        }
        for (int[] edge : edges) {
            if (edge[0] == 1 && !alice.union(edge[1], edge[2])) {
                result++;
            }
            if (edge[0] == 2 && !bob.union(edge[1], edge[2])) {
                result++;
            }
        }

        if (alice.setCount != 1 || bob.setCount != 1) {
            return -1;
        }
        return result;
    }

    private static class UnionFind {
        private final int[] ids;
        private final int[] ranks;
        private int setCount;

        public UnionFind(int n) {
            this.ids = new int[n];
            this.ranks = new int[n];
            this.setCount = n;
            for (int i = 0; i < n; i++) {
                ids[i] = i;
                ranks[i] = 1;
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
            ids[yId] = xId;
            ranks[xId] += ranks[yId];
            setCount--;
            return true;
        }
    }
}
