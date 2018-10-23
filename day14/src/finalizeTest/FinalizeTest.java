package finalizeTest;


public class FinalizeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Person p = new Person();
		Person p = new Person("утяеж╔", 60);
		System.out.println(p);
		
		p=null;
		System.gc();
		

	}

}
