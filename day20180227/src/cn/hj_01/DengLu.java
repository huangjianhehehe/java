package cn.hj_01;

import java.util.Scanner;

public class DengLu {

	/**
	 * @param args
	 */
	/*
		  模拟登录,给三次机会,并提示还有几次,成功后开始玩猜数字小游戏
	分析:
	Ａ：定义用户名和密码.已存在的.
	B: 键盘录入用户名和密码
	Ｃ：比较用户名和密码.
	       如果都相同,则登录成功
	如果有一个不同,则登录失败.
	D: 给三次机会,用for循环
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "admin";
		for(int x = 0;x<3;x++){
			//键盘录入两个这字符串对象 
			Scanner sc = new Scanner(System.in); 
			System.out.println("请输入用户名:");
			String  name = sc.nextLine();
			System.out.println("请输入密码:");
			String pwd = sc.nextLine();
			//比较用户名和密码
			if(name.equals(username)&&pwd.equals(password)){
				//为真时退出
				System.out.println("登录成功");
				//break;
				GuessNumberGame.start();
			}else{
				if(2-x==0){
					System.out.println("帐户锁定,请联系系统管理员");
				}else
				{
					System.out.println("用户名或密码输入错误,您还有"+(2-x)+"次机会输入");
				}
				
			}
		
		}

	}

}
