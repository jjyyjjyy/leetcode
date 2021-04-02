package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
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

    /**
     * 1. 维护左右两个指针, 和左右两侧的最大值.
     * 2. 如果左指针所在元素比右指针所在元素小, 则当前可以倒leftMax-height[left]的水, 左指针右移一位. 否则当前可以倒rightMax-height[right]的水, 右指针左移一位.
     * 3. 如果左右指针相遇, 退出循环.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }
}
