package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/">字符串的排列</a>
 *
 * <p>输入一个字符串，打印出该字符串中字符的所有排列。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;abc&quot;
 * <strong>输出：[</strong>&quot;abc&quot;,&quot;acb&quot;,&quot;bac&quot;,&quot;bca&quot;,&quot;cab&quot;,&quot;cba&quot;<strong>]</strong>
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>限制：</strong></p>
 *
 * <p><code>1 &lt;= s 的长度 &lt;= 8</code></p>
 */
@Problem(
    id = 100308,
    name = "zi-fu-chuan-de-pai-lie-lcof",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class Permutation {

    private final List<String> rec = new ArrayList<>();
    private boolean[] vis;

    /**
     * 1. 为了避免生成重复排列, 先将字符排好序.
     * 2. 使用布尔数组标记当前字符是否被使用过.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n*n!)")
    public String[] permutation(String s) {
        int n = s.length();
        vis = new boolean[n];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder perm = new StringBuilder();
        backtrack(arr, 0, n, perm);
        return rec.toArray(String[]::new);
    }

    public void backtrack(char[] arr, int i, int n, StringBuilder perm) {
        if (i == n) {
            rec.add(perm.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            perm.append(arr[j]);
            backtrack(arr, i + 1, n, perm);
            perm.deleteCharAt(perm.length() - 1);
            vis[j] = false;
        }
    }
}
