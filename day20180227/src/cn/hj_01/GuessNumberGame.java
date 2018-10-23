package cn.hj_01;

import java.util.Scanner;

public class GuessNumberGame {

	private GuessNumberGame() {

	}

	public static void start() {
		// 产生一个1-100的随机数
		int number = (int) (Math.random() * 100) + 1;
		// 键盘录入数据
		while (true) {
					Scanner sc = new Scanner(System.in);
					System.out.println("请输入你要猜的数(1-100):");
					int num = sc.nextInt();
					
					if (num > number) {
						System.out.println("你猜的数字" + num + "大了");
		
					} else if (num < number) {
						System.out.println("你猜的数字" + num + "小了");
					} else {
						System.out.println("您猜对了");
						break;
					}
		          }
	}
}
