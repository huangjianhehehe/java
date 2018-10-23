package mytest1;

import cn.itcast_02.Animal;
import cn.itcast_02.Cat;
import cn.itcast_02.Dog;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Cat();
		a.eat();
		a.sleep();
		a = new Dog();
		a.eat();
		a.sleep();
		
		Dog d = (Dog)a;
		d.jump();
		
	}

}
