package day12_string_1;

import java.util.Scanner;
/**
 * �����Ϊ����ʵ��,��Ҫ������ȷ:
 * 1.����ֵ����
 * 2.�����б�
 * */
public class String_Test4 {
	public static void main(String[] args) {
		//1.��������¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����з�ת���ַ���");
		String s = sc.nextLine();
//		//2.����һ���µ��ַ���
//		String ss = "";
//		//���ַ���ת��Ϊ�ַ�����
//		char [] ch = s.toCharArray();
//		//4.��������ַ�����,��ȡÿһ��ֵ 
//		for (int i = ch.length-1; i >=0; i--) {
//			ss+=ch[i];
//		}
		String ss=Myreverse(s);
		System.out.println(ss);
		
	}
	
	public static String Myreverse(String s){
		//2.����һ���µ��ַ���
				String ss = "";
				//���ַ���ת��Ϊ�ַ�����
				char [] ch = s.toCharArray();
				//4.��������ַ�����,��ȡÿһ��ֵ 
				for (int i = ch.length-1; i >=0; i--) {
					ss+=ch[i];
				}
				
				return ss;
	}
}
