package day13_StringBuffer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ���ֲ���:Ҳ���۰����
 * */
public class String2fenFound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {11,22,33,44,55,66,77};
		
		int find = binaryFound(arr, 66);
		System.out.println(find);
		
		
	}
	public static int binaryFound(int [] arr,int value){
		//1.�����������,��С����
		int max =arr.length-1;
		int min = 0;
		//2.�����м�����
		int mid =(max+min)/2;
		while (arr[mid]!=value) {
			if (value<arr[mid]) {
				max=mid-1;
			}else if(value>arr[mid]){
				min=mid+1;
			}
			mid=(max+min)/2;
		}
		return mid;
	}
	
	// ��ӡ�������
		private static void printArray(int[] arr) {
			String s = "";
			s += "[";
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length - 1) {
					s += arr[i];
				} else {
					s += arr[i];
					s += ",";
				}
			}
			s += "]";
			System.out.println(s);

		}

}
