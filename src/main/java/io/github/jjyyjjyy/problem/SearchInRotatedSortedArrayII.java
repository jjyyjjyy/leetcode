package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/">搜索旋转排序数组 II</a>
 *
 * <p>假设按照升序排序的数组在预先未知的某个点上进行了旋转。</p>
 *
 * <p>( 例如，数组&nbsp;<code>[0,0,1,2,2,5,6]</code>&nbsp;可能变为&nbsp;<code>[2,5,6,0,0,1,2]</code>&nbsp;)。</p>
 *
 * <p>编写一个函数来判断给定的目标值是否存在于数组中。若存在返回&nbsp;<code>true</code>，否则返回&nbsp;<code>false</code>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [2<code>,5,6,0,0,1,2]</code>, target = 0
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [2<code>,5,6,0,0,1,2]</code>, target = 3
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <ul>
 * 	<li>这是 <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/description/">搜索旋转排序数组</a>&nbsp;的延伸题目，本题中的&nbsp;<code>nums</code>&nbsp; 可能包含重复元素。</li>
 * 	<li>这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-rotated-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 81,
    name = "search-in-rotated-sorted-array-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class SearchInRotatedSortedArrayII {

    /**
     * 1. 定义left, right, mid三个指针.
     * 2. 如果mid元素与target相同, 则找到该元素.
     * 3. 如果left元素与mid元素相同, 则无法判断左右两半部分是否偏序, 只能将left前进一位.
     * 4. 如果left元素小于mid元素, 说明左侧偏序. 判断target是否满足left<=target<mid, 如果满足则说明在左半部分找(right=mid-1), 不满足则在右半部分找(left=mid+1).
     * 5. 如果left元素大于等于mid元素, 说明右侧偏序. 判断target是否满足mid<target<=right, 如果满足则说明在右半部分找(left=mid+1), 不满足则在左半部分找(right=mid-1).
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid]) {
                left++;
            } else if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
