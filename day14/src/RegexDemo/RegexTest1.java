package RegexDemo;

import java.util.Scanner;

public class RegexTest1 {


	public static void main(String[] args) {
		
		//����¼���ֻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ�����:");
		String phone =sc.nextLine();
		
		//�����ֻ�����Ĺ��� 
		String regex ="1[385]\\d{9}";
		
		//���ù���,�жϼ���
		boolean flag = phone.matches(regex);
		
		System.out.println("flag:"+flag);
		
	}

}
