package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.NestedInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jy
 */
class NestedIteratorTest {


    @Test
    void next() {

        List<NestedInteger> list = new ArrayList<>();

        NestedInteger e1 = new NestedInteger();
        e1.add(new NestedInteger(1));
        e1.add(new NestedInteger(1));
        list.add(e1);
        list.add(new NestedInteger(2));
        NestedInteger e2 = new NestedInteger();
        e2.add(new NestedInteger(1));
        e2.add(new NestedInteger(1));
        list.add(e2);


        NestedIterator iterator = new NestedIterator(list);

        int[] expect = {1, 1, 2, 1, 1};
        int i = 0;

        while (iterator.hasNext()) {
            Assertions.assertEquals(expect[i++], iterator.next());
        }
    }
}
