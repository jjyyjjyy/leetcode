package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-time-difference/">最小时间差</a>
 *
 * <p>给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。</p>
 *
 * <p><br />
 * <strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [&quot;23:59&quot;,&quot;00:00&quot;]
 * <strong>输出:</strong> 1
 * </pre>
 *
 * <p><br />
 * <strong>备注:</strong></p>
 *
 * <ol>
 * 	<li>列表中时间数在 2~20000 之间。</li>
 * 	<li>每个时间取值在 00:00~23:59 之间。</li>
 * </ol>
 */
@Problem(
    id = 539,
    name = "minimum-time-difference",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class MinimumTimeDifference {
}
