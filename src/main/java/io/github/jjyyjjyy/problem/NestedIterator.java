package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.NestedInteger;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/flatten-nested-list-iterator/">扁平化嵌套列表迭代器</a>
 *
 * <p>给定一个嵌套的整型列表。设计一个迭代器，使其能够遍历这个整型列表中的所有整数。</p>
 *
 * <p>列表中的项或者为一个整数，或者是另一个列表。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>[[1,1],2,[1,1]]
 * <strong>输出: </strong>[1,1,2,1,1]
 * <strong>解释: </strong>通过重复调用&nbsp;<em>next </em>直到&nbsp;<em>hasNex</em>t 返回false，<em>next&nbsp;</em>返回的元素的顺序应该是: <code>[1,1,2,1,1]</code>。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>[1,[4,[6]]]
 * <strong>输出: </strong>[1,4,6]
 * <strong>解释: </strong>通过重复调用&nbsp;<em>next&nbsp;</em>直到&nbsp;<em>hasNex</em>t 返回false，<em>next&nbsp;</em>返回的元素的顺序应该是: <code>[1,4,6]</code>。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>flatten-2d-vector</li>
 *   <li>zigzag-iterator</li>
 *   <li>mini-parser</li>
 *   <li>array-nesting</li>
 * </ul>
 */
@Problem(
    id = 341,
    name = "flatten-nested-list-iterator",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.DESIGN}
)
public class NestedIterator implements Iterator<Integer> {

    private final Iterator<Integer> iterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList<>();
        for (NestedInteger i : nestedList) {
            addInteger(list, i);
        }
        iterator = list.iterator();
    }

    private void addInteger(List<Integer> list, NestedInteger i) {
        if (i.isInteger()) {
            list.add(i.getInteger());
        } else {
            for (NestedInteger nestedInteger : i.getList()) {
                addInteger(list, nestedInteger);
            }
        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
