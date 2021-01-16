package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/bricks-falling-when-hit/">打砖块</a>
 *
 * <p>我们有一组包含1和0的网格；其中1表示砖块。&nbsp;当且仅当一块砖直接连接到网格的顶部，或者它至少有一块相邻（4&nbsp;个方向之一）砖块不会掉落时，它才不会落下。</p>
 *
 * <p>我们会依次消除一些砖块。每当我们消除&nbsp;(i, j) 位置时， 对应位置的砖块（若存在）会消失，然后其他的砖块可能因为这个消除而落下。</p>
 *
 * <p>返回一个数组表示每次消除操作对应落下的砖块数目。</p>
 *
 * <pre><strong>示例 1：</strong>
 * <strong>输入：</strong>
 * grid = [[1,0,0,0],[1,1,1,0]]
 * hits = [[1,0]]
 * <strong>输出:</strong> [2]
 * <strong>解释: </strong>
 * 如果我们消除(1, 0)位置的砖块, 在(1, 1) 和(1, 2) 的砖块会落下。所以我们应该返回2。</pre>
 *
 * <pre><strong>示例 2：</strong>
 * <strong>输入：</strong>
 * grid = [[1,0,0,0],[1,1,0,0]]
 * hits = [[1,1],[1,0]]
 * <strong>输出：</strong>[0,0]
 * <strong>解释：</strong>
 * 当我们消除(1, 0)的砖块时，(1, 1)的砖块已经由于上一步消除而消失了。所以每次消除操作不会造成砖块落下。注意(1, 0)砖块不会记作落下的砖块。</pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li>网格的行数和列数的范围是[1, 200]。</li>
 * 	<li>消除的数字不会超过网格的区域。</li>
 * 	<li>可以保证每次的消除都不相同，并且位于网格的内部。</li>
 * 	<li>一个消除的位置可能没有砖块，如果这样的话，就不会有砖块落下。</li>
 * </ul>
 */
@Problem(
    id = 821,
    name = "bricks-falling-when-hit",
    difficulty = Difficulty.HARD,
    tags = {Tag.UNION_FIND}
)
public class BricksFallingWhenHit {

    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int rows;
    private int cols;

    /**
     * 1. 复制出来一个新的grid, 将hits中对应的坐标值设置为0.
     * 2. 创建一个并查集:
     * 2.1. 将第0行的砖头和一个特殊的屋顶索引(size)关联到并查集里.
     * 2.2. 将下方的砖头和左边/上方的砖头关联起来.
     * 3. 从右向左遍历hits, 如果对应的坐标在原数组中值为1:
     * 3.1. 先计算屋顶的秩.
     * 3.2. 如果为第0行, 则和屋顶索引(size)关联到并查集里.
     * 3.3. 遍历当前坐标的上下左右四个方向, 如果对方值为1则关联到并查集里.
     * 3.4. 再计算一次屋顶的秩, 两次秩相差的值减去1(当前坐标不算)即为会掉落的砖头数.
     * 3.5. 将复制出来的grid当前坐标的值恢复成1.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int[] hitBricks(int[][] grid, int[][] hits) {

        rows = grid.length;
        cols = grid[0].length;
        int[][] gridCopy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }
        for (int[] hit : hits) {
            gridCopy[hit[0]][hit[1]] = 0;
        }

        int size = rows * cols;
        UnionFind unionFind = new UnionFind(size + 1);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (gridCopy[i][j] == 1) {
                    if (i == 0) {
                        unionFind.union(getIndex(i, j), size);
                    }
                    if (i > 0 && gridCopy[i - 1][j] == 1) {
                        unionFind.union(getIndex(i - 1, j), getIndex(i, j));
                    }
                    if (j > 0 && gridCopy[i][j - 1] == 1) {
                        unionFind.union(getIndex(i, j - 1), getIndex(i, j));
                    }
                }
            }
        }

        int hitsLength = hits.length;
        int[] result = new int[hitsLength];

        for (int i = hitsLength - 1; i >= 0; i--) {
            int x = hits[i][0];
            int y = hits[i][1];
            if (grid[x][y] == 0) {
                continue;
            }
            int origin = unionFind.getSize(size);
            if (x == 0) {
                unionFind.union(getIndex(x, y), size);
            }

            for (int[] direction : DIRECTIONS) {
                int newX = direction[0] + x;
                int newY = direction[1] + y;
                if (inArea(newX, newY) && gridCopy[newX][newY] == 1) {
                    unionFind.union(getIndex(x, y), getIndex(newX, newY));
                }
            }
            int current = unionFind.getSize(size);
            result[i] = Math.max(0, current - origin - 1);
            gridCopy[x][y] = 1;
        }
        return result;

    }

    private boolean inArea(int x, int y) {
        return x >= 0 && y >= 0 && x < rows && y < cols;
    }

    private int getIndex(int x, int y) {
        return x * cols + y;
    }

    private static class UnionFind {
        private final int[] ids;
        private final int[] size;

        public UnionFind(int n) {
            this.ids = new int[n];
            this.size = new int[n];
            for (int i = 0; i < n; i++) {
                ids[i] = i;
                size[i] = 1;
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
            ids[xId] = yId;
            size[yId] += size[xId];
        }

        public int getSize(int x) {
            return size[find(x)];
        }
    }
}
