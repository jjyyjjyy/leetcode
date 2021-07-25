package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/restore-the-array-from-adjacent-pairs/">从相邻元素对还原数组</a>
 *
 * <p>存在一个由 <code>n</code> 个不同元素组成的整数数组 <code>nums</code> ，但你已经记不清具体内容。好在你还记得 <code>nums</code> 中的每一对相邻元素。</p>
 *
 * <p>给你一个二维整数数组 <code>adjacentPairs</code> ，大小为 <code>n - 1</code> ，其中每个 <code>adjacentPairs[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> 表示元素 <code>u<sub>i</sub></code> 和 <code>v<sub>i</sub></code> 在 <code>nums</code> 中相邻。</p>
 *
 * <p>题目数据保证所有由元素 <code>nums[i]</code> 和 <code>nums[i+1]</code> 组成的相邻元素对都存在于 <code>adjacentPairs</code> 中，存在形式可能是 <code>[nums[i], nums[i+1]]</code> ，也可能是 <code>[nums[i+1], nums[i]]</code> 。这些相邻元素对可以 <strong>按任意顺序</strong> 出现。</p>
 *
 * <p>返回 <strong>原始数组</strong><em> </em><code>nums</code><em> </em>。如果存在多种解答，返回 <strong>其中任意一个</strong> 即可。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>adjacentPairs = [[2,1],[3,4],[3,2]]
 * <strong>输出：</strong>[1,2,3,4]
 * <strong>解释：</strong>数组的所有相邻元素对都在 adjacentPairs 中。
 * 特别要注意的是，adjacentPairs[i] 只表示两个元素相邻，并不保证其 左-右 顺序。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>adjacentPairs = [[4,-2],[1,4],[-3,1]]
 * <strong>输出：</strong>[-2,4,1,-3]
 * <strong>解释：</strong>数组中可能存在负数。
 * 另一种解答是 [-3,1,4,-2] ，也会被视作正确答案。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>adjacentPairs = [[100000,-100000]]
 * <strong>输出：</strong>[100000,-100000]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>nums.length == n</code></li>
 * 	<li><code>adjacentPairs.length == n - 1</code></li>
 * 	<li><code>adjacentPairs[i].length == 2</code></li>
 * 	<li><code>2 <= n <= 10<sup>5</sup></code></li>
 * 	<li><code>-10<sup>5</sup> <= nums[i], u<sub>i</sub>, v<sub>i</sub> <= 10<sup>5</sup></code></li>
 * 	<li>题目数据保证存在一些以 <code>adjacentPairs</code> 作为元素对的数组 <code>nums</code></li>
 * </ul>
 */
@Problem(
    id = 1866,
    name = "restore-the-array-from-adjacent-pairs",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class RestoreTheArrayFromAdjacentPairs {

    /**
     * 1. 维护一个哈希表, 记录每个点的相邻顶点, 如果相邻顶点数量为1, 那么该点是起点或终点.
     * 2. 遍历数组, 找到上一个节点的左右两个节点, 如果前2个节点等于第1个数, 那当前节点等于第二个数.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> pairs = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            pairs.putIfAbsent(pair[0], new ArrayList<>());
            pairs.get(pair[0]).add(pair[1]);
            pairs.putIfAbsent(pair[1], new ArrayList<>());
            pairs.get(pair[1]).add(pair[0]);
        }
        int n = adjacentPairs.length + 1;
        int[] result = new int[n];

        for (Map.Entry<Integer, List<Integer>> entry : pairs.entrySet()) {
            if (entry.getValue().size() == 1) {
                result[0] = entry.getKey();
                break;
            }
        }
        result[1] = pairs.get(result[0]).get(0);

        for (int i = 2; i < n; i++) {
            List<Integer> adj = pairs.get(result[i - 1]);
            result[i] = result[i - 2] == adj.get(0) ? adj.get(1) : adj.get(0);
        }

        return result;
    }

}
