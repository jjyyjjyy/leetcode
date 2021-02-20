package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/degree-of-an-array/">数组的度</a>
 *
 * <p>给定一个非空且只包含非负数的整数数组&nbsp;<code>nums</code>, 数组的度的定义是指数组里任一元素出现频数的最大值。</p>
 *
 * <p>你的任务是找到与&nbsp;<code>nums</code>&nbsp;拥有相同大小的度的最短连续子数组，返回其长度。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1, 2, 2, 3, 1]
 * <strong>输出:</strong> 2
 * <strong>解释:</strong>
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,2,2,3,1,4,2]
 * <strong>输出:</strong> 6
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><code>nums.length</code>&nbsp;在1到50,000区间范围内。</li>
 * 	<li><code>nums[i]</code>&nbsp;是一个在0到49,999范围内的整数。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-subarray</li>
 * </ul>
 */
@Problem(
    id = 697,
    name = "degree-of-an-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class DegreeOfAnArray {

    /**
     * 1. 遍历数组, 计算每个元素出现的次数以及起始位置.
     * 2. 遍历统计出来的结果, 得到最大的元素出现的次数, 并比较得到这些元素中最小的区间.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                counts.get(nums[i])[0]++;
                counts.get(nums[i])[2] = i;
            } else {
                counts.put(nums[i], new int[]{1, i, i});
            }
        }
        int max = 0;
        int result = 0;

        for (Map.Entry<Integer, int[]> entry : counts.entrySet()) {
            int[] count = entry.getValue();
            if (max < count[0]) {
                result = count[2] - count[1] + 1;
                max = count[0];
            } else if (max == count[0]) {
                result = Math.min(result, count[2] - count[1] + 1);
            }
        }
        return result;
    }
}
