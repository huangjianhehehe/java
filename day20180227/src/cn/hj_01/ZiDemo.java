package cn.hj_01;

class Fu{
	public  void show(){
		System.out.println("这是绝密资源,任何人不得访问 !");
	}
	
}
class Zi extends Fu{
	public void show(){
		System.out.println("这是一堆垃圾");
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
