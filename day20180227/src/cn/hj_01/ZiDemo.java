package cn.hj_01;

class Fu{
	public  void show(){
		System.out.println("���Ǿ�����Դ,�κ��˲��÷��� !");
	}
	
}
class Zi extends Fu{
	public void show(){
		System.out.println("����һ������");
	}
}
public class ZiDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show();
		

	}

}
