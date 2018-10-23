package cn.itcast_02;

/**
 * 这是一个具体的猫类
 * @author Administrator
 * @version V1.1
 * */
public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("猫趴着睡觉");
	}

}
