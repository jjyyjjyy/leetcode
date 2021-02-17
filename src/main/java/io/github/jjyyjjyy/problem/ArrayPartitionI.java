package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/array-partition-i/">数组拆分 I</a>
 *
 * <p>给定长度为&nbsp;<strong>2n&nbsp;</strong>的数组, 你的任务是将这些数分成&nbsp;<strong>n </strong>对, 例如 (a<sub>1</sub>, b<sub>1</sub>), (a<sub>2</sub>, b<sub>2</sub>), ..., (a<sub>n</sub>, b<sub>n</sub>) ，使得从1 到&nbsp;n 的 min(a<sub>i</sub>, b<sub>i</sub>) 总和最大。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1,4,3,2]
 *
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ol>
 * 	<li><strong>n</strong>&nbsp;是正整数,范围在 [1, 10000].</li>
 * 	<li>数组中的元素范围在 [-10000, 10000].</li>
 * </ol>
 */
@Problem(
    id = 561,
    name = "array-partition-i",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class ArrayPartitionI {

    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
