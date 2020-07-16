package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 *
 * <p>给定一个数组 <code>nums</code>，编写一个函数将所有 <code>0</code> 移动到数组的末尾，同时保持非零元素的相对顺序。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[0,1,0,3,12]</code>
 * <strong>输出:</strong> <code>[1,3,12,0,0]</code></pre>
 *
 * <p><strong>说明</strong>:</p>
 *
 * <ol>
 * 	<li>必须在原数组上操作，不能拷贝额外的数组。</li>
 * 	<li>尽量减少操作次数。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-element</li>
 * </ul>
 */
@Problem(
    id = 283,
    name = "move-zeroes",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class MoveZeroes {

    /**
     * 1. 维护快慢两个指针, 慢指针指向遍历出来的最后一个非0元素的位置.
     * 2. 如果快指针所在的元素不为0, 则交换快慢指针两个位置上的元素, 慢指针前进一位.
     * 3. 快指针前进一位.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void moveZeroes(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, last++, i);
            }
        }
    }

    private void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    /**
     * 1. 维护快慢两个指针, 其中慢指针的前导元素都为0.
     * 2. 依次遍历数组, 如果快指针所在元素非0, 则就赋值到慢指针位置, 慢指针前进一位.
     * 3. 快指针前进一位.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void moveZeroes2(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[last++] = nums[i];
            }
        }
        for (int i = last; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
