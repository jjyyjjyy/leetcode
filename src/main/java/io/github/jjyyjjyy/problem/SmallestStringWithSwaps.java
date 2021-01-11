package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode-cn.com/problems/smallest-string-with-swaps/">交换字符串中的元素</a>
 *
 * <p>给你一个字符串&nbsp;<code>s</code>，以及该字符串中的一些「索引对」数组&nbsp;<code>pairs</code>，其中&nbsp;<code>pairs[i] =&nbsp;[a, b]</code>&nbsp;表示字符串中的两个索引（编号从 0 开始）。</p>
 *
 * <p>你可以 <strong>任意多次交换</strong> 在&nbsp;<code>pairs</code>&nbsp;中任意一对索引处的字符。</p>
 *
 * <p>返回在经过若干次交换后，<code>s</code>&nbsp;可以变成的按字典序最小的字符串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;dcab&quot;, pairs = [[0,3],[1,2]]
 * <strong>输出：</strong>&quot;bacd&quot;
 * <strong>解释：</strong>
 * 交换 s[0] 和 s[3], s = &quot;bcad&quot;
 * 交换 s[1] 和 s[2], s = &quot;bacd&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;dcab&quot;, pairs = [[0,3],[1,2],[0,2]]
 * <strong>输出：</strong>&quot;abcd&quot;
 * <strong>解释：</strong>
 * 交换 s[0] 和 s[3], s = &quot;bcad&quot;
 * 交换 s[0] 和 s[2], s = &quot;acbd&quot;
 * 交换 s[1] 和 s[2], s = &quot;abcd&quot;</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;cba&quot;, pairs = [[0,1],[1,2]]
 * <strong>输出：</strong>&quot;abc&quot;
 * <strong>解释：</strong>
 * 交换 s[0] 和 s[1], s = &quot;bca&quot;
 * 交换 s[1] 和 s[2], s = &quot;bac&quot;
 * 交换 s[0] 和 s[1], s = &quot;abc&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= s.length &lt;= 10^5</code></li>
 * 	<li><code>0 &lt;= pairs.length &lt;= 10^5</code></li>
 * 	<li><code>0 &lt;= pairs[i][0], pairs[i][1] &lt;&nbsp;s.length</code></li>
 * 	<li><code>s</code>&nbsp;中只含有小写英文字母</li>
 * </ul>
 */
@Problem(
    id = 1308,
    name = "smallest-string-with-swaps",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.UNION_FIND, Tag.ARRAY}
)
public class SmallestStringWithSwaps {

    /**
     * 算法: pairs即为连通分量, 使用并查集能得到连通的索引组, 然后将每组的字符使用最小堆排序, 依次取出就得到了最终排好序的字符串.
     * <p>
     * 1. 将pairs加入到并查集里.
     * 2. 将每个元素的索引从并查集里拿到id, 插入到哈希表中, key为id, value为一个最小堆.
     * 3. 依次遍历索引, 从哈希表中取出字符, 得到最小字典序的字符串.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O((m+n)α(n)+nlogn)")
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if (pairs.size() == 0) {
            return s;
        }

        int n = s.length();
        UnionFind unionFind = new UnionFind(n);
        for (List<Integer> pair : pairs) {
            unionFind.union(pair.get(0), pair.get(1));
        }

        char[] chars = s.toCharArray();
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            int root = unionFind.find(i);
            if (map.containsKey(root)) {
                map.get(root).add(chars[i]);
            } else {
                map.computeIfAbsent(root, k -> new PriorityQueue<>()).add(chars[i]);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int root = unionFind.find(i);
            result.append(map.get(root).poll());
        }
        return result.toString();
    }

    /**
     * Weighted quick-union
     */
    private static class UnionFind {

        private final int[] id;
        private final int[] rank;

        public UnionFind(int n) {
            this.id = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                this.id[i] = i;
                this.rank[i] = 1;
            }
        }

        public int find(int i) {
            while (i != id[i]) {
                i = id[i];
            }
            return i;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (rank[rootX] == rank[rootY]) {
                id[rootX] = rootY;
                rank[rootY]++;
            } else if (rank[rootX] < rank[rootY]) {
                id[rootX] = rootY;
            } else {
                id[rootY] = rootX;
            }
        }
    }
}
