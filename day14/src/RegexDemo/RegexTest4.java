package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �ҳ��ַ������������ַ���
 * "da jia ting wo shuo ,jin tian yao xia yu ,bu shang wan zi xi kai xin bu ?"
 * **/
public class RegexTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="da jia ting wo shuo ,jin tian yao xia yu ,bu shang wan zi xi kai xin bu ?";
		
		///�������
		String regex = "\\b\\w{3}\\b";
		
		//�ѹ��� ���� ��ģʽ���� 
		Pattern p = Pattern.compile(regex);
		//ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		//ͨ��group()�õ�ֵ 
		while (m.find()) {//ͨ��find�������ǲ�����û�������������Ӵ�
			System.out.println(m.group());
			
		}
	}

}
