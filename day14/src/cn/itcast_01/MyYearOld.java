package cn.itcast_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *��һ��,������������������?
 *����:
 *	A:����¼����ĳ���������
 *	B:�Ѹ��ַ���ת����һ������
 *	C:ͨ�������ڵõ�һ��������
 *	D:��ȡ��ǰʱ��ĺ�����
 *	E:��D-C�õ�һ��������
 *	F:��E�еĺ�����ת��Ϊ����
 *		/1000/60/60/24 
 */
public class MyYearOld {
	public static void main(String[] args) throws ParseException  {
		//����¼����ĳ���������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ���������(yyyy-MM-dd):");
		String line =sc.nextLine();
		
		//�Ѹ��ַ���ת����һ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(line);
		//ͨ�������ڵõ�һ��������
		long myTime =d.getTime();
		
		//��ȡ��ǰʱ��ĺ�����
		long nowtime = System.currentTimeMillis();
		
		//��D-C�õ�һ��������
		long time = nowtime-myTime;
		
		long day = time/1000/60/60/24;
		
		System.out.println("�������������"+day+"��");
	}

}
