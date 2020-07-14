package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/contains-duplicate-ii/">存在重复元素 II</a>
 *
 * <p>给定一个整数数组和一个整数&nbsp;<em>k</em>，判断数组中是否存在两个不同的索引<em>&nbsp;i</em>&nbsp;和<em>&nbsp;j</em>，使得&nbsp;<strong>nums [i] = nums [j]</strong>，并且 <em>i</em> 和 <em>j</em>&nbsp;的差的绝对值最大为 <em>k</em>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [1,2,3,1], k<em> </em>= 3
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,0,1,1], k<em> </em>=<em> </em>1
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,2,3,1,2,3], k<em> </em>=<em> </em>2
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>contains-duplicate</li>
 *   <li>contains-duplicate-iii</li>
 * </ul>
 */
@Problem(
    id = 219,
    name = "contains-duplicate-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class ContainsDuplicateII {

    /**
     * 使用Set维护一个滑动窗口集合
     * 依次遍历数组, 如果Set中存在当前元素, 则返回true. 否则将当前元素加入到Set中.
     * 如果Set长度超过了k, 则删除第一个元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
