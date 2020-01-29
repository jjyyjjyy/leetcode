package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/restore-ip-addresses/">复原IP地址</a>
 *
 * <p>给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;25525511135&quot;
 * <strong>输出:</strong> <code>[&quot;255.255.11.135&quot;, &quot;255.255.111.35&quot;]</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>ip-to-cidr</li>
 * </ul>
 */
@Problem(
    id = 93,
    name = "restore-ip-addresses",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.BACKTRACKING}
)
public class RestoreIPAddresses {
}
