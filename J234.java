package java7��;

import java.util.Calendar;
import java.util.Date;

public class J234 {
    
    public static void main(String[] args) {
    /*
     * ʹ��Calendar�ṩ�ľ�̬������ȡ�ʵ���ʵ��
     * Ĭ�ϴ���calendar��ʾ���ǵ�ǰϵͳ��ʱ��
     */
        Calendar calendar  = Calendar.getInstance();
        /*
         * �鿴������������
         * obj.getClass().getName()
         */
        String className
            =calendar.getClass().getName();
        System.out.println(className);
        
        //�������java.util.GregorianCalendar ��toString����ֵ
        System.out.println(calendar);
        /*
         * calendar ������һ������
         * Date getTime����
         * ����һ��������Calendar��ʾ��ʱ���Date����
         * 
         */
            Date date =calendar.getTime();
            System.out.println(date);
            
    }
}