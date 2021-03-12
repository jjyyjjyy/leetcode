package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/">验证二叉树的前序序列化</a>
 *
 * <p>序列化二叉树的一种方法是使用前序遍历。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，我们可以使用一个标记值记录，例如 <code>#</code>。</p>
 *
 * <pre>     _9_
 *     /   \
 *    3     2
 *   / \   / \
 *  4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 * </pre>
 *
 * <p>例如，上面的二叉树可以被序列化为字符串 <code>&quot;9,3,4,#,#,1,#,#,2,#,6,#,#&quot;</code>，其中 <code>#</code> 代表一个空节点。</p>
 *
 * <p>给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。</p>
 *
 * <p>每个以逗号分隔的字符或为一个整数或为一个表示 <code>null</code> 指针的 <code>&#39;#&#39;</code> 。</p>
 *
 * <p>你可以认为输入格式总是有效的，例如它永远不会包含两个连续的逗号，比如&nbsp;<code>&quot;1,,3&quot;</code> 。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong><code>&quot;9,3,4,#,#,1,#,#,2,#,6,#,#&quot;</code>
 * <strong>输出: </strong><code>true</code></pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入: </strong><code>&quot;1,#&quot;</code>
 * <strong>输出: </strong><code>false</code>
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong><code>&quot;9,#,#,1&quot;</code>
 * <strong>输出: </strong><code>false</code></pre>
 */
@Problem(
    id = 331,
    name = "verify-preorder-serialization-of-a-binary-tree",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK}
)
public class VerifyPreorderSerializationOfABinaryTree {

    /**
     * 1. 将字符串按照逗号分割, 维护树的出入度, 如果不是一颗空树, 则初始根节点的出度为2.
     * 2. 遍历分割后的字符串数组:
     * 2.1. 入度加1
     * 2.2. 判断是否不为空节点, 如果不是则出度加2.
     * 2.3. 遍历到最后一个字符串之前的时候如果入度大于等于出度则说明不合法.
     * 3. 遍历结束, 判断入度是否和出度相等.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isValidSerialization(String preorder) {
        if ("#".equals(preorder)) {
            return true;
        }
        if (preorder.charAt(0) == '#') {
            return false;
        }
        int in = 0;
        int out = 2;

        String[] segments = preorder.split(",");
        for (int i = 1; i < segments.length; i++) {
            String c = segments[i];
            in += 1;
            if (!"#".equals(c)) {
                out += 2;
            }
            if (i < segments.length - 1 && in >= out) {
                return false;
            }
        }
        return in == out;
    }
}
