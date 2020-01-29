package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/transpose-file/">转置文件</a>
 *
 * <p>给定一个文件&nbsp;<code>file.txt</code>，转置它的内容。</p>
 *
 * <p>你可以假设每行列数相同，并且每个字段由&nbsp;<code>&#39; &#39;</code> 分隔.</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <p>假设&nbsp;<code>file.txt</code>&nbsp;文件内容如下：</p>
 *
 * <pre>name age
 * alice 21
 * ryan 30
 * </pre>
 *
 * <p>应当输出：</p>
 *
 * <pre>name alice ryan
 * age 21 30
 * </pre>
 */
@Problem(
    id = 194,
    name = "transpose-file",
    difficulty = Difficulty.MEDIUM,
    tags = {}
)
public class TransposeFile {
}
