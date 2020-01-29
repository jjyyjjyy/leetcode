package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/lru-cache/">LRU缓存机制</a>
 *
 * <p>运用你所掌握的数据结构，设计和实现一个&nbsp; <a href="https://baike.baidu.com/item/LRU" target="_blank">LRU (最近最少使用) 缓存机制</a>。它应该支持以下操作： 获取数据 <code>get</code> 和 写入数据 <code>put</code> 。</p>
 *
 * <p>获取数据 <code>get(key)</code> - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。<br>
 * 写入数据 <code>put(key, value)</code> - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。</p>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <p>你是否可以在&nbsp;<strong>O(1)</strong> 时间复杂度内完成这两种操作？</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>LRUCache cache = new LRUCache( 2 /* 缓存容量  );
 *
 * cache.put(1, 1);
 * cache.put(2, 2);
 * cache.get(1);       // 返回  1
 * cache.put(3, 3);    // 该操作会使得密钥 2 作废
 * cache.get(2);       // 返回 -1 (未找到)
 * cache.put(4, 4);    // 该操作会使得密钥 1 作废
 * cache.get(1);       // 返回 -1 (未找到)
 * cache.get(3);       // 返回  3
 * cache.get(4);       // 返回  4
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>lfu-cache</li>
 *   <li>design-in-memory-file-system</li>
 *   <li>design-compressed-string-iterator</li>
 * </ul>
 */
@Problem(
    id = 146,
    name = "lru-cache",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DESIGN}
)
public class LRUCache {
}
