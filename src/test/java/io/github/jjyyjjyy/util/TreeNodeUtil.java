package io.github.jjyyjjyy.util;

import io.github.jjyyjjyy.core.TreeNode;

import java.util.Objects;

/**
 * @author jy
 */
public class TreeNodeUtil {

    public static boolean isSame(TreeNode target, TreeNode expect) {
        if (expect == null) {
            return target == null;
        }
        if (target == null || !Objects.equals(target.val, expect.val)) {
            return false;
        }
        return isSame(target.left, expect.left) && isSame(target.right, expect.right);
    }
}
