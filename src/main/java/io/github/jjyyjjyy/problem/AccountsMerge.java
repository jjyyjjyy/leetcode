package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.*;

/**
 * <a href="https://leetcode-cn.com/problems/accounts-merge/">账户合并</a>
 *
 * <p>给定一个列表 <code>accounts</code>，每个元素 <code>accounts[i]</code>&nbsp;是一个字符串列表，其中第一个元素 <code>accounts[i][0]</code>&nbsp;是&nbsp;<em>名称 (name)</em>，其余元素是 <em>emails </em>表示该帐户的邮箱地址。</p>
 *
 * <p>现在，我们想合并这些帐户。如果两个帐户都有一些共同的邮件地址，则两个帐户必定属于同一个人。请注意，即使两个帐户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的帐户，但其所有帐户都具有相同的名称。</p>
 *
 * <p>合并帐户后，按以下格式返回帐户：每个帐户的第一个元素是名称，其余元素是按顺序排列的邮箱地址。accounts 本身可以以任意顺序返回。</p>
 *
 * <p><strong>例子 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong>
 * accounts = [[&quot;John&quot;, &quot;johnsmith@mail.com&quot;, &quot;john00@mail.com&quot;], [&quot;John&quot;, &quot;johnnybravo@mail.com&quot;], [&quot;John&quot;, &quot;johnsmith@mail.com&quot;, &quot;john_newyork@mail.com&quot;], [&quot;Mary&quot;, &quot;mary@mail.com&quot;]]
 * <strong>Output:</strong> [[&quot;John&quot;, &#39;john00@mail.com&#39;, &#39;john_newyork@mail.com&#39;, &#39;johnsmith@mail.com&#39;],  [&quot;John&quot;, &quot;johnnybravo@mail.com&quot;], [&quot;Mary&quot;, &quot;mary@mail.com&quot;]]
 * <strong>Explanation:</strong>
 *   第一个和第三个 John 是同一个人，因为他们有共同的电子邮件 &quot;johnsmith@mail.com&quot;。
 *   第二个 John 和 Mary 是不同的人，因为他们的电子邮件地址没有被其他帐户使用。
 *   我们可以以任何顺序返回这些列表，例如答案[[&#39;Mary&#39;，&#39;mary@mail.com&#39;]，[&#39;John&#39;，&#39;johnnybravo@mail.com&#39;]，
 *   [&#39;John&#39;，&#39;john00@mail.com&#39;，&#39;john_newyork@mail.com&#39;，&#39;johnsmith@mail.com&#39;]]仍然会被接受。
 *
 * </pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ul>
 * 	<li><code>accounts</code>的长度将在<code>[1，1000]</code>的范围内。</li>
 * 	<li><code>accounts[i]</code>的长度将在<code>[1，10]</code>的范围内。</li>
 * 	<li><code>accounts[i][j]</code>的长度将在<code>[1，30]</code>的范围内。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>redundant-connection</li>
 *   <li>sentence-similarity</li>
 *   <li>sentence-similarity-ii</li>
 * </ul>
 */
@Problem(
    id = 721,
    name = "accounts-merge",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.UNION_FIND}
)
public class AccountsMerge {

    /**
     * 1. 建立邮箱->索引, 邮箱->姓名的对应关系.
     * 2. 创建一个并查集, 遍历输入的账户, 将每个账户的邮箱的索引加入到并查集里.
     * 3. 遍历邮箱, 从并查集里找到相同id的邮箱加入到同一组里, 然后根据第一个邮箱对应的姓名组装成结果集.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int emailCount = 0;
        Map<String, Integer> mailIndex = new HashMap<>();
        Map<String, String> mailName = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                mailIndex.put(email, emailCount++);
                mailName.put(email, name);
            }
        }

        UnionFind unionFind = new UnionFind(emailCount);
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstEmailIndex = mailIndex.get(firstEmail);
            int size = account.size();
            for (int i = 2; i < size; i++) {
                String email = account.get(i);
                unionFind.union(firstEmailIndex, mailIndex.get(email));
            }
        }
        Map<Integer, List<String>> indexToMails = new HashMap<>();

        for (String mail : mailIndex.keySet()) {
            int index = unionFind.find(mailIndex.get(mail));
            List<String> existedMails = indexToMails.getOrDefault(index, new ArrayList<>());
            existedMails.add(mail);
            indexToMails.put(index, existedMails);
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> mails : indexToMails.values()) {
            Collections.sort(mails);
            String name = mailName.get(mails.get(0));
            List<String> currentResult = new ArrayList<>();
            currentResult.add(name);
            currentResult.addAll(mails);

            result.add(currentResult);
        }

        return result;
    }

    private static class UnionFind {
        private final int[] ids;

        private UnionFind(int n) {
            this.ids = new int[n];
            for (int i = 0; i < n; i++) {
                this.ids[i] = i;
            }
        }

        public int find(int x) {
            if (x != ids[x]) {
                ids[x] = find(ids[x]);
            }
            return ids[x];
        }

        public void union(int x, int y) {
            ids[find(x)] = find(y);
        }
    }
}
