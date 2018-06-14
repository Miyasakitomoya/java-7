package java7¼¶;

import java.util.Calendar;
import java.util.Date;

public class J236 {
	public static void main(String[] args) {
		Date date=new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);    
		calendar.add(Calendar.YEAR, +1);   
		calendar.add(Calendar.MONTH, -1);
		date.setTime(calendar.getTimeInMillis());
		System.out.println(date);
	}
}
