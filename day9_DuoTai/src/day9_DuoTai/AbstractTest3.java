package day9_DuoTai;

/*
 * ѧ������
 * ��������:������ѧԱ,��ҵ��ѧԱ
 * ����:����,����,�༶,ѧϰ,�Է�
 * 
 * ����:
 * 	������ѧԱ
 * 		��Ա����:����,����,�༶
 * 		��Ա����:ѧϰ,�Է�
	��ҵ��ѧԱ
 * 		��Ա����:����,����,�༶
 * 		��Ա����:ѧϰ,�Է�
 * 
 * �õ�һ��ѧԱ��
 * 		��Ա����:����,����,�༶
 * 		��Ա����:ѧϰ,�Է�
 * ʵ��:
 * 		ѧԱ��
 * 		������ѧԱ
 * 		��ҵ��ѧԱ
 * 
*/
abstract class Student{
	//��Ա����,����,����,�༶
	private String name;
	private int age;
	private String grand;
	
	//�޲ι���
	public Student(){}
	//�вι���
	public Student(String name,int age,String grand){
		this.name=name;
		this.age= age;
		this.grand=grand;
	}
	//���� get/set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getGrand(){
		return grand;
	}
	public void setGrand(String grand){
		this.grand = grand;
	}
	//ѧϰ
	public abstract void study();
	//�Է�
	public void eat(){
		System.out.println("ѧϰ���˾ͳԷ�");
	}
}
class BasicStudent extends Student{
	//������������캯��
	public BasicStudent(){}
	public BasicStudent(String name,int age,String brand){
		super(name,age,brand);
	}
	public void study(){
		System.out.println("������ѧԱѧϰJ2SE");
	}
}
class WorkStudent extends Student{
	public WorkStudent(){}
	public WorkStudent(String name,int age,String brand){
		super(name,age,brand);
		
	}
	public void study(){
		System.out.println("��ҵ��ѧԱѧϰJ2EE");
	}
}
public class AbstractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new BasicStudent();
		s.setName("����ϼ");
		s.setAge(27);
		s.setGrand("1023");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		System.out.println("-------------------");
		
		s=new BasicStudent("����",40,"1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		
		s= new WorkStudent("����",35,"1232");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		
		
		

	}

}
