package java7��;

import java.util.Calendar;
import java.util.Date;

public class J233 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.getTime());
		Calendar c = Calendar.getInstance(); 
		//��1970.1.1��ʱ�ĺ�����
        c.setTime(date);  
        //��һ��
        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(c.getTime().getTime());
        //��ǰ������Ϊ����һ��������
        date.setTime(c.getTimeInMillis());
        System.out.println(date);
	}
}
