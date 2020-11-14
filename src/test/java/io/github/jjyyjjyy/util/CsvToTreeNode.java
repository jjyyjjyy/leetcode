package io.github.jjyyjjyy.util;

import io.github.jjyyjjyy.core.TreeNode;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;

import static io.github.jjyyjjyy.util.CsvToArray.ARRAY_SPLITTER_REGEX;

/**
 * @author jy
 */
public class CsvToTreeNode extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        String sourceString = source.toString();
        if (sourceString.isEmpty() || "null".equals(sourceString)) {
            return null;
        }
        String[] strings = sourceString.split(ARRAY_SPLITTER_REGEX);
        Integer[] arr = Arrays.stream(strings).map(s -> s.isEmpty() || "null".equals(s) ? null : Integer.parseInt(s)).toArray(Integer[]::new);

        if (arr.length == 0) {
            return null;
        }
        return buildTreeNode(new TreeNode(), arr, 0);
    }

    private TreeNode buildTreeNode(TreeNode root, Integer[] arr, int idx) {
        if (idx >= arr.length) {
            return null;
        }
        root.val = arr[idx];
        root.left = buildTreeNode(new TreeNode(), arr, idx * 2 + 1);
        root.right = buildTreeNode(new TreeNode(), arr, idx * 2 + 2);
        return root;
    }
}