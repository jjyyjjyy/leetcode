package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ExcelSheetColumnTitleTest {

    private static final ExcelSheetColumnTitle EXCEL_SHEET_COLUMN_TITLE = new ExcelSheetColumnTitle();

    @ParameterizedTest
    @CsvSource({"1,A", "28,AB", "701,ZY", "26,Z"})
    void convertToTitle(int n, String expect) {
        assertEquals(expect, EXCEL_SHEET_COLUMN_TITLE.convertToTitle(n));
    }
}
