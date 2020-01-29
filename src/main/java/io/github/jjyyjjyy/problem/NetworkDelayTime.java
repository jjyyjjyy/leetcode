package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/network-delay-time/">网络延迟时间</a>
 *
 * <p>有&nbsp;<code>N</code>&nbsp;个网络节点，标记为&nbsp;<code>1</code>&nbsp;到&nbsp;<code>N</code>。</p>
 *
 * <p>给定一个列表&nbsp;<code>times</code>，表示信号经过<strong>有向</strong>边的传递时间。&nbsp;<code>times[i] = (u, v, w)</code>，其中&nbsp;<code>u</code>&nbsp;是源节点，<code>v</code>&nbsp;是目标节点， <code>w</code>&nbsp;是一个信号从源节点传递到目标节点的时间。</p>
 *
 * <p>现在，我们向当前的节点&nbsp;<code>K</code>&nbsp;发送了一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回&nbsp;<code>-1</code>。</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li><code>N</code>&nbsp;的范围在&nbsp;<code>[1, 100]</code>&nbsp;之间。</li>
 * 	<li><code>K</code>&nbsp;的范围在&nbsp;<code>[1, N]</code>&nbsp;之间。</li>
 * 	<li><code>times</code>&nbsp;的长度在&nbsp;<code>[1, 6000]</code>&nbsp;之间。</li>
 * 	<li>所有的边&nbsp;<code>times[i] = (u, v, w)</code>&nbsp;都有&nbsp;<code>1 &lt;= u, v &lt;= N</code>&nbsp;且&nbsp;<code>0 &lt;= w &lt;= 100</code>。</li>
 * </ol>
 */
@Problem(
    id = 744,
    name = "network-delay-time",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.DEPTH_FIRST_SEARCH, Tag.BREADTH_FIRST_SEARCH, Tag.GRAPH}
)
public class NetworkDelayTime {
}
