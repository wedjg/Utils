package utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Liao Jiajian
 * @date : 2019/05/06
 */
public class StrUtilTest {

    @Test
    public void isNullOrEmpty() {
        assertTrue(StrUtil.isNullOrEmpty(""));
        assertTrue(StrUtil.isNullOrEmpty(null));
        assertTrue(StrUtil.isNullOrEmpty(" "));
        assertFalse(StrUtil.isNullOrEmpty("123"));
        assertFalse(StrUtil.isNullOrEmpty("..."));
    }

    @Test
    public void isNull() {
        assertTrue(StrUtil.isNull(null));
        assertFalse(StrUtil.isNull(""));
        assertFalse(StrUtil.isNull(" "));
        assertFalse(StrUtil.isNull("132"));
        assertFalse(StrUtil.isNull("..."));
    }

    @Test
    public void isEmpty() {
        assertTrue(StrUtil.isEmpty(""));
        assertTrue(StrUtil.isEmpty(" "));
        assertFalse(StrUtil.isEmpty(null));
        assertFalse(StrUtil.isEmpty("132"));
        assertFalse(StrUtil.isEmpty("..."));
    }

    @Test
    public void isNumeric() {
        assertTrue(StrUtil.isNumeric("123"));
        assertTrue(StrUtil.isNumeric("0"));
        assertFalse(StrUtil.isNumeric(""));
        assertFalse(StrUtil.isNumeric(null));
        assertFalse(StrUtil.isNumeric(" "));
        assertFalse(StrUtil.isNumeric("50.2"));
        assertFalse(StrUtil.isNumeric("2,000"));
    }

    @Test
    public void isDateyyyyMMddhhmmss() {
        assertTrue(StrUtil.isDateyyyyMMddhhmmss("2019-01-02 00:00:00"));
        assertTrue(StrUtil.isDateyyyyMMddhhmmss("2019-01-02 23:59:59"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019-02-31 22:00:00"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019-01-01 22:61:00"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019-01-01 22:61:61"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019-01-01 25:00:00"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019-02-3100:00:00"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss("2019/01/01"));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss(""));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss(" "));
        assertFalse(StrUtil.isDateyyyyMMddhhmmss(null));
    }

    @Test
    public void isDateyyyyMMdd() {
    }

    @Test
    public void isDate() {
    }
}