package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">在排序数组中查找元素的第一个和最后一个位置</a>
 *
 * <p>给定一个按照升序排列的整数数组 <code>nums</code>，和一个目标值 <code>target</code>。找出给定目标值在数组中的开始位置和结束位置。</p>
 *
 * <p>你的算法时间复杂度必须是&nbsp;<em>O</em>(log <em>n</em>) 级别。</p>
 *
 * <p>如果数组中不存在目标值，返回&nbsp;<code>[-1, -1]</code>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>5,7,7,8,8,10]</code>, target = 8
 * <strong>输出:</strong> [3,4]</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [<code>5,7,7,8,8,10]</code>, target = 6
 * <strong>输出:</strong> [-1,-1]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-bad-version</li>
 * </ul>
 */
@Problem(
    id = 34,
    name = "find-first-and-last-position-of-element-in-sorted-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class FindFirstAndLastPositionOfElementInSortedArray {

    /**
     * 1. 使用二分法找到目标元素.
     * 2. 向左遍历一直找到和目标元素相等的最左的元素位置.
     * 3. 向右遍历一直找到和目标元素相等的最右的元素位置.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int l = mid;
                int r = mid;
                while (l > 0 && nums[l - 1] == target) {
                    l--;
                }
                while (r < nums.length - 1 && nums[r + 1] == target) {
                    r++;
                }
                return new int[]{l, r};
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 从左向右, 从右向左遍历, 找到目标元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] searchRange2(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = 0, right = nums.length - 1;
        boolean leftFounded = false, rightFounded = false;
        while (left <= right) {
            if (!leftFounded) {
                if (nums[left] == target) {
                    result[0] = left;
                    leftFounded = true;
                } else {
                    left++;
                }
            }
            if (!rightFounded) {
                if (nums[right] == target) {
                    result[1] = right;
                    rightFounded = true;
                } else {
                    right--;
                }
            }
            if (leftFounded && rightFounded) {
                break;
            }
        }
        return result;
    }
}
