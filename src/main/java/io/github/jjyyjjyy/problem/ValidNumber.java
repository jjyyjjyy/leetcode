package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/valid-number/">有效数字</a>
 *
 * <p>验证给定的字符串是否可以解释为十进制数字。</p>
 *
 * <p>例如:</p>
 *
 * <p><code>&quot;0&quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot; 0.1 &quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot;abc&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;1 a&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;2e10&quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot; -90e3&nbsp; &nbsp;&quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot; 1e&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;e3&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot; 6e-1&quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot; 99e2.5&nbsp;&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;53.5e93&quot;</code>&nbsp;=&gt;&nbsp;<code>true</code><br>
 * <code>&quot; --6 &quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;-+3&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code><br>
 * <code>&quot;95a54e53&quot;</code>&nbsp;=&gt;&nbsp;<code>false</code></p>
 *
 * <p><strong>说明:</strong>&nbsp;我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。这里给出一份可能存在于有效十进制数字中的字符列表：</p>
 *
 * <ul>
 * 	<li>数字 0-9</li>
 * 	<li>指数 - &quot;e&quot;</li>
 * 	<li>正/负号 - &quot;+&quot;/&quot;-&quot;</li>
 * 	<li>小数点 - &quot;.&quot;</li>
 * </ul>
 *
 * <p>当然，在输入中，这些字符的上下文也很重要。</p>
 *
 * <p><strong>更新于 2015-02-10:</strong><br>
 * <code>C++</code>函数的形式已经更新了。如果你仍然看见你的函数接收&nbsp;<code>const char *</code> 类型的参数，请点击重载按钮重置你的代码。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>string-to-integer-atoi</li>
 * </ul>
 */
@Problem(
    id = 65,
    name = "valid-number",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH, Tag.STRING}
)
public class ValidNumber {

    /**
     * FSM
     * 定义一系列状态, 每一个状态可以在特定条件下转移到另外一个状态, 判断最终状态是否合法.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isNumber(String s) {
        Map<State, Map<CharType, State>> transfer = new HashMap<>();
        Map<CharType, State> initialMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
        }};
        transfer.put(State.STATE_INITIAL, initialMap);
        Map<CharType, State> intSignMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transfer.put(State.STATE_INT_SIGN, intSignMap);
        Map<CharType, State> integerMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_POINT, State.STATE_POINT);
        }};
        transfer.put(State.STATE_INTEGER, integerMap);
        Map<CharType, State> pointMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transfer.put(State.STATE_POINT, pointMap);
        Map<CharType, State> pointWithoutIntMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
        }};
        transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
        Map<CharType, State> fractionMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transfer.put(State.STATE_FRACTION, fractionMap);
        Map<CharType, State> expMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
        }};
        transfer.put(State.STATE_EXP, expMap);
        Map<CharType, State> expSignMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_SIGN, expSignMap);
        Map<CharType, State> expNumberMap = new HashMap<>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_NUMBER, expNumberMap);

        int length = s.length();
        State state = State.STATE_INITIAL;

        for (int i = 0; i < length; i++) {
            CharType type = toCharType(s.charAt(i));
            if (!transfer.get(state).containsKey(type)) {
                return false;
            } else {
                state = transfer.get(state).get(type);
            }
        }
        return state == State.STATE_INTEGER || state == State.STATE_POINT || state == State.STATE_FRACTION || state == State.STATE_EXP_NUMBER || state == State.STATE_END;
    }

    public CharType toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_NUMBER;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_EXP;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == '+' || ch == '-') {
            return CharType.CHAR_SIGN;
        } else {
            return CharType.CHAR_ILLEGAL;
        }
    }

    private enum State {
        STATE_INITIAL,
        STATE_INT_SIGN,
        STATE_INTEGER,
        STATE_POINT,
        STATE_POINT_WITHOUT_INT,
        STATE_FRACTION,
        STATE_EXP,
        STATE_EXP_SIGN,
        STATE_EXP_NUMBER,
        STATE_END
    }

    private enum CharType {
        CHAR_NUMBER,
        CHAR_EXP,
        CHAR_POINT,
        CHAR_SIGN,
        CHAR_ILLEGAL
    }
}
