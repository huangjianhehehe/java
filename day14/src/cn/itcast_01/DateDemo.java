package cn.itcast_01;


import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		//创建时间对象 
		
		Date d =new Date();
		
		long time =d.getTime();
		System.out.println(time);
		
		System.out.println(System.currentTimeMillis());
		System.out.println(d);
		
		d.setTime(1000);
		System.out.println(d);
		
	}
}
