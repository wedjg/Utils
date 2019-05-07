package com.wedjg.util;

import java.math.BigDecimal;

/**
 * BigDecimal的工具类，包含加减乘除运算；
 * @author : Liao Jiajian
 * @date : 2019/05/07
 */
public final class BigDecimalUtil {

    private static final int DECIMAL_SCALE = 2;

    private BigDecimalUtil(){
    }

    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public static BigDecimal add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return b1.add(b2);
    }






}
