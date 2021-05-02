package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/brick-wall/">砖墙</a>
 *
 * <p>你的面前有一堵方形的、由多行砖块组成的砖墙。&nbsp;这些砖块高度相同但是宽度不同。你现在要画一条<strong>自顶向下</strong>的、穿过<strong>最少</strong>砖块的垂线。</p>
 *
 * <p>砖墙由行的列表表示。 每一行都是一个代表从左至右每块砖的宽度的整数列表。</p>
 *
 * <p>如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你需要找出怎样画才能使这条线穿过的砖块数量最少，并且返回穿过的砖块数量。</p>
 *
 * <p><strong>你不能沿着墙的两个垂直边缘之一画线，这样显然是没有穿过一块砖的。</strong></p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入:</strong> [[1,2,2,1],
 *       [3,1,2],
 *       [1,3,2],
 *       [2,4],
 *       [3,1,2],
 *       [1,3,1,1]]
 *
 * <strong>输出:</strong> 2
 *
 * <strong>解释:</strong>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/brick_wall.png" style="width: 100%; max-width: 350px">
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>每一行砖块的宽度之和应该相等，并且不能超过 INT_MAX。</li>
 * 	<li>每一行砖块的数量在&nbsp;[1,10,000] 范围内，&nbsp;墙的高度在&nbsp;[1,10,000] 范围内，&nbsp;总的砖块数量不超过 20,000。</li>
 * </ol>
 */
@Problem(
    id = 554,
    name = "brick-wall",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE}
)
public class BrickWall {

    /**
     * 最少经过的边数=总边数-边出现最多的次数
     */
    @Complexity(Complexity.ComplexityType.O_M_N)
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> count = new HashMap<>();
        for (List<Integer> w : wall) {
            int sum = 0;
            for (int i = 0; i < w.size() - 1; i++) {
                sum += w.get(i);
                count.put(sum, count.getOrDefault(sum, 0) + 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return wall.size() - max;
    }
}
