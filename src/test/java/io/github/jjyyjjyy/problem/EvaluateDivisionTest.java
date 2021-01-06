package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class EvaluateDivisionTest {

    private static final EvaluateDivision EVALUATE_DIVISION = new EvaluateDivision();

    @ParameterizedTest
    @CsvSource({"'[a,b],[b,c]','2.0,3.0','[a,c],[b,a],[a,e],[a,a],[x,x]','6,0.5,-1,1,-1'", "'[a,b],[b,c],[bc,cd]','1.5,2.5,5','[a,c],[c,b],[bc,cd],[cd,bc]','3.75,0.4,5,0.2'", "'[a,b]','0.5','[a,b],[b,a],[a,c],[x,y]','0.5,2,-1,-1'"})
    void calcEquation(@ConvertWith(CsvToArray.class) String[][] equations,
                      @ConvertWith(CsvToArray.class) double[] values,
                      @ConvertWith(CsvToArray.class) String[][] queries,
                      @ConvertWith(CsvToArray.class) double[] expect) {
        Assertions.assertArrayEquals(expect, EVALUATE_DIVISION.calcEquation(ArrayUtil.toList(equations), values, ArrayUtil.toList(queries)));
    }
}
