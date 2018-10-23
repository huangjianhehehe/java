package day13_StringBuffer;

import java.util.Scanner;
/*
 * 输入一个字符串判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串,"aba","abba","aaa","mnanm"是对称字符串
 * 
 * 
  */

public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串判断是否为对称:");
		String s = sc.nextLine();
		
		boolean b = isSame(s);
		System.out.println(b);
	}
	public static boolean isSame(String s){
		boolean flag =true;
		char [] arr = s.toCharArray();
		for (int start=0,end=arr.length-1; start < end; start++,end--) {
			if (arr[start]!=arr[end]) {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
