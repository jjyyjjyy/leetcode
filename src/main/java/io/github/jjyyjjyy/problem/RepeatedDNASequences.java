package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/repeated-dna-sequences/">重复的DNA序列</a>
 *
 * <p>所有 DNA 都由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：&ldquo;ACGAATTCCG&rdquo;。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。</p>
 *
 * <p>编写一个函数来查找 DNA 分子中所有出现超过一次的 10 个字母长的序列（子串）。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT&quot;
 * <strong>输出：</strong>[&quot;AAAAACCCCC&quot;, &quot;CCCCCAAAAA&quot;]</pre>
 */
@Problem(
    id = 187,
    name = "repeated-dna-sequences",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION, Tag.HASH_TABLE}
)
public class RepeatedDNASequences {
}
