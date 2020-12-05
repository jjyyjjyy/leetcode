package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/">填充每个节点的下一个右侧节点指针 II</a>
 *
 * <p>给定一个二叉树</p>
 *
 * <pre>struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }</pre>
 *
 * <p>填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 <code>NULL</code>。</p>
 *
 * <p>初始状态下，所有&nbsp;next 指针都被设置为 <code>NULL</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <ul>
 * 	<li>你只能使用常量级额外空间。</li>
 * 	<li>使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/15/117_sample.png" style="height: 218px; width: 640px;"></p>
 *
 * <pre><strong>输入</strong>：root = [1,2,3,4,5,null,7]
 * <strong>输出：</strong>[1,#,2,3,#,4,5,7,#]
 * <strong>解释：</strong>给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>树中的节点数小于 <code>6000</code></li>
 * 	<li><code>-100&nbsp;&lt;= node.val &lt;= 100</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <ul>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>populating-next-right-pointers-in-each-node</li>
 * </ul>
 */
@Problem(
    id = 117,
    name = "populating-next-right-pointers-in-each-node-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class PopulatingNextRightPointersInEachNodeII {

    /**
     * 每一层维护一个单链表维护左右子树的顺序
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current != null) {
            // 每一层初始化一个哑元节点, dummy.next即为下一层的最左的节点.
            Node dummy = new Node(0);
            Node pre = dummy;
            while (current != null) {
                if (current.left != null) {
                    pre.next = current.left;
                    pre = pre.next;
                }
                if (current.right != null) {
                    pre.next = current.right;
                    pre = pre.next;
                }
                current = current.next;
            }
            current = dummy.next;
        }
        return root;
    }
}
