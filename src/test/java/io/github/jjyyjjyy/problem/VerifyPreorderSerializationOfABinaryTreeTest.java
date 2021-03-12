package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class VerifyPreorderSerializationOfABinaryTreeTest {

    private static final VerifyPreorderSerializationOfABinaryTree VERIFY_PREORDER_SERIALIZATION_OF_A_BINARY_TREE = new VerifyPreorderSerializationOfABinaryTree();

    @ParameterizedTest
    @CsvSource({"'9,3,4,#,#,1,#,#,2,#,6,#,#',true", "'1,#',false", "'9,#,#,1',false", "'7,2,#,2,#,#,#,6,#',false"})
    void isValidSerialization(String preorder, boolean expect) {
        assertEquals(expect, VERIFY_PREORDER_SERIALIZATION_OF_A_BINARY_TREE.isValidSerialization(preorder));
    }
}
