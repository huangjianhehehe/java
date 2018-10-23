package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 找出字符串中有三个字符的
 * "da jia ting wo shuo ,jin tian yao xia yu ,bu shang wan zi xi kai xin bu ?"
 * **/
public class RegexTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="da jia ting wo shuo ,jin tian yao xia yu ,bu shang wan zi xi kai xin bu ?";
		
		///定义规则
		String regex = "\\b\\w{3}\\b";
		
		//把规则 编译 成模式对象 
		Pattern p = Pattern.compile(regex);
		//通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		//通过group()得到值 
		while (m.find()) {//通过find方法就是查找有没有满足条件的子串
			System.out.println(m.group());
			
		}
	}

}
