package RegexDemo;

/**
 * ����һ����ʼֵ,����ֵ,�õ�һ�������
 * */

import java.util.Scanner;

public class RegexTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����ʼ��:");
		int start = sc.nextInt();
		System.out.println("������һ������ֵ:");
		int end = sc.nextInt();
		
		//�����0-100֮��������
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
