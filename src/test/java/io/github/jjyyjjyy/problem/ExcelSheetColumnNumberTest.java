package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ExcelSheetColumnNumberTest {

    private static final ExcelSheetColumnNumber EXCEL_SHEET_COLUMN_NUMBER = new ExcelSheetColumnNumber();

    @ParameterizedTest
    @CsvSource({"A,1", "AB,28", "ZY,701"})
    void titleToNumber(String s, int expect) {
        assertEquals(expect, EXCEL_SHEET_COLUMN_NUMBER.titleToNumber(s));
    }
}
