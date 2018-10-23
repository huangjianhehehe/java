/**
 * 这是具体的狗类
 * @author Administrator
 * @version V1.1
 * */
package cn.itcast_02;

import cn.itcast_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的狗");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗 吃肉");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗 站着睡");
	}

}
