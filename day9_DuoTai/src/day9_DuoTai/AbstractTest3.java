package day9_DuoTai;

/*
 * 学生案例
 * 具体事务:基础班学员,就业班学员
 * 共性:姓名,年龄,班级,学习,吃饭
 * 
 * 分析:
 * 	基础班学员
 * 		成员变量:姓名,年龄,班级
 * 		成员方法:学习,吃饭
	就业班学员
 * 		成员变量:姓名,年龄,班级
 * 		成员方法:学习,吃饭
 * 
 * 得到一个学员类
 * 		成员变量:姓名,年龄,班级
 * 		成员方法:学习,吃饭
 * 实现:
 * 		学员类
 * 		基础班学员
 * 		就业班学员
 * 
*/
abstract class Student{
	//成员变量,姓名,年龄,班级
	private String name;
	private int age;
	private String grand;
	
	//无参构造
	public Student(){}
	//有参构造
	public Student(String name,int age,String grand){
		this.name=name;
		this.age= age;
		this.grand=grand;
	}
	//属性 get/set
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
	//学习
	public abstract void study();
	//吃饭
	public void eat(){
		System.out.println("学习累了就吃饭");
	}
}
class BasicStudent extends Student{
	//子类的两个构造函数
	public BasicStudent(){}
	public BasicStudent(String name,int age,String brand){
		super(name,age,brand);
	}
	public void study(){
		System.out.println("基础班学员学习J2SE");
	}
}
class WorkStudent extends Student{
	public WorkStudent(){}
	public WorkStudent(String name,int age,String brand){
		super(name,age,brand);
		
	}
	public void study(){
		System.out.println("就业班学员学习J2EE");
	}
}
public class AbstractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new BasicStudent();
		s.setName("林青霞");
		s.setAge(27);
		s.setGrand("1023");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		System.out.println("-------------------");
		
		s=new BasicStudent("武鑫",40,"1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		
		s= new WorkStudent("刘意",35,"1232");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.eat();
		s.study();
		
		
		

	}

}
