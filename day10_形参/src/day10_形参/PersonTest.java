package day10_�β�;

abstract class Person {
	public abstract void study();
}
class PersonDemo {
	public void method(Person p){
		//�����ǳ������,���ص��Ǹ�����������
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
		//����:��Ҫʹ��PersonDemo�е�method����
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		
	}
}
