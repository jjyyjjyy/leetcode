package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">删除排序数组中的重复项</a>
 *
 * <p>给定一个排序数组，你需要在<strong><a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。</p>
 *
 * <p>不要使用额外的数组空间，你必须在<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a>修改输入数组</strong>并在使用 O(1) 额外空间的条件下完成。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>给定数组 <em>nums</em> = <strong>[1,1,2]</strong>,
 *
 * 函数应该返回新的长度 <strong>2</strong>, 并且原数组 <em>nums </em>的前两个元素被修改为 <strong><code>1</code></strong>, <strong><code>2</code></strong>。
 *
 * 你不需要考虑数组中超出新长度后面的元素。</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>给定<em> nums </em>= <strong>[0,0,1,1,1,2,2,3,3,4]</strong>,
 *
 * 函数应该返回新的长度 <strong>5</strong>, 并且原数组 <em>nums </em>的前五个元素被修改为 <strong><code>0</code></strong>, <strong><code>1</code></strong>, <strong><code>2</code></strong>, <strong><code>3</code></strong>, <strong><code>4</code></strong>。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>为什么返回数值是整数，但输出的答案是数组呢?</p>
 *
 * <p>请注意，输入数组是以<strong>&ldquo;引用&rdquo;</strong>方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。</p>
 *
 * <p>你可以想象内部操作如下:</p>
 *
 * <pre>// <strong>nums</strong> 是以&ldquo;引用&rdquo;方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 *
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中<strong>该长度范围内</strong>的所有元素。
 * for (int i = 0; i &lt; len; i++) {
 * &nbsp; &nbsp; print(nums[i]);
 * }
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-element</li>
 *   <li>remove-duplicates-from-sorted-array-ii</li>
 * </ul>
 */
@Problem(
    id = 26,
    name = "remove-duplicates-from-sorted-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class RemoveDuplicatesFromSortedArray {

    /**
     * 1. 维护快慢两个指针初始化为0.
     * 2. 如果快指针的值等于慢指针处的值, 慢指针向后进一位.
     * 3. 快指针向后进一位, 重复步骤2.
     * 4. 最后慢指针的值加1就是数组中不重复的元素数量.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
