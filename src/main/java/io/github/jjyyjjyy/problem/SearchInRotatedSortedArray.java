package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">搜索旋转排序数组</a>
 *
 * <p>假设按照升序排序的数组在预先未知的某个点上进行了旋转。</p>
 *
 * <p>( 例如，数组&nbsp;<code>[0,1,2,4,5,6,7]</code>&nbsp;可能变为&nbsp;<code>[4,5,6,7,0,1,2]</code>&nbsp;)。</p>
 *
 * <p>搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回&nbsp;<code>-1</code>&nbsp;。</p>
 *
 * <p>你可以假设数组中不存在重复的元素。</p>
 *
 * <p>你的算法时间复杂度必须是&nbsp;<em>O</em>(log&nbsp;<em>n</em>) 级别。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>4,5,6,7,0,1,2]</code>, target = 0
 * <strong>输出:</strong> 4
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>4,5,6,7,0,1,2]</code>, target = 3
 * <strong>输出:</strong> -1</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>search-in-rotated-sorted-array-ii</li>
 *   <li>find-minimum-in-rotated-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 33,
    name = "search-in-rotated-sorted-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class SearchInRotatedSortedArray {

    /**
     * 1. 二分搜索, mid左右两侧至少有一侧是顺序的.
     * 2. 如果mid等于target, 则返回mid.
     * 3. 如果left小于等于mid, 说明左侧是顺序的. 如果target在left和mid中间, 说明target处于这个区间, right变成mid-1. 否则说明target在右侧, left变成mid+1.
     * 4. 如果left大于mid, 说明右侧是顺序的. 如果target大于mid并且target小于right, 说明target处于这个区间内, left变成mid+1. 否则说明target在左侧, right变成mid-1.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
