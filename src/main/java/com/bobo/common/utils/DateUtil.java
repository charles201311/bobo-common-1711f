package com.bobo.common.utils;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: charles
 * @date: 2020年2月28日 上午8:57:46
 */
public class DateUtil {

	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param min 最小日期
	 * @param max 最大日期
	 * @return 在 min 和max之间的随机日期
	 * @return: Date
	 */
	public  static Date randomDate(Date min,Date max) {
		// 获取最小日期的毫秒数.从1970到min 的毫秒数
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		if(t1 > t2 ) return null;
		
		double d = Math.random();  //返回0-1 之间的随机值
	    long x = (long) (d *(t2 - t1 +1 )+t1);
		return new Date(x);
		
	}
}
