package utils;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串工具类
 * @Author: Liao Jiajian
 * @Create: 2019/05/05
 */
public final class StrUtil {

    /**
     * 构造方法
     */
    private StrUtil() {
    }

    /**
     * 字符串判空
     * <br>当字符串为null、空格时都会返回false
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }


    /**
     * 判断字符串是否为纯数字，不含空格
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串是否为 yyyy-MM-dd hh:mm:ss
     * @param str
     * @return
     */
    public static boolean isDateyyyyMMddhhmmss(String str) {
        return isDate(str, DateUtil.DATE_TIME_PATTERN);
    }

    public static boolean isDateyyyyMMdd(String str) {
        return isDate(str, DateUtil.DATE_PATTERN);
    }

    /**
     * 严格判断字符串是否是日期格式
     * @param str
     * @param type
     * @return
     */
    public static boolean isDate(String str, String type) {
        if (isEmpty(str)) {
            return false;
        }
        boolean result = true;
        SimpleDateFormat sdf = new SimpleDateFormat(type);
        sdf.setLenient(false);
        try {
            sdf.parse(str);
        } catch (ParseException e) {
            result = false;
        }
        return result;
    }




}
