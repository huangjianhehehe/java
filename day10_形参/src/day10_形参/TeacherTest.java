package day10_形参;

//接口作为引用参数

interface Love{
	public abstract void love();
	
}
class LoveDemo{
	public void method(Love l){
		l.love();
	}
}
//定义具体类实现接口
class Teacher implements Love{
	public void love(){
		System.out.println("老师爱什黎");
	}
}
public class TeacherTest {

	public static void main(String [] args){
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}
