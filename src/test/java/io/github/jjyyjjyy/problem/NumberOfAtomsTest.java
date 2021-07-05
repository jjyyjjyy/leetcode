package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfAtomsTest {

    private static final NumberOfAtoms NUMBER_OF_ATOMS = new NumberOfAtoms();

    @ParameterizedTest
    @CsvSource({"H2O,H2O", "Mg(OH)2,H2MgO2", "K4(ON(SO3)2)2,K4N2O14S4", "Be32,Be32"})
    void countOfAtoms(String formula, String expect) {
        assertEquals(expect, NUMBER_OF_ATOMS.countOfAtoms(formula));
    }
}
