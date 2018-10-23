package itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		Collection c2= new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		
		System.out.println("retainAll:"+c1.retainAll(c2));
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
	}
}
