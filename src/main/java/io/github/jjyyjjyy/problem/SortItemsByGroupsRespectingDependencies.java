package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/sort-items-by-groups-respecting-dependencies/">项目管理</a>
 *
 * <p>公司共有&nbsp;<code>n</code>&nbsp;个项目和 &nbsp;<code>m</code>&nbsp;个小组，每个项目要不没有归属，要不就由其中的一个小组负责。</p>
 *
 * <p>我们用&nbsp;<code>group[i]</code>&nbsp;代表第&nbsp;<code>i</code>&nbsp;个项目所属的小组，如果这个项目目前无人接手，那么&nbsp;<code>group[i]</code> 就等于&nbsp;<code>-1</code>。（项目和小组都是从零开始编号的）</p>
 *
 * <p>请你帮忙按要求安排这些项目的进度，并返回排序后的项目列表：</p>
 *
 * <ul>
 * 	<li>同一小组的项目，排序后在列表中彼此相邻。</li>
 * 	<li>项目之间存在一定的依赖关系，我们用一个列表 <code>beforeItems</code>&nbsp;来表示，其中&nbsp;<code>beforeItems[i]</code>&nbsp;表示在进行第&nbsp;<code>i</code>&nbsp;个项目前（位于第 <code>i</code>&nbsp;个项目左侧）应该完成的所有项目。</li>
 * </ul>
 *
 * <p><strong>结果要求：</strong></p>
 *
 * <p>如果存在多个解决方案，只需要返回其中任意一个即可。</p>
 *
 * <p>如果没有合适的解决方案，就请返回一个 <strong>空列表</strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/09/22/1359_ex1.png" style="height: 181px; width: 191px;"></strong></p>
 *
 * <pre><strong>输入：</strong>n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
 * <strong>输出：</strong>[6,3,4,1,5,2,0,7]
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
 * <strong>输出：</strong>[]
 * <strong>解释：</strong>与示例 1 大致相同，但是在排序后的列表中，4 必须放在 6 的前面。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= m &lt;= n &lt;= 3*10^4</code></li>
 * 	<li><code>group.length == beforeItems.length == n</code></li>
 * 	<li><code>-1 &lt;= group[i] &lt;= m-1</code></li>
 * 	<li><code>0 &lt;= beforeItems[i].length &lt;= n-1</code></li>
 * 	<li><code>0 &lt;= beforeItems[i][j] &lt;= n-1</code></li>
 * 	<li><code>i != beforeItems[i][j]</code></li>
 * </ul>
 */
@Problem(
    id = 1309,
    name = "sort-items-by-groups-respecting-dependencies",
    difficulty = Difficulty.HARD,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.GRAPH, Tag.TOPOLOGICAL_SORT}
)
public class SortItemsByGroupsRespectingDependencies {

    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        // 第 1 步：数据预处理，给没有归属于一个组的项目编上组号
        for (int i = 0; i < group.length; i++) {
            if (group[i] == -1) {
                group[i] = m;
                m++;
            }
        }
        // 第 2 步：实例化组和项目的邻接表
        List<Integer>[] groupAdj = new List[m];
        List<Integer>[] itemAdj = new List[n];
        for (int i = 0; i < m; i++) {
            groupAdj[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            itemAdj[i] = new ArrayList<>();
        }

        // 第 3 步：建图和统计入度数组
        int[] groupsIndegree = new int[m];
        int[] itemsIndegree = new int[n];

        int len = group.length;
        for (int i = 0; i < len; i++) {
            int currentGroup = group[i];
            for (int beforeItem : beforeItems.get(i)) {
                int beforeGroup = group[beforeItem];
                if (beforeGroup != currentGroup) {
                    groupAdj[beforeGroup].add(currentGroup);
                    groupsIndegree[currentGroup]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (Integer item : beforeItems.get(i)) {
                itemAdj[item].add(i);
                itemsIndegree[i]++;
            }
        }

        // 第 4 步：得到组和项目的拓扑排序结果
        List<Integer> groupsList = topologicalSort(groupAdj, groupsIndegree, m);
        if (groupsList.size() == 0) {
            return new int[0];
        }
        List<Integer> itemsList = topologicalSort(itemAdj, itemsIndegree, n);
        if (itemsList.size() == 0) {
            return new int[0];
        }

        // 第 5 步：根据项目的拓扑排序结果，项目到组的多对一关系，建立组到项目的一对多关系
        // key：组，value：在同一组的项目列表
        Map<Integer, List<Integer>> groups2Items = new HashMap<>();
        for (Integer item : itemsList) {
            groups2Items.computeIfAbsent(group[item], key -> new ArrayList<>()).add(item);
        }

        // 第 6 步：把组的拓扑排序结果替换成为项目的拓扑排序结果
        List<Integer> res = new ArrayList<>();
        for (Integer groupId : groupsList) {
            List<Integer> items = groups2Items.getOrDefault(groupId, new ArrayList<>());
            res.addAll(items);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    private List<Integer> topologicalSort(List<Integer>[] adj, int[] inDegree, int n) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer front = queue.poll();
            res.add(front);
            for (int successor : adj[front]) {
                inDegree[successor]--;
                if (inDegree[successor] == 0) {
                    queue.offer(successor);
                }
            }
        }

        if (res.size() == n) {
            return res;
        }
        return new ArrayList<>();
    }
}
