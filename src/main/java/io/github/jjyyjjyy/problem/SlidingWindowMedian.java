package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode-cn.com/problems/sliding-window-median/">滑动窗口中位数</a>
 *
 * <p>中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。</p>
 *
 * <p>例如：</p>
 *
 * <p><code>[2,3,4]</code>，中位数是&nbsp;<code>3</code></p>
 *
 * <p><code>[2,3]</code>，中位数是 <code>(2 + 3) / 2 = 2.5</code></p>
 *
 * <p>给出一个数组 nums，有一个大小为 <em>k</em> 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。</p>
 *
 * <p>例如：</p>
 *
 * <p>给出&nbsp;<em>nums</em> = <code>[1,3,-1,-3,5,3,6,7]</code>，以及&nbsp;<em>k</em> = 3。</p>
 *
 * <pre>
 * 窗口位置                      中位数
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       1
 *  1 [3  -1  -3] 5  3  6  7       -1
 *  1  3 [-1  -3  5] 3  6  7       -1
 *  1  3  -1 [-3  5  3] 6  7       3
 *  1  3  -1  -3 [5  3  6] 7       5
 *  1  3  -1  -3  5 [3  6  7]      6
 * </pre>
 *
 * <p>&nbsp;因此，返回该滑动窗口的中位数数组&nbsp;<code>[1,-1,-1,3,5,6]</code>。</p>
 *
 * <p><strong>提示：</strong><br />
 * 假设<code>k</code>是合法的，即：<code>k</code> 始终小于输入的非空数组的元素个数.</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-median-from-data-stream</li>
 * </ul>
 */
@Problem(
    id = 480,
    name = "sliding-window-median",
    difficulty = Difficulty.HARD,
    tags = {Tag.SLIDING_WINDOW}
)
public class SlidingWindowMedian {

    /**
     * 1. 创建一个双堆数据结构来维护滑动窗口的元素, 分别存放较小的一般元素和较大的一半元素, 其中保证small的长度大于等于large的长度.
     * 2. 依次遍历数组, 将窗口内数组元素放入双堆中, 并删除窗口左边的元素, 保存当前的中位数.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public double[] medianSlidingWindow(int[] nums, int k) {
        DualHeap dualHeap = new DualHeap(k);
        for (int i = 0; i < k; i++) {
            dualHeap.insert(nums[i]);
        }
        double[] result = new double[nums.length - k + 1];
        result[0] = dualHeap.getMedian();
        for (int i = k; i < nums.length; i++) {
            dualHeap.insert(nums[i]);
            dualHeap.erase(nums[i - k]);
            result[i - k + 1] = dualHeap.getMedian();
        }
        return result;
    }

    private static class DualHeap {

        private final int k;

        private PriorityQueue<Integer> small = new PriorityQueue<>(Comparator.reverseOrder());
        private PriorityQueue<Integer> large = new PriorityQueue<>(Integer::compareTo);
        private Map<Integer, Integer> deleted = new HashMap<>();
        private int smallSize;
        private int largeSize;

        private DualHeap(int k) {
            this.k = k;
        }

        public void insert(int num) {
            if (small.isEmpty() || num <= small.element()) {
                // 元素比small堆顶元素还小, 则加入small堆中
                small.add(num);
                smallSize++;
            } else {
                large.add(num);
                largeSize++;
            }
            makeBalance();
        }

        private void makeBalance() {
            if (smallSize < largeSize) {
                // large - small = 1
                small.add(large.poll());
                smallSize++;
                largeSize--;
                prune(large);
            } else if (smallSize > largeSize + 1) {
                // small - large = 2
                large.add(small.poll());
                smallSize--;
                largeSize++;
                prune(small);
            }
        }

        private void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                int top = heap.element();
                if (!deleted.containsKey(top)) {
                    break;
                }
                deleted.put(top, deleted.get(top) - 1);
                if (deleted.get(top) == 0) {
                    deleted.remove(top);
                }
                heap.poll();
            }

        }


        public void erase(int num) {
            deleted.put(num, deleted.getOrDefault(num, 0) + 1);
            if (num <= small.element()) {
                smallSize--;
                if (small.element() == num) {
                    prune(small);
                }
            } else {
                largeSize--;
                if (large.element() == num) {
                    prune(large);
                }
            }
            makeBalance();
        }

        public double getMedian() {
            if ((k & 1) == 1) {
                return small.element();
            } else {
                return ((double) small.element() + large.element()) / 2;
            }
        }
    }
}
