/**
 * ���Ǿ���Ĺ���
 * @author Administrator
 * @version V1.1
 * */
package cn.itcast_02;

import cn.itcast_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�� ����");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�� վ��˯");
	}

}
