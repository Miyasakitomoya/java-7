package java7级;

import java.util.Calendar;
import java.util.Date;

public class J241 {
	public static String getWeekOfDate(Date date) {      
	    String[] weekOfDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};        
	    Calendar calendar = Calendar.getInstance();      
	    if(date != null){        
	         calendar.setTime(date);      
	    }        
	    int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;      
	    if (w < 0){        
	        w = 0;      
	    }      
	    return weekOfDays[w];    
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
	    String weekOfDate = null; 
	    Date date = new Date();
	    date.setDate(2013-12-25); 
	    weekOfDate = getWeekOfDate(date);
	    System.out.println(weekOfDate);
	 }
}
