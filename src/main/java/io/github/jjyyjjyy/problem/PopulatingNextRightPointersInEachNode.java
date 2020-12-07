package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Node;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">填充每个节点的下一个右侧节点指针</a>
 *
 * <p>给定一个<strong>完美二叉树</strong>，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：</p>
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
 * <p><strong>示例：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/15/116_sample.png" style="height: 218px; width: 640px;"></p>
 *
 * <pre><strong>输入：</strong>{&quot;id&quot;:&quot;1&quot;,&quot;left&quot;:{&quot;id&quot;:&quot;2&quot;,&quot;left&quot;:{&quot;id&quot;:&quot;3&quot;,&quot;left&quot;:null,&quot;next&quot;:null,&quot;right&quot;:null,&quot;val&quot;:4},&quot;next&quot;:null,&quot;right&quot;:{&quot;id&quot;:&quot;4&quot;,&quot;left&quot;:null,&quot;next&quot;:null,&quot;right&quot;:null,&quot;val&quot;:5},&quot;val&quot;:2},&quot;next&quot;:null,&quot;right&quot;:{&quot;id&quot;:&quot;5&quot;,&quot;left&quot;:{&quot;id&quot;:&quot;6&quot;,&quot;left&quot;:null,&quot;next&quot;:null,&quot;right&quot;:null,&quot;val&quot;:6},&quot;next&quot;:null,&quot;right&quot;:{&quot;id&quot;:&quot;7&quot;,&quot;left&quot;:null,&quot;next&quot;:null,&quot;right&quot;:null,&quot;val&quot;:7},&quot;val&quot;:3},&quot;val&quot;:1}
 *
 * <strong>输出：</strong>{&quot;id&quot;:&quot;1&quot;,&quot;left&quot;:{&quot;id&quot;:&quot;2&quot;,&quot;left&quot;:{&quot;id&quot;:&quot;3&quot;,&quot;left&quot;:null,&quot;next&quot;:{&quot;id&quot;:&quot;4&quot;,&quot;left&quot;:null,&quot;next&quot;:{&quot;id&quot;:&quot;5&quot;,&quot;left&quot;:null,&quot;next&quot;:{&quot;id&quot;:&quot;6&quot;,&quot;left&quot;:null,&quot;next&quot;:null,&quot;right&quot;:null,&quot;val&quot;:7},&quot;right&quot;:null,&quot;val&quot;:6},&quot;right&quot;:null,&quot;val&quot;:5},&quot;right&quot;:null,&quot;val&quot;:4},&quot;next&quot;:{&quot;id&quot;:&quot;7&quot;,&quot;left&quot;:{&quot;ref&quot;:&quot;5&quot;},&quot;next&quot;:null,&quot;right&quot;:{&quot;ref&quot;:&quot;6&quot;},&quot;val&quot;:3},&quot;right&quot;:{&quot;ref&quot;:&quot;4&quot;},&quot;val&quot;:2},&quot;next&quot;:null,&quot;right&quot;:{&quot;ref&quot;:&quot;7&quot;},&quot;val&quot;:1}
 *
 * <strong>解释：</strong>给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li>你只能使用常量级额外空间。</li>
 * 	<li>使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>populating-next-right-pointers-in-each-node-ii</li>
 *   <li>binary-tree-right-side-view</li>
 * </ul>
 */
@Problem(
    id = 116,
    name = "populating-next-right-pointers-in-each-node",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE, Tag.DEPTH_FIRST_SEARCH}
)
public class PopulatingNextRightPointersInEachNode {

    /**
     * 左子树的next节点为右子树, 右子树的next节点为root的next节点的左子树.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left.next = root.right;
            root.right.next = root.next == null ? null : root.next.left;
            connect(root.left);
            connect(root.right);
        }
        return root;
    }
}
