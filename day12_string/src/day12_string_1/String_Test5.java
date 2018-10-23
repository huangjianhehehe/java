package day12_string_1;
/**
 *从大串中找小串的个数
 *例 如:woaijavawozhendezhendehenaijavajavaismylifewoaijavaee
 * 
 * */
public class String_Test5 {
	public static void main(String[] args) {
//		String s="woaijavawozhendezhendehenaijavajavaismylifewoaijavaee";
//		//定义一个计数器为0
//		int count =0;
		
		//先在大串中查找一次小串第一次出现的位置
		String maxString="woaijavawozhendezhendehenaijavajavaismylifewoaijavaee";
		String minString="java";
		int count = MyFound(maxString,minString);
//		int index=maxString.indexOf(minString);
//		
//		//索引不是-1,就说明存在,统计变量++
//		while (index!=-1) {
//			count++;
//			//把刚才的索引+小串的长度作为起始位置截取上一次的大串,返回一个新的字符串,并把该 字符串的值重新赋值给大串
//			int startIndex = index+minString.length();
//			maxString = maxString.substring(startIndex);
//			index=maxString.indexOf(minString);
//			
//		}
		System.out.println(count);
	}
	
	//改良为方法实现
	public static int MyFound(String maxString,String minString){
		int count =0;
		int index=maxString.indexOf(minString);
		
		//索引不是-1,就说明存在,统计变量++
		while (index!=-1) {
			count++;
			//把刚才的索引+小串的长度作为起始位置截取上一次的大串,返回一个新的字符串,并把该 字符串的值重新赋值给大串
			int startIndex = index+minString.length();
			maxString = maxString.substring(startIndex);
			index=maxString.indexOf(minString);
			
		}
		return count;
	}

}
