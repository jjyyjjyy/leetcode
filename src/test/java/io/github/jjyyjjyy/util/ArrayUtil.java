package io.github.jjyyjjyy.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author jy
 */
@SuppressWarnings("unchecked")
public class ArrayUtil {

    public static int[] toIntArray(List<Integer> list) {
        return list.stream().mapToInt(e -> e).toArray();
    }

    public static <T> T[][] toArray(List<List<T>> list) {
        Object[][] result = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).toArray(Object[]::new);
        }
        return (T[][]) result;
    }

    public static <T> List<List<T>> toList(T[][] array) {
        List<List<T>> list = new ArrayList<>();
        for (T[] ts : array) {
            list.add(Arrays.asList(ts));
        }
        return list;
    }

    public static boolean isSame(Object[][] result, Object[][] expect) {
        if (result == null && expect == null) {
            return true;
        }
        if (result == null || expect == null || result.length != expect.length) {
            return false;
        }
        for (int i = 0; i < expect.length; i++) {
            Object[] expectArr = expect[i];
            Object[] resultArr = result[i];
            if (expectArr.length != resultArr.length) {
                return false;
            }
            for (int j = 0; j < expectArr.length; j++) {
                if (!Objects.equals(resultArr[j], expectArr[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
