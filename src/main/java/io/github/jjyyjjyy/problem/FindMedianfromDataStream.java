package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-median-from-data-stream/">数据流的中位数</a>
 *
 * <p>中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。</p>
 *
 * <p>例如，</p>
 *
 * <p>[2,3,4]&nbsp;的中位数是 3</p>
 *
 * <p>[2,3] 的中位数是 (2 + 3) / 2 = 2.5</p>
 *
 * <p>设计一个支持以下两种操作的数据结构：</p>
 *
 * <ul>
 * 	<li>void addNum(int num) - 从数据流中添加一个整数到数据结构中。</li>
 * 	<li>double findMedian() - 返回目前所有元素的中位数。</li>
 * </ul>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>addNum(1)
 * addNum(2)
 * findMedian() -&gt; 1.5
 * addNum(3)
 * findMedian() -&gt; 2</pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <ol>
 * 	<li>如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？</li>
 * 	<li>如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>sliding-window-median</li>
 * </ul>
 */
@Problem(
    id = 295,
    name = "find-median-from-data-stream",
    difficulty = Difficulty.HARD,
    tags = {Tag.HEAP, Tag.DESIGN}
)
public class FindMedianfromDataStream {
}
