package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * <a href="https://leetcode-cn.com/problems/contains-duplicate-iii/">存在重复元素 III</a>
 *
 * <p>给定一个整数数组，判断数组中是否有两个不同的索引 <em>i</em> 和 <em>j</em>，使得&nbsp;<strong>nums [i]</strong> 和&nbsp;<strong>nums [j]</strong>&nbsp;的差的绝对值最大为 <em>t</em>，并且 <em>i</em> 和 <em>j</em> 之间的差的绝对值最大为 <em>ķ</em>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [1,2,3,1], k<em> </em>= 3, t = 0
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,0,1,1], k<em> </em>=<em> </em>1, t = 2
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,5,9,1,5,9], k = 2, t = 3
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>contains-duplicate</li>
 *   <li>contains-duplicate-ii</li>
 * </ul>
 */
@Problem(
    id = 220,
    name = "contains-duplicate-iii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.ORDERED_MAP}
)
public class ContainsDuplicateIII {

    /**
     * 1. 维护一个哈希表, 保存桶序号和元素的对应关系.
     * 2. 依次遍历数组, 计算出当前元素的序号.
     * 2.1. 如果哈希表中存在该序号, 则说明符合条件的元素, 返回true.
     * 2.2. 如果哈希表中前一个桶和后一个桶中存在于当前元素相差为t的元素, 则返回true.
     * 2.3. 将当前元素和序号放到桶中.
     * 2.4. 将桶中序号为i-k的元素删除掉.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) {
            return false;
        }
        Map<Long, Long> bucket = new HashMap<>();
        long w = (long) t + 1;
        for (int i = 0; i < nums.length; i++) {
            long id = getId(nums[i], w);
            if (bucket.containsKey(id)) {
                return true;
            }
            if (bucket.containsKey(id + 1) && bucket.get(id + 1) - nums[i] < w) {
                return true;
            }
            if (bucket.containsKey(id - 1) && nums[i] - bucket.get(id - 1) < w) {
                return true;
            }
            bucket.put(id, (long) nums[i]);
            if (i >= k) {
                bucket.remove(getId(nums[i - k], w));
            }
        }
        return false;
    }

    /**
     * 1. 维护一个有序二叉树.
     * 2. 依次遍历数组, 判断当前数值在树中是否存在相差为t的前驱节点和后继节点, 如果存在则返回true.
     * 3. 将当前元素插入到树中, 并将i-k的元素从树中剪枝掉.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public boolean containsNearbyAlmostDuplicate2(int[] nums, int k, int t) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer ceiling = treeSet.ceiling(num);
            if (ceiling != null && ceiling <= (long) num + t) {
                return true;
            }
            Integer floor = treeSet.floor(num);
            if (floor != null && num <= (long) floor + t) {
                return true;
            }
            treeSet.add(num);
            if (treeSet.size() > k) {
                treeSet.remove(nums[i - k]);
            }
        }
        return false;
    }

    private long getId(long num, long w) {
        return num >= 0 ? num / w : (num + 1) / w - 1;
    }
}
