package day9_DuoTai;

class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}
class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method zi");
	}
}
class Fuzi {
	public static void main(String [] args){
		Fu f = new Zi();
		f.show();
		Zi z = (Zi)f;
		z.method();
}
	

}
