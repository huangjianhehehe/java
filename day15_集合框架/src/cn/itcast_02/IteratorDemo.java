package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//����Person����
		Person p1 = new Person("����ϼ", 27);
		Person p2 = new Person("������", 37);
		Person p3 = new Person("�����", 33);
		Person p4 = new Person("��", 25);
		Person p5 = new Person("ѩ��", 27);
		
		//��Person��ӵ�������
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		
		//����
		Iterator it =c.iterator();
		while(it.hasNext()){
			Person p= (Person)it.next();
			System.out.println(p.getName()+"----"+p.getAge());
		}
		
		
		
}
}
