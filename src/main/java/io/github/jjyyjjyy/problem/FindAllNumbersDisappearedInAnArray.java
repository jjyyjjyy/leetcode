package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/">找到所有数组中消失的数字</a>
 *
 * <p>给定一个范围在&nbsp; 1 &le; a[i] &le; <em>n</em> (&nbsp;<em>n</em> = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。</p>
 *
 * <p>找到所有在 [1, <em>n</em>] 范围之间没有出现在数组中的数字。</p>
 *
 * <p>您能在不使用额外空间且时间复杂度为<em>O(n)</em>的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * [4,3,2,7,8,2,3,1]
 *
 * <strong>输出:</strong>
 * [5,6]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-missing-positive</li>
 *   <li>find-all-duplicates-in-an-array</li>
 * </ul>
 */
@Problem(
    id = 448,
    name = "find-all-numbers-disappeared-in-an-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class FindAllNumbersDisappearedInAnArray {

    /**
     * 1. 遍历数组, 将每个元素的值作为索引, 将该索引的值的绝对值减去1,再乘以-1变成负数.
     * 2. 遍历数组, 如果idx所在的元素为整数, 则表示数组缺少idx+1.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
