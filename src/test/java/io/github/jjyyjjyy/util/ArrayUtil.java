package io.github.jjyyjjyy.util;

import java.util.List;

/**
 * @author jy
 */
public class ArrayUtil {

    public static int[] toIntArray(List<Integer> list) {
        return list.stream().mapToInt(e -> e).toArray();
    }
}
