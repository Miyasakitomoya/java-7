package java7��;

import java.util.Scanner;

public class J235 {
	public static void getDays(int year) {    
		int days = 0;    
		boolean isLeapYear = false;    
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {    
		isLeapYear = true;    
		} else {    
		isLeapYear = false;    
		}    
		if(isLeapYear==false) {    
			System.out.println(year+" ��1�£�31�� ");
			System.out.println(year+" ��2�£�28�� ");
			System.out.println(year+" ��3�£�31�� ");
			System.out.println(year+" ��4�£�30�� ");
			System.out.println(year+" ��5�£�31�� ");
			System.out.println(year+" ��6�£�30�� ");
			System.out.println(year+" ��7�£�31�� ");
			System.out.println(year+" ��8�£�31�� ");
			System.out.println(year+" ��9�£�30�� ");
			System.out.println(year+" ��10�£�31�� ");
			System.out.println(year+" ��11�£�30�� ");
			System.out.println(year+" ��12�£�31�� ");
		}else {
			System.out.println(year+" ��1�£�31�� ");
			System.out.println(year+" ��2�£�29�� ");
			System.out.println(year+" ��3�£�31�� ");
			System.out.println(year+" ��4�£�30�� ");
			System.out.println(year+" ��5�£�31�� ");
			System.out.println(year+" ��6�£�30�� ");
			System.out.println(year+" ��7�£�31�� ");
			System.out.println(year+" ��8�£�31�� ");
			System.out.println(year+" ��9�£�30�� ");
			System.out.println(year+" ��10�£�31�� ");
			System.out.println(year+" ��11�£�30�� ");
			System.out.println(year+" ��12�£�31�� ");
		}
	}
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int year = scan.nextInt();
			getDays(year);
	 }
}
