package itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		//collection接口不能实例化
		Collection c = new ArrayList();
		
		c.add("Hello");
		c.add("World");
		
//		c.clear();
		System.out.println(c);
		System.out.println(c.remove("World"));
		System.out.println(c);
		
	}
}
