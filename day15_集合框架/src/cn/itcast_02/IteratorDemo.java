package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建Person对象
		Person p1 = new Person("林青霞", 27);
		Person p2 = new Person("风清扬", 37);
		Person p3 = new Person("令狐冲", 33);
		Person p4 = new Person("玉春", 25);
		Person p5 = new Person("雪瑞", 27);
		
		//把Person添加到集合中
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		
		//遍历
		Iterator it =c.iterator();
		while(it.hasNext()){
			Person p= (Person)it.next();
			System.out.println(p.getName()+"----"+p.getAge());
		}
		
		
		
}
}
