package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/couples-holding-hands/">情侣牵手</a>
 *
 * <p>N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。 计算最少交换座位的次数，以便每对情侣可以并肩坐在一起。 <em>一</em>次交换可选择任意两人，让他们站起来交换座位。</p>
 *
 * <p>人和座位用&nbsp;<code>0</code>&nbsp;到&nbsp;<code>2N-1</code>&nbsp;的整数表示，情侣们按顺序编号，第一对是&nbsp;<code>(0, 1)</code>，第二对是&nbsp;<code>(2, 3)</code>，以此类推，最后一对是&nbsp;<code>(2N-2, 2N-1)</code>。</p>
 *
 * <p>这些情侣的初始座位&nbsp;&nbsp;<code>row[i]</code>&nbsp;是由最初始坐在第 i 个座位上的人决定的。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> row = [0, 2, 1, 3]
 * <strong>输出:</strong> 1
 * <strong>解释:</strong> 我们只需要交换row[1]和row[2]的位置即可。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> row = [3, 2, 0, 1]
 * <strong>输出:</strong> 0
 * <strong>解释:</strong> 无需交换座位，所有的情侣都已经可以手牵手了。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li><code>len(row)</code> 是偶数且数值在&nbsp;<code>[4, 60]</code>范围内。</li>
 * 	<li>可以保证<code>row</code> 是序列&nbsp;<code>0...len(row)-1</code>&nbsp;的一个全排列。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-missing-positive</li>
 *   <li>missing-number</li>
 *   <li>k-similar-strings</li>
 * </ul>
 */
@Problem(
    id = 770,
    name = "couples-holding-hands",
    difficulty = Difficulty.HARD,
    tags = {Tag.UNION_FIND}
)
public class CouplesHoldingHands {

    /**
     * 最少交换次数=情侣对数-连通分量数
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        UnionFind unionFind = new UnionFind(n / 2);

        for (int i = 0; i < n; i += 2) {
            unionFind.union(row[i] / 2, row[i + 1] / 2);
        }
        return n / 2 - unionFind.setCount;
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
            setCount--;
        }
    }
}
