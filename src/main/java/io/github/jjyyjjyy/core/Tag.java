package io.github.jjyyjjyy.core;

public enum Tag {

    STACK("栈"),

    HEAP("堆"),

    GREEDY("贪心"),

    SORT("排序"),

    BIT_MANIPULATION("位运算"),

    TREE("树"),

    DEPTH_FIRST_SEARCH("深度优先搜索"),

    BREADTH_FIRST_SEARCH("广度优先搜索"),

    UNION_FIND("并查集"),

    GRAPH("图"),

    DESIGN("设计"),

    TOPOLOGICAL_SORT("拓扑排序"),

    TRIE("字典树"),

    BINARY_INDEXED_TREE("树状数组"),

    SEGMENT_TREE("线段树"),

    BINARY_SEARCH_TREE("二叉搜索树"),

    RECURSION("递归"),

    BRAINTEASER("脑筋急转弯"),

    MEMOIZATION("记忆化搜索"),

    QUEUE("队列"),

    MINIMAX("极小化极大"),

    RESERVOIR_SAMPLING("水塘抽样"),

    GEOMETRY("几何"),

    MAP("Map"),

    ARRAY("数组"),

    HASH_TABLE("哈希表"),

    LINKED_LIST("链表"),

    MATH("数学"),

    TWO_POINTERS("双指针"),

    STRING("字符串"),

    BINARY_SEARCH("二分查找"),

    DIVIDE_AND_CONQUER("分治"),

    DYNAMIC_PROGRAMMING("动态规划"),

    BACKTRACKING("回溯"),

    BINARY_TREE("二叉树"),

    BITMASK("状态压缩"),

    BUCKET_SORT("桶排序"),

    COMBINATORICS("组合数学"),

    CONCURRENCY("多线程"),

    COUNTING("计数"),

    COUNTING_SORT("计数排序"),

    DATA_STREAM("数据流"),

    DATABASE("数据库"),

    DOUBLY_LINKED_LIST("双向链表"),

    ENUMERATION("枚举"),

    GAME_THEORY("博弈"),

    INTERACTIVE("交互"),

    ITERATOR("迭代器"),

    MATRIX("矩阵"),

    MINIMUM_SPANNING_TREE("最小生成树"),

    NUMBER_THEORY("数论"),

    OOP("OOP"),

    ORDERED_SET("有序集合"),

    PREFIX_SUM("前缀和"),

    QUICKSELECT("快速选择"),

    RADIX_SORT("基数排序"),

    SHELL("Shell"),

    SHORTEST_PATH("最短路"),

    SORTING("排序"),

    STRING_MATCHING("字符串匹配"),

    SUFFIX_ARRAY("后缀数组"),

    RANDOM("Random"),

    REJECTION_SAMPLING("拒绝采样"),

    SLIDING_WINDOW("滑动窗口"),

    ORDERED_MAP("Ordered Map"),

    LINE_SWEEP("扫描线"),

    MONOTONIC_QUEUE("单调队列"),

    MONOTONIC_STACK("单调栈"),

    SIMULATION("模拟"),

    BICONNECTED_COMPONENT("双连通分量"),

    DEQUEUE("Dequeue"),

    EULERIAN_CIRCUIT("欧拉回路"),

    HASH_FUNCTION("哈希函数"),

    PRIORITY_QUEUE("堆（优先队列）"),

    MEET_IN_THE_MIDDLE("Meet in the Middle"),

    MERGE_SORT("归并排序"),

    PROBABILITY_AND_STATISTICS("概率与统计"),

    RANDOMIZED("随机化"),

    ROLLING_HASH("滚动哈希"),

    STRONGLY_CONNECTED_COMPONENT("强连通分量");

    private final String name;

    Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
