package day13_StringBuffer;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ����¼���ַ������з�ת��� 
 * */
public class StringBuffer_Test2 {

	//���ַ�ʽ
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("������һ���ַ������з�ת:");
		String ss= s.nextLine();
		
		
		

		String s1=MyReverse(ss);
		System.out.println(s1);
		System.out.println("-------------------------");
		String s2=MyReverse2(ss);
		System.out.println(s2);
		
	
		
	}
	//1.String��ʽ
	public static String MyReverse(String s){
		String result = "";
		char [] chs = s.toCharArray();
		for (int i = chs.length-1; i >=0; i--) {
			result+= chs[i];
			
		}
		return result;
		
	}
	//2.StringBuffer��ʽ 
	public static String MyReverse2(String s){
		return new StringBuffer(s).reverse().toString();
	}
	
}
