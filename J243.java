package java7¼¶;

import java.util.Scanner;

public class J243 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		System.out.print(str.replaceAll("&", " "));
	}
}
