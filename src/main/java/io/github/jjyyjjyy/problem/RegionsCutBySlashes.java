package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/regions-cut-by-slashes/">由斜杠划分区域</a>
 *
 * <p>在由 1 x 1 方格组成的 N x N 网格&nbsp;<code>grid</code> 中，每个 1 x 1&nbsp;方块由 <code>/</code>、<code>\</code> 或空格构成。这些字符会将方块划分为一些共边的区域。</p>
 *
 * <p>（请注意，反斜杠字符是转义的，因此 <code>\</code> 用 <code>&quot;\\&quot;</code>&nbsp;表示。）。</p>
 *
 * <p>返回区域的数目。</p>
 *
 * <p>&nbsp;</p>
 *
 * <ol>
 * </ol>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：
 * </strong>[
 * &nbsp; &quot; /&quot;,
 * &nbsp; &quot;/ &quot;
 * ]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>2x2 网格如下：
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/1.png"></pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：
 * </strong>[
 * &nbsp; &quot; /&quot;,
 * &nbsp; &quot;  &quot;
 * ]
 * <strong>输出：</strong>1
 * <strong>解释：</strong>2x2 网格如下：
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/2.png"></pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：
 * </strong>[
 * &nbsp; &quot;\\/&quot;,
 * &nbsp; &quot;/\\&quot;
 * ]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>（回想一下，因为 \ 字符是转义的，所以 &quot;\\/&quot; 表示 \/，而 &quot;/\\&quot; 表示 /\。）
 * 2x2 网格如下：
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/3.png"></pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：
 * </strong>[
 * &nbsp; &quot;/\\&quot;,
 * &nbsp; &quot;\\/&quot;
 * ]
 * <strong>输出：</strong>5
 * <strong>解释：</strong>（回想一下，因为 \ 字符是转义的，所以 &quot;/\\&quot; 表示 /\，而 &quot;\\/&quot; 表示 \/。）
 * 2x2 网格如下：
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/4.png"></pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre><strong>输入：
 * </strong>[
 * &nbsp; &quot;//&quot;,
 * &nbsp; &quot;/ &quot;
 * ]
 * <strong>输出：</strong>3
 * <strong>解释：</strong>2x2 网格如下：
 * <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/5.png">
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= grid.length == grid[0].length &lt;= 30</code></li>
 * 	<li><code>grid[i][j]</code> 是&nbsp;<code>&#39;/&#39;</code>、<code>&#39;\&#39;</code>、或&nbsp;<code>&#39; &#39;</code>。</li>
 * </ol>
 */
@Problem(
    id = 999,
    name = "regions-cut-by-slashes",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND, Tag.GRAPH}
)
public class RegionsCutBySlashes {

    /**
     * 1. 将一个正方形按照上,右,下,左的顺序编好号, 一共4*n^2个号.
     * 2. 创建一个并查集, 维护连通分量个数.
     * 3. 遍历编号:
     * 3.1. 2号和下方区域的0号相连.
     * 3.2. 1号和右方区域的3号相连.
     * 3.3. 如果是/, 则将0号和3号相连.
     * 3.4. 如果是\, 则将1号和2号相连.
     * 3.5. 如果是空格, 则将0,1,2号相连.
     * 4. 最后并查集的连通分量的个数是区域的数目.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2_LOG_N)
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int pointCount = n * n * 4;
        UnionFind unionFind = new UnionFind(pointCount);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int idx = i * n + j;
                if (i < n - 1) {
                    int bottom = idx + n;
                    unionFind.union(idx * 4 + 2, bottom * 4);
                }
                if (j < n - 1) {
                    int right = idx + 1;
                    unionFind.union(idx * 4 + 1, right * 4 + 3);
                }
                if (grid[i].charAt(j) == '/') {
                    unionFind.union(idx * 4, idx * 4 + 3);
                    unionFind.union(idx * 4 + 1, idx * 4 + 2);
                } else if (grid[i].charAt(j) == '\\') {
                    unionFind.union(idx * 4, idx * 4 + 1);
                    unionFind.union(idx * 4 + 2, idx * 4 + 3);
                } else {
                    unionFind.union(idx * 4, idx * 4 + 1);
                    unionFind.union(idx * 4 + 1, idx * 4 + 2);
                    unionFind.union(idx * 4 + 2, idx * 4 + 3);
                }
            }
        }
        return unionFind.setCount;
    }

    private static class UnionFind {
        private final int[] ids;
        private final int[] ranks;
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

        public void union(int x, int y) {
            int xId = find(x);
            int yId = find(y);
            if (xId == yId) {
                return;
            }
            if (ranks[xId] < ranks[yId]) {
                int tmp = xId;
                xId = yId;
                yId = tmp;
            }
            ids[yId] = ids[xId];
            ranks[xId] += ranks[yId];
            setCount--;
        }
    }
}
