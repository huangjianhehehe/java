package RegexDemo;

/**
 * 输入一个开始值,结束值,得到一个随机数
 * */

import java.util.Scanner;

public class RegexTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个开始数:");
		int start = sc.nextInt();
		System.out.println("请输入一个结束值:");
		int end = sc.nextInt();
		
		//请输出0-100之间的随机数
		for (int x = 0; x < 100; x++) {
			int num = getRandom(start, end);
			System.out.println(num);
		}

	}

	public static int getRandom(int start, int end) {
		int number = (int) (Math.random() * (end-start+1)) + start;
		return number;
	}

}
