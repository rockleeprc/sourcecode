package org.smart4j.chapter5.soap;

import org.junit.Test;
import org.smart4j.framework.helper.DatabaseHelper;

public class DatabaseHelperTest {

    @Test
    public void test() {
        DatabaseHelper.update("TRUNCATE TABLE test");
        for (int i = 1; i <= 1000; i++) {
            DatabaseHelper.update("INSERT INTO test (value) VALUES (?)", i);
        }
    }
}
