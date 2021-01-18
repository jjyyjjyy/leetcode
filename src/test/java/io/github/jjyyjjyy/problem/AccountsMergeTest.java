package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class AccountsMergeTest {

    private static final AccountsMerge ACCOUNTS_MERGE = new AccountsMerge();

    @ParameterizedTest
    @CsvSource({"'[John,johnsmith@mail.com,john00@mail.com],[John,johnnybravo@mail.com],[John,johnsmith@mail.com,john_newyork@mail.com],[Mary,mary@mail.com]','[John,johnnybravo@mail.com],[John,john00@mail.com,john_newyork@mail.com,johnsmith@mail.com],[Mary,mary@mail.com]'"})
    void accountsMerge(@ConvertWith(CsvToArray.class) String[][] accounts,
                       @ConvertWith(CsvToArray.class) String[][] expect) {
        assertTrue(ArrayUtil.isSame(expect, ArrayUtil.toArray(ACCOUNTS_MERGE.accountsMerge(ArrayUtil.toList(accounts)))));
    }
}
