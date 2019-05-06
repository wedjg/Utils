package utils;

import junit.framework.TestCase;
import org.junit.Test;
import utils.StrUtil;

import static org.junit.Assert.*;

/**
 * @Author: Liao Jiajian
 * @Create: 2019/05/05
 */
public class StrUtilTest extends TestCase {

    @Test
    public void testisEmpty() {
        assertTrue(StrUtil.isEmpty(""));
        assertTrue(StrUtil.isEmpty(null));
        assertTrue(StrUtil.isEmpty(" "));
        assertFalse(StrUtil.isEmpty("123"));
        assertFalse(StrUtil.isEmpty("..."));
    }

    @Test
    public void testisNumeric() {
        assertTrue(StrUtil.isNumeric("123"));
        assertTrue(StrUtil.isNumeric("0"));
        assertFalse(StrUtil.isNumeric(""));
        assertFalse(StrUtil.isNumeric(null));
        assertFalse(StrUtil.isNumeric(" "));
        assertFalse(StrUtil.isNumeric("50.2"));
        assertFalse(StrUtil.isNumeric("2,000"));
    }

    public void testisDateyyyyMMddhhmmss() {
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
}