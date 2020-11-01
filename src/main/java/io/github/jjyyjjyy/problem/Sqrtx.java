package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sqrtx/">x 的平方根</a>
 *
 * <p>实现&nbsp;<code>int sqrt(int x)</code>&nbsp;函数。</p>
 *
 * <p>计算并返回&nbsp;<em>x</em>&nbsp;的平方根，其中&nbsp;<em>x </em>是非负整数。</p>
 *
 * <p>由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 4
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 8
 * <strong>输出:</strong> 2
 * <strong>说明:</strong> 8 的平方根是 2.82842...,
 * &nbsp;    由于返回类型是整数，小数部分将被舍去。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>powx-n</li>
 *   <li>valid-perfect-square</li>
 * </ul>
 */
@Problem(
    id = 69,
    name = "sqrtx",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH, Tag.BINARY_SEARCH}
)
public class Sqrtx {

    /**
     * stem:[x^(1/2)=e^(lnx^(1/2))]
     */
    public int mySqrt(int x) {
        int candidate = (int) Math.exp(0.5 * Math.log(x));
        return (long) (candidate + 1) * (candidate + 1) <= x ? candidate + 1 : candidate;
    }

    /**
     * 牛顿迭代法
     */
    public int mySqrt2(int x) {
        if (x == 0) {
            return 0;
        }

        double x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + (double) x / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }


    /**
     * 二分查找0和x区间.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int mySqrt3(int x) {
        int start = 0;
        int end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid - x <= 0) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
