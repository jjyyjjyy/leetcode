package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/max-points-on-a-line/">直线上最多的点数</a>
 *
 * <p>给定一个二维平面，平面上有&nbsp;<em>n&nbsp;</em>个点，求最多有多少个点在同一条直线上。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,1],[2,2],[3,3]]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * ^
 * |
 * | &nbsp; &nbsp; &nbsp; &nbsp;o
 * | &nbsp; &nbsp; o
 * | &nbsp;o &nbsp;
 * +-------------&gt;
 * 0 &nbsp;1 &nbsp;2 &nbsp;3  4
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong>
 * ^
 * |
 * |  o
 * | &nbsp;&nbsp;&nbsp;&nbsp;o&nbsp;&nbsp;      o
 * | &nbsp;&nbsp;&nbsp;&nbsp;   o
 * | &nbsp;o &nbsp;      o
 * +-------------------&gt;
 * 0 &nbsp;1 &nbsp;2 &nbsp;3 &nbsp;4 &nbsp;5 &nbsp;6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>line-reflection</li>
 * </ul>
 */
@Problem(
    id = 149,
    name = "max-points-on-a-line",
    difficulty = Difficulty.HARD,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class MaxPointsOnALine {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n^2*logm)")
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) {
            return n;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (result >= n - i || result > n / 2) {
                break;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                if (x == 0) {
                    y = 1;
                } else if (y == 0) {
                    x = 1;
                } else {
                    if (y < 0) {
                        x = -x;
                        y = -y;
                    }
                    int gcdXY = gcd(Math.abs(x), Math.abs(y));
                    x /= gcdXY;
                    y /= gcdXY;
                }
                int key = y + x * 20001;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getValue();
                max = Math.max(max, num + 1);
            }
            result = Math.max(result, max);
        }
        return result;
    }

    private int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
