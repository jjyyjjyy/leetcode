package io.github.jjyyjjyy.util;

import java.util.*;

/**
 * @author jy
 */
@SuppressWarnings("unchecked")
public class ArrayUtil {

    public static int[] toIntArray(List<Integer> list) {
        return list.stream().mapToInt(e -> e).toArray();
    }

    public static int[][] toIntArrays(List<List<Integer>> list) {
        return list.stream().map(l -> l.stream().mapToInt(e -> e).toArray()).toArray(int[][]::new);
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

    public static boolean[] toPrimitiveBooleanArray(Collection<Boolean> collection) {
        Object[] boxedArray = collection.toArray();
        int len = boxedArray.length;
        boolean[] array = new boolean[len];
        for (int i = 0; i < len; i++) {
            array[i] = (Boolean) boxedArray[i];
        }
        return array;
    }

    public static boolean isSame(int[][] result, int[][] expect) {
        if (expect.length != result.length) {
            return false;
        }
        for (int i = 0; i < expect.length; i++) {
            if (result[i].length != expect[i].length) {
                return false;
            }
            for (int j = 0; j < expect[i].length; j++) {
                if (result[i][j] != expect[i][j]) {
                    return false;
                }
            }
        }
        return true;
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
