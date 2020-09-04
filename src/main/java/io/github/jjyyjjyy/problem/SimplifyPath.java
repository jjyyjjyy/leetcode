package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode-cn.com/problems/simplify-path/">简化路径</a>
 *
 * <p>以 Unix 风格给出一个文件的<strong>绝对路径</strong>，你需要简化它。或者换句话说，将其转换为规范路径。</p>
 *
 * <p>在 Unix 风格的文件系统中，一个点（<code>.</code>）表示当前目录本身；此外，两个点 （<code>..</code>）&nbsp;表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：<a href="https://blog.csdn.net/u011327334/article/details/50355600" target="_blank">Linux / Unix中的绝对路径 vs 相对路径</a></p>
 *
 * <p>请注意，返回的规范路径必须始终以斜杠 <code>/</code> 开头，并且两个目录名之间必须只有一个斜杠 <code>/</code>。最后一个目录名（如果存在）<strong>不能</strong>以 <code>/</code> 结尾。此外，规范路径必须是表示绝对路径的<strong>最短</strong>字符串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/home/&quot;
 * <strong>输出：&quot;</strong>/home&quot;
 * <strong>解释：</strong>注意，最后一个目录名后面没有斜杠。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/../&quot;
 * <strong>输出：&quot;</strong>/&quot;
 * <strong>解释：</strong>从根目录向上一级是不可行的，因为根是你可以到达的最高级。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/home//foo/&quot;
 * <strong>输出：&quot;</strong>/home/foo&quot;
 * <strong>解释：</strong>在规范路径中，多个连续斜杠需要用一个斜杠替换。
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/a/./b/../../c/&quot;
 * <strong>输出：&quot;</strong>/c&quot;
 * </pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/a/../../b/../c//.//&quot;
 * <strong>输出：&quot;</strong>/c&quot;
 * </pre>
 *
 * <p><strong>示例 6：</strong></p>
 *
 * <pre><strong>输入：&quot;</strong>/a//b////c/d//././/..&quot;
 * <strong>输出：&quot;</strong>/a/b/c&quot;</pre>
 */
@Problem(
    id = 71,
    name = "simplify-path",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.STRING}
)
public class SimplifyPath {

    /**
     * 1. 将字符串按/分割为数组.
     * 2. 维护一个路径栈.
     * 3. 依次遍历数组.
     * 3.1. 如果当前元素为空或者点号则跳过.
     * 3.2. 如果当前元素为..并且栈不为空, 则弹出栈顶.
     * 3.3. 将当前字符串压入栈中.
     * 4. 依次弹出栈底元素, 用/拼接字符串, 得到最后的路径.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> pathStack = new ArrayDeque<>();
        for (String s : split) {
            if ("..".equals(s)) {
                if (!pathStack.isEmpty()) {
                    pathStack.removeLast();
                }
                continue;
            }
            if (!s.isEmpty() && !".".equals(s)) {
                pathStack.addLast(s);
            }
        }
        if (pathStack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!pathStack.isEmpty()) {
            sb.append("/").append(pathStack.removeFirst());
        }
        return sb.toString();
    }
}
