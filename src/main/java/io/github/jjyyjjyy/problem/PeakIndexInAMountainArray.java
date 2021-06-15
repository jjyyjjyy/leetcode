package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/">山脉数组的峰顶索引</a>
 *
 * <p>我们把符合下列属性的数组&nbsp;<code>A</code>&nbsp;称作山脉：</p>
 *
 * <ul>
 * 	<li><code>A.length &gt;= 3</code></li>
 * 	<li>存在 <code>0 &lt; i&nbsp;&lt; A.length - 1</code> 使得<code>A[0] &lt; A[1] &lt; ... A[i-1] &lt; A[i] &gt; A[i+1] &gt; ... &gt; A[A.length - 1]</code></li>
 * </ul>
 *
 * <p>给定一个确定为山脉的数组，返回任何满足&nbsp;<code>A[0] &lt; A[1] &lt; ... A[i-1] &lt; A[i] &gt; A[i+1] &gt; ... &gt; A[A.length - 1]</code>&nbsp;的 <code>i</code>&nbsp;的值。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[0,1,0]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[0,2,1,0]
 * <strong>输出：</strong>1</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>3 &lt;= A.length &lt;= 10000</code></li>
 * 	<li>0 &lt;= A[i] &lt;= 10^6</li>
 * 	<li>A 是如上定义的山脉</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-peak-element</li>
 * </ul>
 */
@Problem(
    id = 882,
    name = "peak-index-in-a-mountain-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.BINARY_SEARCH}
)
public class PeakIndexInAMountainArray {

    /**
     * 二分查找
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int peakIndexInMountainArray(int[] arr) {
        int result = 0;
        int left = 1;
        int right = arr.length - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }

    /**
     * 依次遍历数组, 直到arr[i]>=arr[i+1]
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int peakIndexInMountainArray2(int[] arr) {
        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }

}
