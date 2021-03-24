package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/132-pattern/">132模式</a>
 *
 * <p>给定一个整数序列：a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>，一个132模式的子序列&nbsp;a<sub><strong>i</strong></sub>, a<sub><strong>j</strong></sub>, a<sub><strong>k</strong></sub>&nbsp;被定义为：当 <strong>i</strong> &lt; <strong>j</strong> &lt; <strong>k</strong> 时，a<sub><strong>i</strong></sub> &lt; a<sub><strong>k</strong></sub> &lt; a<sub><strong>j</strong></sub>。设计一个算法，当给定有&nbsp;n 个数字的序列时，验证这个序列中是否含有132模式的子序列。</p>
 *
 * <p><strong>注意：</strong>n 的值小于15000。</p>
 *
 * <p><strong>示例1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [1, 2, 3, 4]
 *
 * <strong>输出:</strong> False
 *
 * <strong>解释:</strong> 序列中不存在132模式的子序列。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [3, 1, 4, 2]
 *
 * <strong>输出:</strong> True
 *
 * <strong>解释:</strong> 序列中有 1 个132模式的子序列： [1, 4, 2].
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [-1, 3, 2, 0]
 *
 * <strong>输出:</strong> True
 *
 * <strong>解释:</strong> 序列中有 3 个132模式的的子序列: [-1, 3, 2], [-1, 3, 0] 和 [-1, 2, 0].
 * </pre>
 */
@Problem(
    id = 456,
    name = "132-pattern",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class OneThreeTwoPattern {

    /**
     * 1. 创建一个数组, 记录从0~i的最小值.
     * 2. 创建一个栈, 保存比从0~i的最小值大的元素.
     * 3. 从后向前遍历数组:
     * 3.1. 如果数组当前元素比最小值还小, 跳过.
     * 3.2. 将栈中比最小值小的元素弹出, 如果栈顶元素比当前元素大, 则找到132模式的子序列, 否则压入栈中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] mins = new int[n];
        mins[0] = nums[0];
        for (int i = 1; i < n; i++) {
            mins[i] = Math.min(mins[i - 1], nums[i]);
        }
        Stack<Integer> maxs = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] <= mins[i]) {
                continue;
            }
            while (!maxs.isEmpty() && maxs.peek() <= mins[i]) {
                maxs.pop();
            }
            if (!maxs.isEmpty() && maxs.peek() < nums[i]) {
                return true;
            }
            maxs.push(nums[i]);
        }
        return false;
    }
}
