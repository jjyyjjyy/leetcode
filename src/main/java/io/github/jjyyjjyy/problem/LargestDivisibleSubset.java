package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/largest-divisible-subset/">最大整除子集</a>
 *
 * <p>给出一个由<strong>无重复的</strong>正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (S<sub>i，</sub>S<sub>j</sub>) 都要满足：S<sub>i</sub> % S<sub>j</sub> = 0 或 S<sub>j</sub> % S<sub>i</sub> = 0。</p>
 *
 * <p>如果有多个目标子集，返回其中任何一个均可。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong> [1,2] (当然, [1,3] 也正确)
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,4,8]
 * <strong>输出:</strong> [1,2,4,8]
 * </pre>
 */
@Problem(
    id = 368,
    name = "largest-divisible-subset",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        return null;
    }
}
