package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/queue-reconstruction-by-height/">根据身高重建队列</a>
 *
 * <p>假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对<code>(h, k)</code>表示，其中<code>h</code>是这个人的身高，<code>k</code>是排在这个人前面且身高大于或等于<code>h</code>的人数。 编写一个算法来重建这个队列。</p>
 *
 * <p><strong>注意：</strong><br />
 * 总人数少于1100人。</p>
 *
 * <p><strong>示例</strong></p>
 *
 * <pre>
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-of-smaller-numbers-after-self</li>
 * </ul>
 */
@Problem(
    id = 406,
    name = "queue-reconstruction-by-height",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY}
)
public class QueueReconstructionbyHeight {
}
