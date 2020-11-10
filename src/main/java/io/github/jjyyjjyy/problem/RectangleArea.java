package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/rectangle-area/">矩形面积</a>
 *
 * <p>在<strong>二维</strong>平面上计算出两个<strong>由直线构成的</strong>矩形重叠后形成的总面积。</p>
 *
 * <p>每个矩形由其左下顶点和右上顶点坐标表示，如图所示。</p>
 *
 * <p><img alt="Rectangle Area" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rectangle_area.png"></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> -3, 0, 3, 4, 0, -1, 9, 2
 * <strong>输出:</strong> 45</pre>
 *
 * <p><strong>说明:</strong> 假设矩形面积不会超出&nbsp;<strong>int&nbsp;</strong>的范围。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>rectangle-overlap</li>
 * </ul>
 */
@Problem(
    id = 223,
    name = "rectangle-area",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class RectangleArea {

    /**
     * 1. 首先计算出两个矩形面积之和, 如果两个矩形不重叠, 则直接返回.
     * 2. 计算出矩形重叠部分的上下左右坐标, 然后求得重叠部分的面积. 用总面积减去重叠部分的面积就得到了结果.
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int total = Math.abs(C - A) * Math.abs(D - B) + Math.abs(G - E) * Math.abs(H - F);
        if (E >= C || G <= A || H <= B || F >= D) {
            return total;
        }
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int down = Math.max(B, F);
        int top = Math.min(D, H);
        return total - (right - left) * (top - down);
    }
}
