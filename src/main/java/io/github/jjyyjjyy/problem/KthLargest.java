package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/">数据流中的第K大元素</a>
 *
 * <p>设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。</p>
 *
 * <p>你的&nbsp;<code>KthLargest</code>&nbsp;类需要一个同时接收整数&nbsp;<code>k</code> 和整数数组<code>nums</code>&nbsp;的构造器，它包含数据流中的初始元素。每次调用&nbsp;<code>KthLargest.add</code>，返回当前数据流中第K大的元素。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);&nbsp; &nbsp;// returns 4
 * kthLargest.add(5);&nbsp; &nbsp;// returns 5
 * kthLargest.add(10);&nbsp; // returns 5
 * kthLargest.add(9);&nbsp; &nbsp;// returns 8
 * kthLargest.add(4);&nbsp; &nbsp;// returns 8
 * </pre>
 *
 * <p><strong>说明: </strong><br />
 * 你可以假设&nbsp;<code>nums</code>&nbsp;的长度&ge;&nbsp;<code>k-1</code>&nbsp;且<code>k</code> &ge;&nbsp;1。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>kth-largest-element-in-an-array</li>
 * </ul>
 */
@Problem(
    id = 789,
    name = "kth-largest-element-in-a-stream",
    difficulty = Difficulty.EASY,
    tags = {Tag.HEAP}
)
public class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int i : nums) {
            add(i);
        }
    }

    /**
     * 维护一个固定长度的最大堆, 每次add元素后返回堆顶元素.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int add(int val) {
        queue.add(val);
        while (queue.size() > k) {
            queue.poll();
        }
        return queue.element();
    }
}
