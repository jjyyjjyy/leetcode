package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/">删除排序数组中的重复项 II</a>
 *
 * <p>给定一个排序数组，你需要在<strong><a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。</p>
 *
 * <p>不要使用额外的数组空间，你必须在<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a>修改输入数组</strong>并在使用 O(1) 额外空间的条件下完成。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>给定 <em>nums</em> = <strong>[1,1,1,2,2,3]</strong>,
 *
 * 函数应返回新长度 length = <strong><code>5</code></strong>, 并且原数组的前五个元素被修改为 <strong><code>1, 1, 2, 2,</code></strong> <strong>3 </strong>。
 *
 * 你不需要考虑数组中超出新长度后面的元素。</pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>给定 <em>nums</em> = <strong>[0,0,1,1,1,1,2,3,3]</strong>,
 *
 * 函数应返回新长度 length = <strong><code>7</code></strong>, 并且原数组的前五个元素被修改为&nbsp;<strong><code>0</code></strong>, <strong>0</strong>, <strong>1</strong>, <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>3 。</strong>
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
 * }</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-duplicates-from-sorted-array</li>
 * </ul>
 */
@Problem(
    id = 80,
    name = "remove-duplicates-from-sorted-array-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class RemoveDuplicatesFromSortedArrayII {

    /**
     * 1. 如果数组长度小于3, 则直接返回.
     * 2. 初始化变量position=2, 标记当前位置.
     * 3. 从位置2开始遍历, 如果当前元素值与position-2的值不相等, 则将当前值赋值到position处, position前进一位.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int position = Math.min(2, n);

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[position - 2]) {
                nums[position++] = nums[i];
            }
        }
        return position;
    }
}
