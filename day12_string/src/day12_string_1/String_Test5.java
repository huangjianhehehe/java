package day12_string_1;
/**
 *�Ӵ�����С���ĸ���
 *�� ��:woaijavawozhendezhendehenaijavajavaismylifewoaijavaee
 * 
 * */
public class String_Test5 {
	public static void main(String[] args) {
//		String s="woaijavawozhendezhendehenaijavajavaismylifewoaijavaee";
//		//����һ��������Ϊ0
//		int count =0;
		
		//���ڴ��в���һ��С����һ�γ��ֵ�λ��
		String maxString="woaijavawozhendezhendehenaijavajavaismylifewoaijavaee";
		String minString="java";
		int count = MyFound(maxString,minString);
//		int index=maxString.indexOf(minString);
//		
//		//��������-1,��˵������,ͳ�Ʊ���++
//		while (index!=-1) {
//			count++;
//			//�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ�,����һ���µ��ַ���,���Ѹ� �ַ�����ֵ���¸�ֵ����
//			int startIndex = index+minString.length();
//			maxString = maxString.substring(startIndex);
//			index=maxString.indexOf(minString);
//			
//		}
		System.out.println(count);
	}
	
	//����Ϊ����ʵ��
	public static int MyFound(String maxString,String minString){
		int count =0;
		int index=maxString.indexOf(minString);
		
		//��������-1,��˵������,ͳ�Ʊ���++
		while (index!=-1) {
			count++;
			//�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ�,����һ���µ��ַ���,���Ѹ� �ַ�����ֵ���¸�ֵ����
			int startIndex = index+minString.length();
			maxString = maxString.substring(startIndex);
			index=maxString.indexOf(minString);
			
		}
		return count;
	}

}
