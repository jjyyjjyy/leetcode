package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/first-bad-version/">第一个错误的版本</a>
 *
 * <p>你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。</p>
 *
 * <p>假设你有 <code>n</code> 个版本 <code>[1, 2, ..., n]</code>，你想找出导致之后所有版本出错的第一个错误的版本。</p>
 *
 * <p>你可以通过调用&nbsp;<code>bool isBadVersion(version)</code>&nbsp;接口来判断版本号 <code>version</code> 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>给定 n = 5，并且 version = 4 是第一个错误的版本。
 *
 * <code>调用 isBadVersion(3) -&gt; false
 * 调用 isBadVersion(5)&nbsp;-&gt; true
 * 调用 isBadVersion(4)&nbsp;-&gt; true
 *
 * 所以，4 是第一个错误的版本。&nbsp;</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-first-and-last-position-of-element-in-sorted-array</li>
 *   <li>search-insert-position</li>
 *   <li>guess-number-higher-or-lower</li>
 * </ul>
 */
@Problem(
    id = 278,
    name = "first-bad-version",
    difficulty = Difficulty.EASY,
    tags = {Tag.BINARY_SEARCH}
)
public class FirstBadVersion {

    /**
     * 1. 二分查找, 判断mid是不是badVersion.
     * 1.1. 如果mid是badVersion, 则将搜索区间改为[left, mid].
     * 1.2. 如果mid不是badVersion, 则将搜索区间改为[mid+1, right].
     * 2. 一直遍历到right>=left, 此时left就是最小的badVersion.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 依次从1遍历到n, 找到最小的badVersion.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int firstBadVersion2(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }

    private boolean isBadVersion(int version) {
        return version > 3;
    }
}
