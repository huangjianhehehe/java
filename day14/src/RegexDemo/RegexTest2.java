package RegexDemo;

import java.util.Scanner;

public class RegexTest2 {
	// 3ae@geniusnet.com.tw

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要校验的邮箱:");
		String line = sc.nextLine();

		// 定义邮箱的规则
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		
		boolean flag =line.matches(regex);
		
		System.out.println("flag:"+flag);

	}

}
