package day13_StringBuffer;

/*
 *ð������ 
 *
 * */
public class StringBufferTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 26, 22, 80, 52, 1 };
		// ���Ȱ���ʽ�����
		printArray(arr);
		SortMP(arr);

		printArray(arr);
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

	public static void SortMP(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) { // �ȽϵĴ���
			for (int y = 0; y < arr.length - 1 - x; y++) { // ÿһ�αȽϺ�,���ٱȽ�һ��
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}

		}
	}
}
