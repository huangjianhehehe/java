package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<>();
		
		//��������
		Student s1 = new Student("��ѧ��",41);
		Student s2 = new Student("����",45);
		Student s3 = new Student("����",50);
		
		//��Ӽ���
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//�������϶���
		
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student str = it.next();
			System.out.println(str.getName()+"---"+str.getAge());
			
		}
		
	}
}
