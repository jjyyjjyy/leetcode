package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/rotate-array/">旋转数组</a>
 *
 * <p>给定一个数组，将数组中的元素向右移动&nbsp;<em>k&nbsp;</em>个位置，其中&nbsp;<em>k&nbsp;</em>是非负数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[1,2,3,4,5,6,7]</code> 和 <em>k</em> = 3
 * <strong>输出:</strong> <code>[5,6,7,1,2,3,4]</code>
 * <strong>解释:</strong>
 * 向右旋转 1 步: <code>[7,1,2,3,4,5,6]</code>
 * 向右旋转 2 步: <code>[6,7,1,2,3,4,5]
 * </code>向右旋转 3 步: <code>[5,6,7,1,2,3,4]</code>
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[-1,-100,3,99]</code> 和 <em>k</em> = 2
 * <strong>输出:</strong> [3,99,-1,-100]
 * <strong>解释:</strong>
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ul>
 * 	<li>尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。</li>
 * 	<li>要求使用空间复杂度为&nbsp;O(1) 的&nbsp;<strong>原地&nbsp;</strong>算法。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>rotate-list</li>
 *   <li>reverse-words-in-a-string-ii</li>
 * </ul>
 */
@Problem(
    id = 189,
    name = "rotate-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class RotateArray {

    /**
     * 1. 遍历数组元素.
     * 2. 将元素与它下一个位置替换, 然后依次替换下一个元素, 直到替换的位置与当前的位置相等.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        int count = 0;
        for (int i = 0; count < length; i++) {
            int current = i;
            int prev = nums[i];
            do {
                int next = (current + k) % length;
                int tmp = nums[next];
                nums[next] = prev;
                prev = tmp;
                current = next;
                count++;
            } while (i != current);
        }
    }

    /**
     * 1. 将数组全部元素反转.
     * 2. 将数组元素0~k-1反转.
     * 3. 将数组元素k~length-1反转.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void rotate2(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    /**
     * 使用一个缓冲数组, 分别复制 0~(length-k-1) 和 (length-k)~(length-1) 到缓冲数组中. 最后将缓冲数组复制到原数组中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void rotate3(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        int[] arr = new int[length];
        System.arraycopy(nums, 0, arr, k, length - k);
        System.arraycopy(nums, length - k, arr, 0, k);
        System.arraycopy(arr, 0, nums, 0, length);
    }
}
