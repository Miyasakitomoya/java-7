package java7��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class J252 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
        String clidate = "1997-02-15";  
        Calendar cToday = Calendar.getInstance(); // �����  
        Calendar cBirth = Calendar.getInstance(); // ������  
        cBirth.setTime(myFormatter.parse(clidate)); // ��������  
        cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); // �޸�Ϊ����  
        int days;   
        if (cBirth.get(Calendar.DAY_OF_YEAR) < cToday.get(Calendar.DAY_OF_YEAR)) {  
            // �����Ѿ����ˣ�Ҫ���������  
            days = cToday.getActualMaximum(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);  
            days += cBirth.get(Calendar.DAY_OF_YEAR);  
        } else {  
            // ���ջ�û��  
            days = cBirth.get(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);  
        }  
        // ������  
        if (days == 0) {  
            System.out.println("��������");  
        } else {  
            System.out.println("�������ջ��У�" + days + "��");  
        }
	}
}