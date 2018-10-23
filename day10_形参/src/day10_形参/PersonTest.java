package day10_形参;

abstract class Person {
	public abstract void study();
}
class PersonDemo {
	public void method(Person p){
		//参数是抽象类的,返回的是该类的子类对象
		p.study();
	}
}

class Student extends Person {
	public void study(){
		System.out.println("Good Good Study");
	
	}
}
public class PersonTest {
	public static void main(String [] args){
		//需求:我要使用PersonDemo中的method方法
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		
	}
}
