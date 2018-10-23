package RegexDemo;

import java.util.Scanner;

public class RegexTest1 {


	public static void main(String[] args) {
		
		//键盘录入手机号码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的手机号码:");
		String phone =sc.nextLine();
		
		//定义手机号码的规则 
		String regex ="1[385]\\d{9}";
		
		//调用功能,判断即可
		boolean flag = phone.matches(regex);
		
		System.out.println("flag:"+flag);
		
	}

}
