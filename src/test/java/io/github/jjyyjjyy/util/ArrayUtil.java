package io.github.jjyyjjyy.util;

import java.util.List;

/**
 * @author jy
 */
public class ArrayUtil {

    public static int[] toIntArray(List<Integer> list) {
        return list.stream().mapToInt(e -> e).toArray();
    }

    public static boolean isSame(String[][] result, String[][] expect) {
        if (result == null && expect == null) {
            return true;
        }
        if (result == null || expect == null || result.length != expect.length) {
            return false;
        }
        for (int i = 0; i < expect.length; i++) {
            String[] expectArr = expect[i];
            String[] resultArr = result[i];
            if (expectArr.length != resultArr.length) {
                return false;
            }
            for (int j = 0; j < expectArr.length; j++) {
                if (!resultArr[j].equals(expectArr[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
