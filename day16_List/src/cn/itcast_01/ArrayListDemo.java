package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("Hello");
		array.add("world");
		array.add("java");
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	
}
	
}
