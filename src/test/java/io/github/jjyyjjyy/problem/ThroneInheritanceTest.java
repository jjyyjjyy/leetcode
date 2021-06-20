package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class ThroneInheritanceTest {

    @Test
    void getInheritanceOrder() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");
        assertArrayEquals(new String[]{"king", "andy", "matthew", "bob", "alex", "asha", "catherine"}, throneInheritance.getInheritanceOrder().toArray(String[]::new));
        throneInheritance.death("bob");
        assertArrayEquals(new String[]{"king", "andy", "matthew", "alex", "asha", "catherine"}, throneInheritance.getInheritanceOrder().toArray(String[]::new));

    }
}
