package day9_DuoTai;

class Student1 {
	public void study(){
		System.out.println("Good Good Good Study");
	}
}
class StudentDemo {
	public void method(Student1 s){
		s.study();
	}
}

class StudentHao extends Student1{
	
}

public class StudentTest {
	public static void main(String [] args){
		Student1 s = new Student1();
		s.study();
		System.out.println("---------------------");
		
		StudentDemo sd = new StudentDemo();
		Student1 s1 = new Student1();
		
	}
}
