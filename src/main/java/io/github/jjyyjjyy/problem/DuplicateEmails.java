package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/duplicate-emails/">查找重复的电子邮箱</a>
 *
 * <p>编写一个 SQL 查询，查找&nbsp;<code>Person</code> 表中所有重复的电子邮箱。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>+----+---------+
 * | Id | Email   |
 * +----+---------+
 * | 1  | a@b.com |
 * | 2  | c@d.com |
 * | 3  | a@b.com |
 * +----+---------+
 * </pre>
 *
 * <p>根据以上输入，你的查询应返回以下结果：</p>
 *
 * <pre>+---------+
 * | Email   |
 * +---------+
 * | a@b.com |
 * +---------+
 * </pre>
 *
 * <p><strong>说明：</strong>所有电子邮箱都是小写字母。</p>
 */
@Problem(
    id = 182,
    name = "duplicate-emails",
    difficulty = Difficulty.EASY,
    tags = {}
)
public class DuplicateEmails {
}
