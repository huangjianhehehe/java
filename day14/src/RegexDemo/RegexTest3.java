package RegexDemo;

public class RegexTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ages = "18-24";
		
		//定义规则
		String regex ="-";
		
		String [] strArray = ages.split(regex);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
