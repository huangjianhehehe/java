package day12_string_1;

/**
 * 把HelLoWoRLd第一个字母大写,其他小写
 * 
 * */

public class String_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelLoWoRLd";
		System.out.println(s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()));

	}

}
