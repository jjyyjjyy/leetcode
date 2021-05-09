package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/find-minimum-time-to-finish-all-jobs/">完成所有工作的最短时间</a>
 *
 * <p>给你一个整数数组 <code>jobs</code> ，其中 <code>jobs[i]</code> 是完成第 <code>i</code> 项工作要花费的时间。</p>
 *
 * <p>请你将这些工作分配给 <code>k</code> 位工人。所有工作都应该分配给工人，且每项工作只能分配给一位工人。工人的 <strong>工作时间</strong> 是完成分配给他们的所有工作花费时间的总和。请你设计一套最佳的工作分配方案，使工人的 <strong>最大工作时间</strong> 得以 <strong>最小化</strong> 。</p>
 *
 * <p>返回分配方案中尽可能 <strong>最小</strong> 的 <strong>最大工作时间</strong> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>jobs = [3,2,3], k = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>给每位工人分配一项工作，最大工作时间是 3 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>jobs = [1,2,4,7,8], k = 2
 * <strong>输出：</strong>11
 * <strong>解释：</strong>按下述方式分配工作：
 * 1 号工人：1、2、8（工作时间 = 1 + 2 + 8 = 11）
 * 2 号工人：4、7（工作时间 = 4 + 7 = 11）
 * 最大工作时间是 11 。</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 <= k <= jobs.length <= 12</code></li>
 * 	<li><code>1 <= jobs[i] <= 10<sup>7</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1825,
    name = "find-minimum-time-to-finish-all-jobs",
    difficulty = Difficulty.HARD,
    tags = {Tag.RECURSION, Tag.BACKTRACKING}
)
public class FindMinimumTimeToFinishAllJobs {

    private int result = Integer.MAX_VALUE;

    @Complexity(Complexity.ComplexityType.O_M_N)
    public int minimumTimeRequired(int[] jobs, int k) {
        backtrack(jobs, 0, new int[k], 0);
        return result;
    }

    private void backtrack(int[] jobs, int index, int[] workers, int max) {
        if (index == jobs.length) {
            result = Math.min(result, max);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < workers.length; i++) {
            if (!set.add(workers[i])) {
                continue;
            }
            if (workers[i] + jobs[index] >= result) {
                continue;
            }
            workers[i] += jobs[index];
            backtrack(jobs, index + 1, workers, Math.max(max, workers[i]));
            workers[i] -= jobs[index];
        }
    }
}
