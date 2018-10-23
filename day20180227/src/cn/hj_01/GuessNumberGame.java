package cn.hj_01;

import java.util.Scanner;

public class GuessNumberGame {

	private GuessNumberGame() {

	}

	public static void start() {
		// ����һ��1-100�������
		int number = (int) (Math.random() * 100) + 1;
		// ����¼������
		while (true) {
					Scanner sc = new Scanner(System.in);
					System.out.println("��������Ҫ�µ���(1-100):");
					int num = sc.nextInt();
					
					if (num > number) {
						System.out.println("��µ�����" + num + "����");
		
					} else if (num < number) {
						System.out.println("��µ�����" + num + "С��");
					} else {
						System.out.println("���¶���");
						break;
					}
		          }
	}
}
