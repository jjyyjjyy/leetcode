package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfOperationsToMakeNetworkConnectedTest {

    private static final NumberOfOperationsToMakeNetworkConnected NUMBER_OF_OPERATIONS_TO_MAKE_NETWORK_CONNECTED = new NumberOfOperationsToMakeNetworkConnected();

    @ParameterizedTest
    @CsvSource({"4,'[0,1],[0,2],[1,2]',1", "6,'[0,1],[0,2],[0,3],[1,2],[1,3]',2", "6,'[0,1],[0,2],[0,3],[1,2]',-1", "5,'[0,1],[0,2],[3,4],[2,3]',0"})
    void makeConnected(int n, @ConvertWith(CsvToArray.class) int[][] connections, int expect) {
        assertEquals(expect, NUMBER_OF_OPERATIONS_TO_MAKE_NETWORK_CONNECTED.makeConnected(n, connections));
    }
}
