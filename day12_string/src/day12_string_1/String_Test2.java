package day12_string_1;
/**
 * Hello123World �ж��м�����д,Сд,����,����������
 * */
public class String_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello123World";
		//1.��������ͳ�Ʊ���
		int bigCount =0;
		int smallCount=0;
		int numberCount=0;
		//2.�����ַ���,�õ�ÿ��һ�ַ�
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		//3.�ж��ַ��Ƿ�Ϊ��д,Сд,����,����
			if (ch>='A'&&ch<='Z') {
				bigCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
			}else if(ch>='0'&&ch<='9') {
				numberCount++;
			}
		}
		//4.��ӡ����
		System.out.println("��д��ĸ:"+bigCount+"��");
		System.out.println("Сд��ĸ:"+smallCount+"��");
		System.out.println("����:"+numberCount+"��");
	}

}
