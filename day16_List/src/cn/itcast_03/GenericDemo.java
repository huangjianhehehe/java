package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 用泛型写集合数组并遍历 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			String str =it.next();
			System.out.println(str);
			
		}
		System.out.println("------");
		for (int i = 0; i < arr.size(); i++) {
			//String s = arr.get(i);
			System.out.println(arr.get(i));
		}
	}

}
