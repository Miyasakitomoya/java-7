package java7��;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J216 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String x=br.nextLine();
		if(Pattern.matches("\\d+", x)) {
			System.out.println("������ַ���������");
		}else {
			System.out.println("������ַ�����������");
		}
	}
}
