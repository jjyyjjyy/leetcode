package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/volume-of-histogram-lcci/">直方图的水量</a>
 *
 * <p>给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rainwatertrap.png" style="height: 161px; width: 412px;"></p>
 *
 * <p><small>上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的直方图，在这种情况下，可以接 6 个单位的水（蓝色部分表示水）。&nbsp;<strong>感谢 Marcos</strong> 贡献此图。</small></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1,0,2,1,0,1,3,2,1,2,1]
 * <strong>输出:</strong> 6</pre>
 */
@Problem(
    id = 1000029,
    name = "volume-of-histogram-lcci",
    difficulty = Difficulty.HARD,
    tags = {Tag.STACK, Tag.ARRAY, Tag.TWO_POINTERS}
)
public class VolumeOfHistogramLcci {

    public int trap(int[] height) {
        return -1;
    }
}
