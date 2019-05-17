package com.wedjg.util;

/**
 * 日期工具类
 * @author : Liao Jiajian
 * @date : 2019/05/05
 */
public final class DateUtil {

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
    public static final String HOUR_PATTERN = "yyyy-MM-dd HH";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String MONTH_PATTERN = "yyyy-MM";
    public static final String YEAR_PATTERN = "yyyy";
    public static final String DATE_PATTERN2 = "yyyy/MM/dd";
	
	/**
	 *	获取当前标准格式的时间yyyy-MM-dd HH:mm:ss
	 */
	public static String getStandardTime() {
		return this.formatTime(new Date(), DATE_TIME_PATTERN);
	}
	
	/**
	 *	获取当前时间
	 */
	public static String getTimeByPattern(String pattern) {
		return this.formatTime(new Date(), pattern);
	}
	
	/**
	 *	格式化时间
	 */
	public static String formatTime(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}


}
