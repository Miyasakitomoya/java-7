package java7��;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J226 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		if(Pattern.matches("http://.*", s)) {
			System.out.println("�����������ҳ��ַ");
		}else if(Pattern.matches("ftp://.*", s)){
			System.out.println("��������ǳ��ı�����Э��");
		}
	}
}
