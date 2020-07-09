package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-element/">移除元素</a>
 *
 * <p>给定一个数组 <em>nums&nbsp;</em>和一个值 <em>val</em>，你需要<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>移除所有数值等于&nbsp;<em>val&nbsp;</em>的元素，返回移除后数组的新长度。</p>
 *
 * <p>不要使用额外的数组空间，你必须在<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a>修改输入数组</strong>并在使用 O(1) 额外空间的条件下完成。</p>
 *
 * <p>元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>给定 <em>nums</em> = <strong>[3,2,2,3]</strong>, <em>val</em> = <strong>3</strong>,
 *
 * 函数应该返回新的长度 <strong>2</strong>, 并且 <em>nums </em>中的前两个元素均为 <strong>2</strong>。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>给定 <em>nums</em> = <strong>[0,1,2,2,3,0,4,2]</strong>, <em>val</em> = <strong>2</strong>,
 *
 * 函数应该返回新的长度 <strong><code>5</code></strong>, 并且 <em>nums </em>中的前五个元素为 <strong><code>0</code></strong>, <strong><code>1</code></strong>, <strong><code>3</code></strong>, <strong><code>0</code></strong>, <strong>4</strong>。
 *
 * 注意这五个元素可为任意顺序。
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
 * <pre>// <strong>nums</strong> 是以&ldquo;引用&rdquo;方式传递的。也就是说，不对实参作任何拷贝
 * int len = removeElement(nums, val);
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
 *   <li>remove-duplicates-from-sorted-array</li>
 *   <li>remove-linked-list-elements</li>
 *   <li>move-zeroes</li>
 * </ul>
 */
@Problem(
    id = 27,
    name = "remove-element",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class RemoveElement {

    /**
     * 1. 维护快慢两个指针初始化为0.
     * 2. 如果快指针处的值不等于指定值, 则将快指针处的值赋值给慢指针, 满指针向前进一位.
     * 3. 快指针向后进一位, 重复步骤2.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    /**
     * 1. 维护快指针和尾指针.
     * 2. 如果快指针的值等于指定值, 则交换两个指针处的值, 尾指针向前进一位.
     * 3. 重复步骤2, 直到快指针等于尾指针.
     * 4. 尾指针的索引值即为数组元素的数量.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[--n];
            } else {
                i++;
            }
        }
        return n;
    }
}
