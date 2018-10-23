package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<>();
		
		//创建对象
		Student s1 = new Student("张学友",41);
		Student s2 = new Student("周润发",45);
		Student s3 = new Student("刘备",50);
		
		//添加集合
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//遍历集合对象
		
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student str = it.next();
			System.out.println(str.getName()+"---"+str.getAge());
			
		}
		
	}
}
