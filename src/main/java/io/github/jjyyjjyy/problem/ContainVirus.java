package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/contain-virus/">隔离病毒</a>
 *
 * <p>病毒扩散得很快，现在你的任务是尽可能地通过安装防火墙来隔离病毒。</p>
 *
 * <p>假设世界由二维矩阵组成，<code>0</code> 表示该区域未感染病毒，而 <code>1</code> 表示该区域已感染病毒。可以在任意 2 个四方向相邻单元之间的共享边界上安装一个防火墙（并且只有一个防火墙）。</p>
 *
 * <p>每天晚上，病毒会从被感染区域向相邻未感染区域扩散，除非被防火墙隔离。现由于资源有限，每天你只能安装一系列防火墙来隔离其中一个被病毒感染的区域（一个区域或连续的一片区域），且该感染区域对未感染区域的威胁最大且保证唯一。</p>
 *
 * <p>你需要努力使得最后有部分区域不被病毒感染，如果可以成功，那么返回需要使用的防火墙个数; 如果无法实现，则返回在世界被病毒全部感染时已安装的防火墙个数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入:</strong> grid =
 * [[0,1,0,0,0,0,0,1],
 *  [0,1,0,0,0,0,0,1],
 *  [0,0,0,0,0,0,0,1],
 *  [0,0,0,0,0,0,0,0]]
 * <strong>输出:</strong> 10
 * <strong>说明:</strong>
 * 一共有两块被病毒感染的区域: 从左往右第一块需要 5 个防火墙，同时若该区域不隔离，晚上将感染 5 个未感染区域（即被威胁的未感染区域个数为 5）;
 * 第二块需要 4 个防火墙，同理被威胁的未感染区域个数是 4。因此，第一天先隔离左边的感染区域，经过一晚后，病毒传播后世界如下:
 * [[0,1,0,0,0,0,1,1],
 *  [0,1,0,0,0,0,1,1],
 *  [0,0,0,0,0,0,1,1],
 *  [0,0,0,0,0,0,0,1]]
 * 第二题，只剩下一块未隔离的被感染的连续区域，此时需要安装 5 个防火墙，且安装完毕后病毒隔离任务完成。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入:</strong> grid =
 * [[1,1,1],
 *  [1,0,1],
 *  [1,1,1]]
 * <strong>输出:</strong> 4
 * <strong>说明:</strong>
 * 此时只需要安装 4 面防火墙，就有一小区域可以幸存，不被病毒感染。
 * 注意不需要在世界边界建立防火墙。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre><strong>输入:</strong> grid =
 * [[1,1,1,0,0,0,0,0,0],
 *  [1,0,1,0,1,1,1,1,1],
 *  [1,1,1,0,0,0,0,0,0]]
 * <strong>输出:</strong> 13
 * <strong>说明:</strong>
 * 在隔离右边感染区域后，隔离左边病毒区域只需要 2 个防火墙了。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li><code>grid</code> 的行数和列数范围是 [1, 50]。</li>
 * 	<li>&nbsp;<code>grid[i][j]</code>&nbsp;只包含&nbsp;<code>0</code>&nbsp;或&nbsp;<code>1</code>&nbsp;。</li>
 * 	<li>题目保证每次选取感染区域进行隔离时，一定存在唯一一个对未感染区域的威胁最大的区域。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 750,
    name = "contain-virus",
    difficulty = Difficulty.HARD,
    tags = {Tag.DEPTH_FIRST_SEARCH}
)
public class ContainVirus {
}
