package day13_StringBuffer;

public class StringBufferTest5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 26, 22, 80, 52, 1 };
		// ���Ȱ���ʽ�����
		printArray(arr);
		
		SortSelect(arr);
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
	public static void SortSelect(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) { // �ȽϵĴ���
			for (int y =x+1; y < arr.length; y++) { // ÿһ�αȽϺ�,���ٱȽ�һ��
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}

		}
	}
	
}
