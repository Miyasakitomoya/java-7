package java7级;

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
			System.out.println(year+" 年1月：31天 ");
			System.out.println(year+" 年2月：28天 ");
			System.out.println(year+" 年3月：31天 ");
			System.out.println(year+" 年4月：30天 ");
			System.out.println(year+" 年5月：31天 ");
			System.out.println(year+" 年6月：30天 ");
			System.out.println(year+" 年7月：31天 ");
			System.out.println(year+" 年8月：31天 ");
			System.out.println(year+" 年9月：30天 ");
			System.out.println(year+" 年10月：31天 ");
			System.out.println(year+" 年11月：30天 ");
			System.out.println(year+" 年12月：31天 ");
		}else {
			System.out.println(year+" 年1月：31天 ");
			System.out.println(year+" 年2月：29天 ");
			System.out.println(year+" 年3月：31天 ");
			System.out.println(year+" 年4月：30天 ");
			System.out.println(year+" 年5月：31天 ");
			System.out.println(year+" 年6月：30天 ");
			System.out.println(year+" 年7月：31天 ");
			System.out.println(year+" 年8月：31天 ");
			System.out.println(year+" 年9月：30天 ");
			System.out.println(year+" 年10月：31天 ");
			System.out.println(year+" 年11月：30天 ");
			System.out.println(year+" 年12月：31天 ");
		}
	}
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int year = scan.nextInt();
			getDays(year);
	 }
}
