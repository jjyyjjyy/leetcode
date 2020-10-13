package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/ransom-note/">赎金信</a>
 *
 * <p>给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。</p>
 *
 * <p>(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <p>你可以假设两个字符串均只含有小写字母。</p>
 *
 * <pre>
 * canConstruct(&quot;a&quot;, &quot;b&quot;) -&gt; false
 * canConstruct(&quot;aa&quot;, &quot;ab&quot;) -&gt; false
 * canConstruct(&quot;aa&quot;, &quot;aab&quot;) -&gt; true
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>stickers-to-spell-word</li>
 * </ul>
 */
@Problem(
    id = 383,
    name = "ransom-note",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        return false;
    }

}
