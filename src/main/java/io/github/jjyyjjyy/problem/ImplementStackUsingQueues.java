package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">用队列实现栈</a>
 *
 * <p>使用队列实现栈的下列操作：</p>
 *
 * <ul>
 * 	<li>push(x) -- 元素 x 入栈</li>
 * 	<li>pop() -- 移除栈顶元素</li>
 * 	<li>top() -- 获取栈顶元素</li>
 * 	<li>empty() -- 返回栈是否为空</li>
 * </ul>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li>你只能使用队列的基本操作-- 也就是&nbsp;<code>push to back</code>, <code>peek/pop from front</code>, <code>size</code>, 和&nbsp;<code>is empty</code>&nbsp;这些操作是合法的。</li>
 * 	<li>你所使用的语言也许不支持队列。&nbsp;你可以使用 list 或者 deque（双端队列）来模拟一个队列&nbsp;, 只要是标准的队列操作即可。</li>
 * 	<li>你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>implement-queue-using-stacks</li>
 * </ul>
 */
@Problem(
    id = 225,
    name = "implement-stack-using-queues",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK, Tag.DESIGN}
)
public class ImplementStackUsingQueues {

    private final Deque<Integer> deque = new ArrayDeque<>();

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        deque.addLast(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return deque.removeLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return deque.getLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return deque.isEmpty();
    }
}
