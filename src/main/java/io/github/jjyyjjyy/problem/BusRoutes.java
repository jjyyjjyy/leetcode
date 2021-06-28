package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/bus-routes/">公交路线</a>
 *
 * <p>我们有一系列公交路线。每一条路线 <code>routes[i]</code>&nbsp;上都有一辆公交车在上面循环行驶。例如，有一条路线&nbsp;<code>routes[0] = [1, 5, 7]</code>，表示第一辆 (下标为0) 公交车会一直按照&nbsp;1-&gt;5-&gt;7-&gt;1-&gt;5-&gt;7-&gt;1-&gt;...&nbsp;的车站路线行驶。</p>
 *
 * <p>假设我们从&nbsp;<code>S</code>&nbsp;车站开始（初始时不在公交车上），要去往&nbsp;<code>T</code>&nbsp;站。 期间仅可乘坐公交车，求出最少乘坐的公交车数量。返回 -1 表示不可能到达终点车站。</p>
 *
 * <pre>
 * <strong>示例:</strong>
 * <strong>输入:</strong>
 * routes = [[1, 2, 7], [3, 6, 7]]
 * S = 1
 * T = 6
 * <strong>输出:</strong> 2
 * <strong>解释:</strong>
 * 最优策略是先乘坐第一辆公交车到达车站 7, 然后换乘第二辆公交车到车站 6。
 * </pre>
 *
 * <p><strong>说明: </strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= routes.length &lt;= 500</code>.</li>
 * 	<li><code>1 &lt;= routes[i].length &lt;= 500</code>.</li>
 * 	<li><code>0 &lt;= routes[i][j] &lt; 10 ^ 6</code>.</li>
 * </ul>
 */
@Problem(
    id = 833,
    name = "bus-routes",
    difficulty = Difficulty.HARD,
    tags = {Tag.BREADTH_FIRST_SEARCH}
)
public class BusRoutes {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(mn+n^2)")
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int n = routes.length;
        boolean[][] edge = new boolean[n][n];
        Map<Integer, List<Integer>> rec = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int site : routes[i]) {
                List<Integer> list = rec.getOrDefault(site, new ArrayList<>());
                for (int j : list) {
                    edge[i][j] = edge[j][i] = true;
                }
                list.add(i);
                rec.put(site, list);
            }
        }

        int[] dis = new int[n];
        Arrays.fill(dis, -1);
        Queue<Integer> que = new LinkedList<>();
        for (int bus : rec.getOrDefault(source, new ArrayList<>())) {
            dis[bus] = 1;
            que.offer(bus);
        }
        while (!que.isEmpty()) {
            int x = que.poll();
            for (int y = 0; y < n; y++) {
                if (edge[x][y] && dis[y] == -1) {
                    dis[y] = dis[x] + 1;
                    que.offer(y);
                }
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int bus : rec.getOrDefault(target, new ArrayList<>())) {
            if (dis[bus] != -1) {
                ret = Math.min(ret, dis[bus]);
            }
        }
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }
}
