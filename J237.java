package java7��;

import java.text.SimpleDateFormat;  
import java.util.Date;  
  
/** 
 * Created by lxk on 2016/11/4 
 */  
public class J237 {  
    public static void main(String[] args) {  
        Date ss = new Date();  
        System.out.println("һ�����������" + ss);  
        System.out.println("ʱ�����" + ss.getTime());  
        //Date aw = Calendar.getInstance().getTime();//���ʱ�����һ�ַ�ʽ������Ч��һ��  
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String time = format0.format(ss.getTime());//������ǰ�ʱ�����������õ�������ʽ��ʱ��  
        System.out.println("��ʽ�����0��" + time);  
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");  
        time = format1.format(ss.getTime());  
        System.out.println("��ʽ�����1��" + time);  
    }  
}  
