package java7¼¶;

import java.util.Scanner;

public class J228 {
	public static void  main(String[] args) {
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n));
	}
}
