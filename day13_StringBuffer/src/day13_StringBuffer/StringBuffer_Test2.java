package day13_StringBuffer;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 键盘录入字符串进行反转输出 
 * */
public class StringBuffer_Test2 {

	//两种方式
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("请输入一个字符串进行反转:");
		String ss= s.nextLine();
		
		
		

		String s1=MyReverse(ss);
		System.out.println(s1);
		System.out.println("-------------------------");
		String s2=MyReverse2(ss);
		System.out.println(s2);
		
	
		
	}
	//1.String方式
	public static String MyReverse(String s){
		String result = "";
		char [] chs = s.toCharArray();
		for (int i = chs.length-1; i >=0; i--) {
			result+= chs[i];
			
		}
		return result;
		
	}
	//2.StringBuffer方式 
	public static String MyReverse2(String s){
		return new StringBuffer(s).reverse().toString();
	}
	
}
