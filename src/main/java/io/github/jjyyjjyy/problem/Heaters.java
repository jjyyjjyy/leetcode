package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/heaters/">供暖器</a>
 *
 * <p>冬季已经来临。&nbsp;你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。</p>
 *
 * <p>现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。</p>
 *
 * <p>所以，你的输入将会是房屋和供暖器的位置。你将输出供暖器的最小加热半径。</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>给出的房屋和供暖器的数目是非负数且不会超过 25000。</li>
 * 	<li>给出的房屋和供暖器的位置均是非负数且不会超过10^9。</li>
 * 	<li>只要房屋位于供暖器的半径内(包括在边缘上)，它就可以得到供暖。</li>
 * 	<li>所有供暖器都遵循你的半径标准，加热的半径也一样。</li>
 * </ol>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3],[2]
 * <strong>输出:</strong> 1
 * <strong>解释:</strong> 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,3,4],[1,4]
 * <strong>输出:</strong> 1
 * <strong>解释:</strong> 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
 * </pre>
 */
@Problem(
    id = 475,
    name = "heaters",
    difficulty = Difficulty.EASY,
    tags = {Tag.BINARY_SEARCH}
)
public class Heaters {
}
