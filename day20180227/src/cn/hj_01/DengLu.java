package cn.hj_01;

import java.util.Scanner;

public class DengLu {

	/**
	 * @param args
	 */
	/*
		  ģ���¼,�����λ���,����ʾ���м���,�ɹ���ʼ�������С��Ϸ
	����:
	���������û���������.�Ѵ��ڵ�.
	B: ����¼���û���������
	�ã��Ƚ��û���������.
	       �������ͬ,���¼�ɹ�
	�����һ����ͬ,���¼ʧ��.
	D: �����λ���,��forѭ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "admin";
		for(int x = 0;x<3;x++){
			//����¼���������ַ������� 
			Scanner sc = new Scanner(System.in); 
			System.out.println("�������û���:");
			String  name = sc.nextLine();
			System.out.println("����������:");
			String pwd = sc.nextLine();
			//�Ƚ��û���������
			if(name.equals(username)&&pwd.equals(password)){
				//Ϊ��ʱ�˳�
				System.out.println("��¼�ɹ�");
				//break;
				GuessNumberGame.start();
			}else{
				if(2-x==0){
					System.out.println("�ʻ�����,����ϵϵͳ����Ա");
				}else
				{
					System.out.println("�û����������������,������"+(2-x)+"�λ�������");
				}
				
			}
		
		}

	}

}
