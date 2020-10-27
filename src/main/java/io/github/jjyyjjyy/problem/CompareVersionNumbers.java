package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/compare-version-numbers/">比较版本号</a>
 *
 * <p>比较两个版本号 <em>version1&nbsp;</em>和 <em>version2</em>。<br>
 * 如果&nbsp;<code><em>version1&nbsp;</em>&gt;&nbsp;<em>version2</em></code>&nbsp;返回&nbsp;<code>1</code>，如果&nbsp;<code><em>version1&nbsp;</em>&lt;&nbsp;<em>version2</em></code> 返回 <code>-1</code>， 除此之外返回 <code>0</code>。</p>
 *
 * <p>你可以假设版本字符串非空，并且只包含数字和&nbsp;<code>.</code> 字符。</p>
 *
 * <p>&nbsp;<code>.</code> 字符不代表小数点，而是用于分隔数字序列。</p>
 *
 * <p>例如，<code>2.5</code> 不是&ldquo;两个半&rdquo;，也不是&ldquo;差一半到三&rdquo;，而是第二版中的第五个小版本。</p>
 *
 * <p>你可以假设版本号的每一级的默认修订版号为 <code>0</code>。例如，版本号 <code>3.4</code> 的第一级（大版本）和第二级（小版本）修订号分别为 <code>3</code> 和 <code>4</code>。其第三级和第四级修订号均为 <code>0</code>。<br>
 * &nbsp;</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>version1</em></code> = &quot;0.1&quot;, <code><em>version2</em></code> = &quot;1.1&quot;
 * <strong>输出:</strong> -1</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong><code><em>version1</em></code> = &quot;1.0.1&quot;, <code><em>version2</em></code> = &quot;1&quot;
 * <strong>输出:</strong> 1</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> <code><em>version1</em></code> = &quot;7.5.2.4&quot;, <code><em>version2</em></code> = &quot;7.5.3&quot;
 * <strong>输出:</strong> -1</pre>
 *
 * <p><strong>示例&nbsp;4：</strong></p>
 *
 * <pre><code><strong>输入：</strong><em>version1</em></code> = &quot;1.01&quot;, <code><em>version2</em></code> = &quot;1.001&quot;
 * <strong>输出：</strong>0
 * <strong>解释：</strong>忽略前导零，&ldquo;01&rdquo; 和 &ldquo;001&rdquo; 表示相同的数字 &ldquo;1&rdquo;。</pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre><code><strong>输入：</strong><em>version1</em></code> = &quot;1.0&quot;, <code><em>version2</em></code> = &quot;1.0.0&quot;
 * <strong>输出：</strong>0
 * <strong>解释：</strong><code><em>version1 </em></code>没有第三级修订号，这意味着它的第三级修订号默认为 &ldquo;0&rdquo;。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>版本字符串由以点&nbsp;（<code>.</code>）&nbsp;分隔的数字字符串组成。这个数字字符串<strong>可能</strong>有前导零。</li>
 * 	<li>版本字符串不以点开始或结束，并且其中不会有两个连续的点。</li>
 * </ol>
 */
@Problem(
    id = 165,
    name = "compare-version-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class CompareVersionNumbers {

    /**
     * 依次遍历数组, 按照点号分割, 依次比较.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public int compareVersion(String version1, String version2) {

        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");
        int p = 0;
        while (p < version1Array.length && p < version2Array.length) {
            int v1 = Integer.parseInt(version1Array[p]);
            int v2 = Integer.parseInt(version2Array[p]);
            if (v1 < v2) {
                return -1;
            }
            if (v2 < v1) {
                return 1;
            }
            p++;
        }
        while (p < version1Array.length) {
            if (Integer.parseInt(version1Array[p++]) > 0) {
                return 1;
            }
        }
        while (p < version2Array.length) {
            if (Integer.parseInt(version2Array[p++]) > 0) {
                return -1;
            }
        }
        return 0;
    }
}
