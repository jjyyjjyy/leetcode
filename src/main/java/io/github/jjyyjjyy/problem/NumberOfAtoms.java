package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-atoms/">原子的数量</a>
 *
 * <p>给定一个化学式<code>formula</code>（作为字符串），返回每种原子的数量。</p>
 *
 * <p>原子总是以一个大写字母开始，接着跟随0个或任意个小写字母，表示原子的名字。</p>
 *
 * <p>如果数量大于 1，原子后会跟着数字表示原子的数量。如果数量等于 1 则不会跟数字。例如，H2O 和 H2O2 是可行的，但 H1O2 这个表达是不可行的。</p>
 *
 * <p>两个化学式连在一起是新的化学式。例如&nbsp;H2O2He3Mg4 也是化学式。</p>
 *
 * <p>一个括号中的化学式和数字（可选择性添加）也是化学式。例如 (H2O2) 和 (H2O2)3 是化学式。</p>
 *
 * <p>给定一个化学式，输出所有原子的数量。格式为：第一个（按字典序）原子的名子，跟着它的数量（如果数量大于 1），然后是第二个原子的名字（按字典序），跟着它的数量（如果数量大于 1），以此类推。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * formula = &quot;H2O&quot;
 * <strong>输出:</strong> &quot;H2O&quot;
 * <strong>解释:</strong>
 * 原子的数量是 {&#39;H&#39;: 2, &#39;O&#39;: 1}。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * formula = &quot;Mg(OH)2&quot;
 * <strong>输出:</strong> &quot;H2MgO2&quot;
 * <strong>解释:</strong>
 * 原子的数量是 {&#39;H&#39;: 2, &#39;Mg&#39;: 1, &#39;O&#39;: 2}。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * formula = &quot;K4(ON(SO3)2)2&quot;
 * <strong>输出:</strong> &quot;K4N2O14S4&quot;
 * <strong>解释:</strong>
 * 原子的数量是 {&#39;K&#39;: 4, &#39;N&#39;: 2, &#39;O&#39;: 14, &#39;S&#39;: 4}。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li>所有原子的第一个字母为大写，剩余字母都是小写。</li>
 * 	<li><code>formula</code>的长度在<code>[1, 1000]</code>之间。</li>
 * 	<li><code>formula</code>只包含字母、数字和圆括号，并且题目中给定的是合法的化学式。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>decode-string</li>
 *   <li>encode-string-with-shortest-length</li>
 *   <li>parse-lisp-expression</li>
 * </ul>
 */
@Problem(
    id = 726,
    name = "number-of-atoms",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.RECURSION, Tag.HASH_TABLE}
)
public class NumberOfAtoms {

    private int i;

    /**
     * 1. 维护一个栈存储当前括号内元素和个数的对应关系.
     * 2. 遍历字符串:
     * 2.1. 如果是小括号, 则向栈中压入一个空的map.
     * 2.2. 如果是大括号, 则表示当前括号遍历完毕, 找到后面的个数, 将当前括号内的统计结果加到上一个统计结果中.
     * 2.3. 如果是字符, 将当前字符的个数加到上一个统计结果中.
     * 3. 此时栈顶map统计所有元素出现的个数, 输出结果.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public String countOfAtoms(String formula) {
        i = 0;
        int n = formula.length();
        Deque<Map<String, Integer>> stack = new LinkedList<>();
        stack.push(new HashMap<>());

        while (i < n) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                i++;
                stack.push(new HashMap<>());
            } else if (ch == ')') {
                i++;
                int num = getNum(formula);
                Map<String, Integer> pop = stack.pop();
                Map<String, Integer> peek = stack.element();
                for (Map.Entry<String, Integer> entry : pop.entrySet()) {
                    peek.put(entry.getKey(), peek.getOrDefault(entry.getKey(), 0) + entry.getValue() * num);
                }
            } else {
                String atom = getAtom(formula);
                int num = getNum(formula);
                Map<String, Integer> peek = stack.element();
                peek.put(atom, peek.getOrDefault(atom, 0) + num);
            }
        }

        TreeMap<String, Integer> treeMap = new TreeMap<>(stack.pop());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String atom = entry.getKey();
            int count = entry.getValue();
            sb.append(atom);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    private String getAtom(String formula) {
        StringBuilder atom = new StringBuilder();
        atom.append(formula.charAt(i++));
        while (i < formula.length() && Character.isLowerCase(formula.charAt(i))) {
            atom.append(formula.charAt(i++));
        }
        return atom.toString();
    }

    private int getNum(String formula) {
        int num = 0;
        if (i == formula.length() || !Character.isDigit(formula.charAt(i))) {
            num = 1;
        } else {
            while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                num = num * 10 + (formula.charAt(i) - '0');
                i++;
            }
        }
        return num;
    }
}
