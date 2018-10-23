package day13_StringBuffer;

/*
 *冒泡排序法 
 *
 * */
public class StringBufferTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 26, 22, 80, 52, 1 };
		// 首先按格式输出来
		printArray(arr);
		SortMP(arr);

		printArray(arr);
	}

	// 打印数组出来
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

	public static void SortMP(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) { // 比较的次数
			for (int y = 0; y < arr.length - 1 - x; y++) { // 每一次比较后,会少比较一个
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}

		}
	}
}
