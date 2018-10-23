package cn.itcast_01;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("¡ı“‚");
		s1.setAge(30);
		System.out.println(s1.getName() + "," + s1.getAge());
		s1.show();
		System.out.println("-------------");

		Student s2 = new Student("¡÷«‡œº",23);
		System.out.println(s2.getName()+","+s2.getAge());
		s2.show();
	}

}
