package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/can-place-flowers/">种花问题</a>
 *
 * <p>假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。</p>
 *
 * <p>给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数&nbsp;<strong>n&nbsp;</strong>。能否在不打破种植规则的情况下种入&nbsp;<strong>n&nbsp;</strong>朵花？能则返回True，不能则返回False。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> flowerbed = [1,0,0,0,1], n = 1
 * <strong>输出:</strong> True
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> flowerbed = [1,0,0,0,1], n = 2
 * <strong>输出:</strong> False
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>数组内已种好的花不会违反种植规则。</li>
 * 	<li>输入的数组长度范围为 [1, 20000]。</li>
 * 	<li><strong>n</strong> 是非负整数，且不会超过输入数组的大小。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>teemo-attacking</li>
 *   <li>asteroid-collision</li>
 * </ul>
 */
@Problem(
    id = 605,
    name = "can-place-flowers",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class CanPlaceFlowers {
}
