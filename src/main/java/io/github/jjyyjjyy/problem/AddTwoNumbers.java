package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 *
 * <p>给出两个&nbsp;<strong>非空</strong> 的链表用来表示两个非负的整数。其中，它们各自的位数是按照&nbsp;<strong>逆序</strong>&nbsp;的方式存储的，并且它们的每个节点只能存储&nbsp;<strong>一位</strong>&nbsp;数字。</p>
 *
 * <p>如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。</p>
 *
 * <p>您可以假设除了数字 0 之外，这两个数都不会以 0&nbsp;开头。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>(2 -&gt; 4 -&gt; 3) + (5 -&gt; 6 -&gt; 4)
 * <strong>输出：</strong>7 -&gt; 0 -&gt; 8
 * <strong>原因：</strong>342 + 465 = 807
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>multiply-strings</li>
 *   <li>add-binary</li>
 *   <li>sum-of-two-integers</li>
 *   <li>add-strings</li>
 *   <li>add-two-numbers-ii</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 2,
    name = "add-two-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST, Tag.MATH}
)
public class AddTwoNumbers {
}
