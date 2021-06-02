package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/">你能在你最喜欢的那天吃到你最喜欢的糖果吗？</a>
 *
 * <p>给你一个下标从 <strong>0</strong> 开始的正整数数组 <code>candiesCount</code> ，其中 <code>candiesCount[i]</code> 表示你拥有的第 <code>i</code> 类糖果的数目。同时给你一个二维数组 <code>queries</code> ，其中 <code>queries[i] = [favoriteType<sub>i</sub>, favoriteDay<sub>i</sub>, dailyCap<sub>i</sub>]</code> 。</p>
 *
 * <p>你按照如下规则进行一场游戏：</p>
 *
 * <ul>
 * 	<li>你从第 <code><strong>0</strong></code><strong> </strong>天开始吃糖果。</li>
 * 	<li>你在吃完 <strong>所有</strong> 第 <code>i - 1</code> 类糖果之前，<strong>不能</strong> 吃任何一颗第 <code>i</code> 类糖果。</li>
 * 	<li>在吃完所有糖果之前，你必须每天 <strong>至少</strong> 吃 <strong>一颗</strong> 糖果。</li>
 * </ul>
 *
 * <p>请你构建一个布尔型数组 <code>answer</code> ，满足 <code>answer.length == queries.length</code> 。<code>answer[i]</code> 为 <code>true</code> 的条件是：在每天吃 <strong>不超过</strong> <code>dailyCap<sub>i</sub></code><sub> </sub>颗糖果的前提下，你可以在第 <code>favoriteDay<sub>i</sub></code> 天吃到第 <code>favoriteType<sub>i</sub></code> 类糖果；否则 <code>answer[i]</code> 为 <code>false</code> 。注意，只要满足上面 3 条规则中的第二条规则，你就可以在同一天吃不同类型的糖果。</p>
 *
 * <p>请你返回得到的数组<em> </em><code>answer</code> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <b>输入：</b>candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
 * <b>输出：</b>[true,false,true]
 * <strong>提示：</strong>
 * 1- 在第 0 天吃 2 颗糖果(类型 0），第 1 天吃 2 颗糖果（类型 0），第 2 天你可以吃到类型 0 的糖果。
 * 2- 每天你最多吃 4 颗糖果。即使第 0 天吃 4 颗糖果（类型 0），第 1 天吃 4 颗糖果（类型 0 和类型 1），你也没办法在第 2 天吃到类型 4 的糖果。换言之，你没法在每天吃 4 颗糖果的限制下在第 2 天吃到第 4 类糖果。
 * 3- 如果你每天吃 1 颗糖果，你可以在第 13 天吃到类型 2 的糖果。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <b>输入：</b>candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
 * <b>输出：</b>[false,true,true,false,false]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 <= candiesCount.length <= 10<sup>5</sup></code></li>
 * 	<li><code>1 <= candiesCount[i] <= 10<sup>5</sup></code></li>
 * 	<li><code>1 <= queries.length <= 10<sup>5</sup></code></li>
 * 	<li><code>queries[i].length == 3</code></li>
 * 	<li><code>0 <= favoriteType<sub>i</sub> < candiesCount.length</code></li>
 * 	<li><code>0 <= favoriteDay<sub>i</sub> <= 10<sup>9</sup></code></li>
 * 	<li><code>1 <= dailyCap<sub>i</sub> <= 10<sup>9</sup></code></li>
 * </ul>
 */
@Problem(
    id = 1872,
    name = "can-you-eat-your-favorite-candy-on-your-favorite-day",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH}
)
public class CanYouEatYourFavoriteCandyOnYourFavoriteDay {

    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;

        long[] sum = new long[n];
        sum[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + candiesCount[i];
        }
        int q = queries.length;
        boolean[] result = new boolean[q];

        for (int i = 0; i < q; i++) {
            int[] query = queries[i];
            int type = query[0];
            int day = query[1];
            int cap = query[2];

            int x1 = day + 1;
            long y1 = (long) (day + 1) * cap;
            long x2 = type == 0 ? 1 : sum[type - 1] + 1;
            long y2 = sum[type];

            result[i] = !(x1 > y2 || y1 < x2);
        }

        return result;
    }
}