package java7¼¶;

import java.util.Scanner;

public class J230 {
	public static void main(String[] args) {
	Scanner br=new Scanner(System.in);
	String str=br.nextLine();
	String from = br.nextLine();
	String to = br.nextLine();
	String strr=str.replaceAll(from,to);
	System.out.print(strr);
	}
}
