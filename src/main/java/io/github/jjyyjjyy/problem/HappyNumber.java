package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/happy-number/">快乐数</a>
 *
 * <p>编写一个算法来判断一个数是不是&ldquo;快乐数&rdquo;。</p>
 *
 * <p>一个&ldquo;快乐数&rdquo;定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。</p>
 *
 * <p><strong>示例:&nbsp;</strong></p>
 *
 * <pre><strong>输入:</strong> 19
 * <strong>输出:</strong> true
 * <strong>解释:
 * </strong>1<sup>2</sup> + 9<sup>2</sup> = 82
 * 8<sup>2</sup> + 2<sup>2</sup> = 68
 * 6<sup>2</sup> + 8<sup>2</sup> = 100
 * 1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>linked-list-cycle</li>
 *   <li>add-digits</li>
 *   <li>ugly-number</li>
 * </ul>
 */
@Problem(
    id = 202,
    name = "happy-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class HappyNumber {

    /**
     * 维护快慢两个指针判断是否形成环.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSum(n);
        while (fast != 1 && fast != slow) {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }
        return fast == 1;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }
        return sum;
    }

    /**
     * 使用哈希表保存已经计算出来的值, 如果值已存在则退出.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
}
