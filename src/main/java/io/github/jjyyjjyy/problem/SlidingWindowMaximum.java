package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode-cn.com/problems/sliding-window-maximum/">滑动窗口最大值</a>
 *
 * <p>给定一个数组 <em>nums</em>，有一个大小为&nbsp;<em>k&nbsp;</em>的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 <em>k</em>&nbsp;个数字。滑动窗口每次只向右移动一位。</p>
 *
 * <p>返回滑动窗口中的最大值。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <em>nums</em> = <code>[1,3,-1,-3,5,3,6,7]</code>, 和 <em>k</em> = 3
 * <strong>输出: </strong><code>[3,3,5,5,6,7]
 * <strong>解释:
 * </strong></code>
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <p>你可以假设 <em>k </em>总是有效的，在输入数组不为空的情况下，1 &le; k &le;&nbsp;输入数组的大小。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <p>你能在线性时间复杂度内解决此题吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>minimum-window-substring</li>
 *   <li>min-stack</li>
 *   <li>longest-substring-with-at-most-two-distinct-characters</li>
 *   <li>paint-house-ii</li>
 * </ul>
 */
@Problem(
    id = 239,
    name = "sliding-window-maximum",
    difficulty = Difficulty.HARD,
    tags = {Tag.HEAP, Tag.SLIDING_WINDOW}
)
public class SlidingWindowMaximum {

    /**
     * 1. 维护一个双端队列, 用来保存元素下标, 且小标对应的元素单调递减.
     * 2. 依次遍历数组(n-k+1).
     * 2.1. 循环判断如果队列尾部索引的值比当前元素小, 则删除尾部元素.
     * 2.2. 将当前索引加入到队列尾部.
     * 2.3. 循环判断队列头部的位置是否比当前索引小, 如果小则删除队列头部索引.
     * 2.4. 当前队列头部索引对应的元素即为当前滑动窗口的最大值, 加入到结果集中.
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!indexes.isEmpty() && nums[i] >= nums[indexes.peekLast()]) {
                indexes.pollLast();
            }
            indexes.offerLast(i);
        }

        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int index = i + k - 1;
            while (!indexes.isEmpty() && nums[index] >= nums[indexes.peekLast()]) {
                // 删除当前窗口中比当前元素还小的元素([内卷] 当前元素存活周期更长且值更大)
                indexes.pollLast();
            }
            indexes.offerLast(index);
            // 删除窗口左边较大的元素([开猿])
            while (indexes.peekFirst() < i) {
                indexes.pollFirst();
            }
            result[i] = nums[indexes.peekFirst()];
        }

        return result;
    }

    /**
     * 1. 维护一个最大堆, 存放数组的元素和索引的二元组.
     * 2. 现将k-1个元素放入到堆中.
     * 3. 依次遍历数组(n-k-1), 将当前元素存入堆中, 然后将堆顶的之前的元素删除(此处只处理堆顶元素, 如果滑动窗口之前的元素不是最大值, 可以后面再删), 再将堆顶的元素放入结果集中.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<IndexedValue> heap = new PriorityQueue<>((a, b) -> b.value - a.value);
        for (int i = 0; i < k - 1; i++) {
            heap.add(new IndexedValue(nums[i], i));
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int index = i + k - 1;
            heap.add(new IndexedValue(nums[index], index));
            while (heap.peek().index < i) {
                heap.poll();
            }
            result[i] = heap.peek().value;
        }
        return result;
    }

    private static class IndexedValue {
        private int value;
        private int index;

        public IndexedValue(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

}
