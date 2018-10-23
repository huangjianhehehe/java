package cn.itcast_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *算一下,你来到这个世界多少天?
 *分析:
 *	A:键盘录入你的出生年月日
 *	B:把该字符串转换成一个日期
 *	C:通过该日期得到一个毫秒数
 *	D:获取当前时间的毫秒数
 *	E:用D-C得到一个毫秒数
 *	F:把E中的毫秒数转换为天数
 *		/1000/60/60/24 
 */
public class MyYearOld {
	public static void main(String[] args) throws ParseException  {
		//键盘录入你的出生年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日(yyyy-MM-dd):");
		String line =sc.nextLine();
		
		//把该字符串转换成一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(line);
		//通过该日期得到一个毫秒数
		long myTime =d.getTime();
		
		//获取当前时间的毫秒数
		long nowtime = System.currentTimeMillis();
		
		//用D-C得到一个毫秒数
		long time = nowtime-myTime;
		
		long day = time/1000/60/60/24;
		
		System.out.println("你来到这个世界"+day+"天");
	}

}
