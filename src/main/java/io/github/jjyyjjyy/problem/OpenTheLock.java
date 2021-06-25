package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/open-the-lock/">打开转盘锁</a>
 *
 * <p>你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： <code>'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'</code> 。每个拨轮可以自由旋转：例如把 <code>'9'</code> 变为 <code>'0'</code>，<code>'0'</code> 变为 <code>'9'</code> 。每次旋转都只能旋转一个拨轮的一位数字。</p>
 *
 * <p>锁的初始数字为 <code>'0000'</code> ，一个代表四个拨轮的数字的字符串。</p>
 *
 * <p>列表 <code>deadends</code> 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。</p>
 *
 * <p>字符串 <code>target</code> 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 <code>-1</code> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * <strong>输出：</strong>6
 * <strong>解释：</strong>
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> deadends = ["8888"], target = "0009"
 * <strong>输出：</strong>1
 * <strong>解释：</strong>
 * 把最后一位反向旋转一次即可 "0000" -> "0009"。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * <strong>输出：</strong>-1
 * <strong>解释：
 * </strong>无法旋转到目标数字且不被锁定。
 * </pre>
 *
 * <p><strong>示例 4:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> deadends = ["0000"], target = "8888"
 * <strong>输出：</strong>-1
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 <= deadends.length <= 500</code></li>
 * 	<li><code><font face="monospace">deadends[i].length == 4</font></code></li>
 * 	<li><code><font face="monospace">target.length == 4</font></code></li>
 * 	<li><code>target</code> <strong>不在</strong> <code>deadends</code> 之中</li>
 * 	<li><code>target</code> 和 <code>deadends[i]</code> 仅由若干位数字组成</li>
 * </ul>
 */
@Problem(
    id = 753,
    name = "open-the-lock",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BREADTH_FIRST_SEARCH, Tag.ARRAY, Tag.HASH_TABLE, Tag.STRING}
)
public class OpenTheLock {

    /**
     * A*启发式搜索
     */
    public int openLock(String[] deadends, String target) {
        if ("0000".equals(target)) {
            return 0;
        }
        Set<String> dead = new HashSet<>();
        for (String deadend : deadends) {
            dead.add(deadend);
        }
        if (dead.contains("0000")) {
            return -1;
        }
        PriorityQueue<AStar> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.f));
        pq.offer(new AStar("0000", target, 0));
        Set<String> seen = new HashSet<>();
        seen.add("0000");

        while (!pq.isEmpty()) {
            AStar node = pq.poll();
            for (String nextStatus : get(node.status)) {
                if (!seen.contains(nextStatus) && !dead.contains(nextStatus)) {
                    if (nextStatus.equals(target)) {
                        return node.g + 1;
                    }
                    pq.offer(new AStar(nextStatus, target, node.g + 1));
                    seen.add(nextStatus);
                }
            }
        }

        return -1;
    }

    public char numPrev(char x) {
        return x == '0' ? '9' : (char) (x - 1);
    }

    public char numSucc(char x) {
        return x == '9' ? '0' : (char) (x + 1);
    }

    // 枚举 status 通过一次旋转得到的数字
    public List<String> get(String status) {
        List<String> ret = new ArrayList<>();
        char[] array = status.toCharArray();
        for (int i = 0; i < 4; ++i) {
            char num = array[i];
            array[i] = numPrev(num);
            ret.add(new String(array));
            array[i] = numSucc(num);
            ret.add(new String(array));
            array[i] = num;
        }
        return ret;
    }
}

class AStar {
    String status;
    int f, g, h;

    public AStar(String status, String target, int g) {
        this.status = status;
        this.g = g;
        this.h = getH(status, target);
        this.f = this.g + this.h;
    }

    // 计算启发函数
    public static int getH(String status, String target) {
        int ret = 0;
        for (int i = 0; i < 4; ++i) {
            int dist = Math.abs(status.charAt(i) - target.charAt(i));
            ret += Math.min(dist, 10 - dist);
        }
        return ret;
    }
}
