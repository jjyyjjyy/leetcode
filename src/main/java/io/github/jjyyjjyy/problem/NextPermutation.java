package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/next-permutation/">下一个排列</a>
 *
 * <p>实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。</p>
 *
 * <p>如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。</p>
 *
 * <p>必须<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>修改，只允许使用额外常数空间。</p>
 *
 * <p>以下是一些例子，输入位于左侧列，其相应输出位于右侧列。<br>
 * <code>1,2,3</code> &rarr; <code>1,3,2</code><br>
 * <code>3,2,1</code> &rarr; <code>1,2,3</code><br>
 * <code>1,1,5</code> &rarr; <code>1,5,1</code></p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>permutations</li>
 *   <li>permutations-ii</li>
 *   <li>permutation-sequence</li>
 *   <li>palindrome-permutation-ii</li>
 * </ul>
 */
@Problem(
    id = 31,
    name = "next-permutation",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class NextPermutation {

    /**
     * 1. 从右向左遍历, 找到位置i比i+1小的元素.
     * 2. 如果找到i了, 再次从右向左遍历, 找到最右侧比i大的位置j, 交换i和j位置上的元素.
     * 3. 翻转从i+1到最后一个元素.(因为i+1向后是逆序的, 翻转后可以变成顺序的)
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
