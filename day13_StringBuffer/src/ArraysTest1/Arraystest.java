package ArraysTest1;

import java.util.Arrays;

public class Arraystest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr = {33,22,55,68,23,13};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//¶ş·Ö²éÕÒ
		System.out.println(Arrays.binarySearch(arr, 67));
	}

}
