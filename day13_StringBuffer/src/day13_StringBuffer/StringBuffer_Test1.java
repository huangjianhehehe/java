package day13_StringBuffer;



/**
 * 数组进行字符串的接接
 * */
public class StringBuffer_Test1 {
	public static void main(String[] args) {
		
		int [] arr = {11,22,33,44,55,55};
		//用两种方式
		//1.String方式
	String s=arrayToString1(arr);
		System.out.println(s);
		System.out.println("------------");
		
	String s1 =arrayToString2(arr);
	System.out.println(s1);
		
	}
	public static String arrayToString1(int [] arr)
	{
		String s = "";
		s+="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				s+=arr[i];
			}
			else {
				
				s+=arr[i];
				s+=",";
			}
			
		}
		s+="]";
		return s;
	}
//2.方式2
	public static String arrayToString2(int [] arr){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i==arr.length-1) {
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(",");
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
}
