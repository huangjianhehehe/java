package day10_�β�;

//�ӿ���Ϊ���ò���

interface Love{
	public abstract void love();
	
}
class LoveDemo{
	public void method(Love l){
		l.love();
	}
}
//���������ʵ�ֽӿ�
class Teacher implements Love{
	public void love(){
		System.out.println("��ʦ��ʲ��");
	}
}
public class TeacherTest {

	public static void main(String [] args){
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}
