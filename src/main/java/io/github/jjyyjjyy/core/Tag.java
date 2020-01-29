package io.github.jjyyjjyy.core;

public enum Tag {

    STACK("栈"),

    HEAP("堆"),

    GREEDY("贪心算法"),

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

    MEMOIZATION("记忆化"),

    QUEUE("队列"),

    MINIMAX("极小化极大"),

    RESERVOIR_SAMPLING("蓄水池抽样"),

    GEOMETRY("几何"),

    MAP("Map"),

    ARRAY("数组"),

    HASH_TABLE("哈希表"),

    LINKED_LIST("链表"),

    MATH("数学"),

    TWO_POINTERS("双指针"),

    STRING("字符串"),

    BINARY_SEARCH("二分查找"),

    DIVIDE_AND_CONQUER("分治算法"),

    DYNAMIC_PROGRAMMING("动态规划"),

    BACKTRACKING("回溯算法"),

    RANDOM("Random"),

    REJECTION_SAMPLING("Rejection Sampling"),

    SLIDING_WINDOW("Sliding Window"),

    ORDERED_MAP("Ordered Map"),

    LINE_SWEEP("Line Sweep");

    private final String name;

    Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
