package day12_string_1;
/**
 * Hello123World 判断有几个大写,小写,数字,其它不考虑
 * */
public class String_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello123World";
		//1.定义三个统计变量
		int bigCount =0;
		int smallCount=0;
		int numberCount=0;
		//2.遍历字符串,得到每个一字符
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		//3.判断字符是否为大写,小写,数字,计数
			if (ch>='A'&&ch<='Z') {
				bigCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
			}else if(ch>='0'&&ch<='9') {
				numberCount++;
			}
		}
		//4.打印计数
		System.out.println("大写字母:"+bigCount+"个");
		System.out.println("小写字母:"+smallCount+"个");
		System.out.println("数字:"+numberCount+"个");
	}

}
