package day12_string_1;

import java.util.Scanner;
/**
 * 如果改为方法实现,需要两个明确:
 * 1.返回值类型
 * 2.参数列表
 * */
public class String_Test4 {
	public static void main(String[] args) {
		//1.创建键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个进行反转的字符串");
		String s = sc.nextLine();
//		//2.定义一个新的字符串
//		String ss = "";
//		//把字符串转换为字符数组
//		char [] ch = s.toCharArray();
//		//4.倒序遍历字符数组,获取每一个值 
//		for (int i = ch.length-1; i >=0; i--) {
//			ss+=ch[i];
//		}
		String ss=Myreverse(s);
		System.out.println(ss);
		
	}
	
	public static String Myreverse(String s){
		//2.定义一个新的字符串
				String ss = "";
				//把字符串转换为字符数组
				char [] ch = s.toCharArray();
				//4.倒序遍历字符数组,获取每一个值 
				for (int i = ch.length-1; i >=0; i--) {
					ss+=ch[i];
				}
				
				return ss;
	}
}
