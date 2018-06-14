package java7��;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J245 {
	 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String phone = input.nextLine();
	        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
	        if(phone.length() != 11){
	            System.out.println("�ֻ���ӦΪ11λ��");
	        }else{
	            Pattern p = Pattern.compile(regex);
	            Matcher m = p.matcher(phone);
	            boolean isMatch = m.matches();
	            if(isMatch){
	                System.out.println("�ֻ�����Ϸ�");
	            } else {
	                System.out.println("�ֻ����벻�Ϸ�");
	            }
	        }
	 }
}
