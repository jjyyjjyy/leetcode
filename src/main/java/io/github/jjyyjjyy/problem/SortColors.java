package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sort-colors/">颜色分类</a>
 *
 * <p>给定一个包含红色、白色和蓝色，一共&nbsp;<em>n </em>个元素的数组，<strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong>对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。</p>
 *
 * <p>此题中，我们使用整数 0、&nbsp;1 和 2 分别表示红色、白色和蓝色。</p>
 *
 * <p><strong>注意:</strong><br>
 * 不能使用代码库中的排序函数来解决这道题。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,0,2,1,1,0]
 * <strong>输出:</strong> [0,0,1,1,2,2]</pre>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <ul>
 * 	<li>一个直观的解决方案是使用计数排序的两趟扫描算法。<br>
 * 	首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。</li>
 * 	<li>你能想出一个仅使用常数空间的一趟扫描算法吗？</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sort-list</li>
 *   <li>wiggle-sort</li>
 *   <li>wiggle-sort-ii</li>
 * </ul>
 */
@Problem(
    id = 75,
    name = "sort-colors",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.ARRAY, Tag.TWO_POINTERS}
)
public class SortColors {

    /**
     * 1. 维护两个指针p1和p2, p1指向最后一个0的右侧, p2指向第一个2的左侧.
     * 2. 依次遍历数组:
     * 2.1. 如果当前值等于1, 则继续遍历.
     * 2.2. 如果当前值等于0, 则交换p1和当前值, p1前进一位, 继续遍历.
     * 2.3. 如果当前值等于2, 则交换p2和当前值, p2后退一位.
     * 2.4. 如果当前位置超过p2, 则结束遍历.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        int current = 0;
        while (current <= p2) {
            int currentNum = nums[current];
            if (currentNum == 1) {
                current++;
            } else if (currentNum == 0) {
                swap(nums, current++, p1++);
            } else {
                swap(nums, current, p2--);
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
