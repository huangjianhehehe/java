package day13_StringBuffer;

import java.util.Scanner;
/*
 * ����һ���ַ����ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ���,"aba","abba","aaa","mnanm"�ǶԳ��ַ���
 * 
 * 
  */

public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ����ж��Ƿ�Ϊ�Գ�:");
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
