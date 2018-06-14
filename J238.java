package java7级;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J238 {
	 public static void main(String[] args) {
		 String string = "1981-09-19 09:07:27";
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Date date = null;
	        try {
	            date = dateFormat.parse(string);
	        System.out.println(date);//切割掉不要的时分秒数据
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	 }
}
