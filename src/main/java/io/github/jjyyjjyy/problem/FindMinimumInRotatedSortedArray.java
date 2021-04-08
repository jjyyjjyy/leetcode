package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/">寻找旋转排序数组中的最小值</a>
 *
 * <p>假设按照升序排序的数组在预先未知的某个点上进行了旋转。</p>
 *
 * <p>( 例如，数组&nbsp;<code>[0,1,2,4,5,6,7]</code> <strong> </strong>可能变为&nbsp;<code>[4,5,6,7,0,1,2]</code>&nbsp;)。</p>
 *
 * <p>请找出其中最小的元素。</p>
 *
 * <p>你可以假设数组中不存在重复元素。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,4,5,1,2]
 * <strong>输出:</strong> 1</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [4,5,6,7,0,1,2]
 * <strong>输出:</strong> 0</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-rotated-sorted-array</li>
 *   <li>find-minimum-in-rotated-sorted-array-ii</li>
 * </ul>
 */
@Problem(
    id = 153,
    name = "find-minimum-in-rotated-sorted-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class FindMinimumInRotatedSortedArray {

    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
