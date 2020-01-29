package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/flip-equivalent-binary-trees/">翻转等价二叉树</a>
 *
 * <p>我们可以为二叉树 T 定义一个翻转操作，如下所示：选择任意节点，然后交换它的左子树和右子树。</p>
 *
 * <p>只要经过一定次数的翻转操作后，能使 X 等于 Y，我们就称二叉树 X <em>翻转等价</em>于二叉树 Y。</p>
 *
 * <p>编写一个判断两个二叉树是否是<em>翻转等价</em>的函数。这些树由根节点&nbsp;<code>root1</code> 和 <code>root2</code>&nbsp;给出。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
 * <strong>输出：</strong>true
 * <strong>解释：</strong>We flipped at nodes with values 1, 3, and 5.
 * <img alt="Flipped Trees Diagram" src="https://assets.leetcode.com/uploads/2018/11/29/tree_ex.png" style="">
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li>每棵树最多有&nbsp;<code>100</code>&nbsp;个节点。</li>
 * 	<li>每棵树中的每个值都是唯一的、在 <code>[0, 99]</code>&nbsp;范围内的整数。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 988,
    name = "flip-equivalent-binary-trees",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TREE}
)
public class FlipEquivalentBinaryTrees {
}
