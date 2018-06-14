package java7级;

import java.util.Calendar;
import java.util.Date;

public class J234 {
    
    public static void main(String[] args) {
    /*
     * 使用Calendar提供的静态方法获取适当的实例
     * 默认创建calendar表示的是当前系统的时间
     */
        Calendar calendar  = Calendar.getInstance();
        /*
         * 查看对象具体的类型
         * obj.getClass().getName()
         */
        String className
            =calendar.getClass().getName();
        System.out.println(className);
        
        //输出的是java.util.GregorianCalendar 的toString返回值
        System.out.println(calendar);
        /*
         * calendar 定义了一个方法
         * Date getTime（）
         * 返回一个描述改Calendar表示的时间的Date对象
         * 
         */
            Date date =calendar.getTime();
            System.out.println(date);
            
    }
}