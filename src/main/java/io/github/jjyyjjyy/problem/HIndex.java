package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/h-index/">H指数</a>
 *
 * <p>给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 <em>h&nbsp;</em>指数。</p>
 *
 * <p><a href="https://baike.baidu.com/item/h-index/3991452?fr=aladdin" target="_blank">h 指数的定义</a>: &ldquo;h 代表&ldquo;高引用次数&rdquo;（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）<strong>至多</strong>有 h 篇论文分别被引用了<strong>至少</strong> h 次。（其余的&nbsp;<em>N - h&nbsp;</em>篇论文每篇被引用次数<strong>不多于 </strong><em>h </em>次。）&rdquo;</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>citations = [3,0,6,1,5]</code>
 * <strong>输出:</strong> 3
 * <strong>解释: </strong>给定数组表示研究者总共有 <code>5</code> 篇论文，每篇论文相应的被引用了 <code>3, 0, 6, 1, 5</code> 次。
 * &nbsp;    由于研究者有 <code>3 </code>篇论文每篇<strong>至少</strong>被引用了 <code>3</code> 次，其余两篇论文每篇被引用<strong>不多于</strong> <code>3</code> 次，所以她的 <em>h </em>指数是 <code>3</code>。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>说明:&nbsp;</strong>如果 <em>h </em>有多种可能的值，<em>h</em> 指数是其中最大的那个。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>h-index-ii</li>
 * </ul>
 */
@Problem(
    id = 274,
    name = "h-index",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.HASH_TABLE}
)
public class HIndex {

    /**
     * 1. 将数组降序排序.
     * 2. 找到数组值比索引大的最大下标, 加1即为最大引用次数.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int result = 0;
        while (result < citations.length && citations[citations.length - 1 - result] > result) {
            result++;
        }
        return result;
    }

    /**
     * 1. 维护一个数组对citations计数排序.
     * 2. 从右向左遍历, 将计数累加, 直到数组下标>=计数累加值.
     * 3. 此时下标即为最大引用次数.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int hIndex2(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n + 1];
        for (int citation : citations) {
            counts[Math.min(n, citation)]++;
        }
        int result = n;
        for (int i = counts[n]; i < result; i += counts[result]) {
            result--;
        }
        return result;
    }
}
