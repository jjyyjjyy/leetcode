package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/similar-string-groups/">相似字符串组</a>
 *
 * <p>如果我们交换字符串&nbsp;<code>X</code> 中的两个不同位置的字母，使得它和字符串&nbsp;<code>Y</code> 相等，那么称 <code>X</code> 和 <code>Y</code> 两个字符串相似。如果这两个字符串本身是相等的，那它们也是相似的。</p>
 *
 * <p>例如，<code>&quot;tars&quot;</code> 和 <code>&quot;rats&quot;</code> 是相似的 (交换 <code>0</code> 与 <code>2</code> 的位置)；&nbsp;<code>&quot;rats&quot;</code> 和 <code>&quot;arts&quot;</code> 也是相似的，但是 <code>&quot;star&quot;</code> 不与 <code>&quot;tars&quot;</code>，<code>&quot;rats&quot;</code>，或 <code>&quot;arts&quot;</code> 相似。</p>
 *
 * <p>总之，它们通过相似性形成了两个关联组：<code>{&quot;tars&quot;, &quot;rats&quot;, &quot;arts&quot;}</code> 和 <code>{&quot;star&quot;}</code>。注意，<code>&quot;tars&quot;</code> 和 <code>&quot;arts&quot;</code> 是在同一组中，即使它们并不相似。形式上，对每个组而言，要确定一个单词在组中，只需要这个词和该组中至少一个单词相似。</p>
 *
 * <p>我们给出了一个不包含重复的字符串列表 <code>A</code>。列表中的每个字符串都是 <code>A</code> 中其它所有字符串的一个字母异位词。请问 <code>A</code> 中有多少个相似字符串组？</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>[&quot;tars&quot;,&quot;rats&quot;,&quot;arts&quot;,&quot;star&quot;]
 * <strong>输出：</strong>2</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>A.length &lt;= 2000</code></li>
 * 	<li><code>A[i].length &lt;= 1000</code></li>
 * 	<li><code>A.length * A[i].length &lt;= 20000</code></li>
 * 	<li><code>A</code> 中的所有单词都只包含小写字母。</li>
 * 	<li><code>A</code> 中的所有单词都具有相同的长度，且是彼此的字母异位词。</li>
 * 	<li>此问题的判断限制时间已经延长。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>备注：</strong></p>
 *
 * <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 字母异位词[anagram]，一种把某个字符串的字母的位置（顺序）加以改换所形成的新词。</p>
 */
@Problem(
    id = 869,
    name = "similar-string-groups",
    difficulty = Difficulty.HARD,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND, Tag.GRAPH}
)
public class SimilarStringGroups {

    /**
     * 1. 遍历每个字符串, 和其后面的字符串比较, 如果是相似的(不同的字符数量为0或2), 将索引加入到并查集里.
     * 2. 并查集里的连通分量即为结果.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "(n^2*m+nlogn)")
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!unionFind.isConnected(i, j) && isSimilar(strs[i], strs[j])) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.setCount;
    }

    private boolean isSimilar(String a, String b) {
        int n = a.length();
        int diffCount = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 2) {
                break;
            }
        }
        return diffCount == 0 || diffCount == 2;
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

        public boolean union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return false;
            }
            if (ranks[x] < ranks[y]) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            ids[y] = x;
            ranks[x] += ranks[y];
            setCount--;
            return true;
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
