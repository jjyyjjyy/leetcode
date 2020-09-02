package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class ImplementQueueUsingStacksTest {

    @Test
    void testImplementQueue() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();

        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }

        for (int i = 0; i < 5; i++) {
            assertEquals(i, queue.pop());
        }
        assertTrue(queue.empty());
    }

}
