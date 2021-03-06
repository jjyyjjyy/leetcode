package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/">扁平化多级双向链表</a>
 *
 * <p>您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。</p>
 *
 * <p>扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 *  1---2---3---4---5---6--NULL
 *          |
 *          7---8---9---10--NULL
 *              |
 *              11--12--NULL
 *
 * <strong>输出:</strong>
 * 1-2-3-7-8-11-12-9-10-4-5-6-NULL
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>以上示例的说明:</strong></p>
 *
 * <p>给出以下多级双向链表:</p>
 *
 * <pre><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/multilevellinkedlist.png" style="width: 640px;"></pre>
 *
 * <p>&nbsp;</p>
 *
 * <p>我们应该返回如下所示的扁平双向链表:</p>
 *
 * <pre><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/multilevellinkedlistflattened.png" style="width: 1100px;"></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>flatten-binary-tree-to-linked-list</li>
 * </ul>
 */
@Problem(
    id = 766,
    name = "flatten-a-multilevel-doubly-linked-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.LINKED_LIST}
)
public class FlattenaMultilevelDoublyLinkedList {
}
