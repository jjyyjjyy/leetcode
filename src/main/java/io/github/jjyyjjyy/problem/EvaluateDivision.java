package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/evaluate-division/">除法求值</a>
 *
 * <p>给出方程式&nbsp;<code>A / B = k</code>, 其中&nbsp;<code>A</code> 和&nbsp;<code>B</code> 均为代表字符串的变量，&nbsp;<code>k</code> 是一个浮点型数字。根据已知方程式求解问题，并返回计算结果。如果结果不存在，则返回&nbsp;<code>-1.0</code>。</p>
 *
 * <p><strong>示例 :</strong><br />
 * 给定&nbsp;<code>a / b = 2.0, b / c = 3.0</code><br />
 * 问题: <code> a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?&nbsp;</code><br />
 * 返回&nbsp;<code>[6.0, 0.5, -1.0, 1.0, -1.0 ]</code></p>
 *
 * <p>输入为: <code> vector&lt;pair&lt;string, string&gt;&gt; equations, vector&lt;double&gt;&amp; values, vector&lt;pair&lt;string, string&gt;&gt; queries</code>(方程式，方程式结果，问题方程式)，&nbsp;其中&nbsp;<code>equations.size() == values.size()</code>，即方程式的长度与方程式结果长度相等（程式与结果一一对应），并且结果值均为正数。以上为方程式的描述。&nbsp;返回<code>vector&lt;double&gt;</code>类型。</p>
 *
 * <p>基于上述例子，输入如下：</p>
 *
 * <pre>
 * equations(方程式) = [ [&quot;a&quot;, &quot;b&quot;], [&quot;b&quot;, &quot;c&quot;] ],
 * values(方程式结果) = [2.0, 3.0],
 * queries(问题方程式) = [ [&quot;a&quot;, &quot;c&quot;], [&quot;b&quot;, &quot;a&quot;], [&quot;a&quot;, &quot;e&quot;], [&quot;a&quot;, &quot;a&quot;], [&quot;x&quot;, &quot;x&quot;] ].
 * </pre>
 *
 * <p>输入总是有效的。你可以假设除法运算中不会出现除数为0的情况，且不存在任何矛盾的结果。</p>
 */
@Problem(
    id = 399,
    name = "evaluate-division",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.UNION_FIND, Tag.GRAPH}
)
public class EvaluateDivision {

    /**
     * 广度优先遍历
     * <p>
     * 1. 记录所有出现的字符和对应的索引.
     * 2. 创建一个图数组, 数组下标对应字符的索引, 每个顶点根据equations和values存放除数和商.
     * 3. 遍历每个query中的字符a和字符b:
     * 3.1. 如果字符a或b不存在, 当前计算结果为-1.0.
     * 3.2. 如果a和b相等, 当前计算结果为1.0.
     * 3.3. 以a的索引为起点, 根据图中a顶点BFS找到所有可达的顶点, 用乘积计算该顶点的值.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(ML+Q*(L+M))")
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        IntHolder intHolder = new IntHolder();

        Map<String, Integer> variables = new HashMap<>();
        equations.forEach(v -> {
            variables.putIfAbsent(v.get(0), intHolder.value++);
            variables.putIfAbsent(v.get(1), intHolder.value++);
        });

        int n = intHolder.value;

        List<Pair>[] edges = new List[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < equations.size(); i++) {
            int va = variables.get(equations.get(i).get(0));
            int vb = variables.get(equations.get(i).get(1));
            edges[va].add(new Pair(vb, values[i]));
            edges[vb].add(new Pair(va, 1 / values[i]));
        }

        int queryCount = queries.size();
        double[] result = new double[queryCount];

        for (int i = 0; i < queryCount; i++) {
            List<String> currentQuery = queries.get(i);
            String a = currentQuery.get(0);
            String b = currentQuery.get(1);
            if (!variables.containsKey(a) || !variables.containsKey(b)) {
                result[i] = -1.0;
                continue;
            }
            if (Objects.equals(a, b)) {
                result[i] = 1.0;
                continue;
            }
            int aIndex = variables.get(a);
            int bIndex = variables.get(b);

            Queue<Integer> points = new LinkedList<>();
            points.add(aIndex);
            double[] ratios = new double[n];
            Arrays.fill(ratios, -1);
            ratios[aIndex] = 1.0;

            while (!points.isEmpty() && ratios[bIndex] < 0) {
                Integer current = points.poll();
                for (Pair edge : edges[current]) {
                    int index = edge.index;
                    if (ratios[index] < 0) {
                        ratios[index] = ratios[current] * edge.value;
                        points.add(index);
                    }
                }
            }

            result[i] = ratios[bIndex];
        }

        return result;
    }

    private static class Pair {

        private int index;
        private double value;

        public Pair(int index, double value) {
            this.index = index;
            this.value = value;
        }
    }

    private static class IntHolder {
        private int value;
    }

}
