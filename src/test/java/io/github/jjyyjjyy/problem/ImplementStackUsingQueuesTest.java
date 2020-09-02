package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jy
 */
class ImplementStackUsingQueuesTest {

    @Test
    void testImplementStack() {
        ImplementStackUsingQueues queue = new ImplementStackUsingQueues();

        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }

        for (int i = 4; i >= 0; i--) {
            Assertions.assertEquals(i, queue.pop());
        }

    }

}
