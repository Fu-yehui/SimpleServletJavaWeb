package com.roger.chapter1.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilTest {

    @Test
    void isEmpty() {
        String str="";
        boolean result=StringUtil.isEmpty(str);
        assertTrue(result);
        str=null;
        result=StringUtil.isEmpty(str);
        assertTrue(result);
        str="fds";
        result=StringUtil.isEmpty(str);
        assertFalse(result);
    }

    @Test
    void isNotEmpty() {

    }
}