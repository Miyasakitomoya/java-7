package java7¼¶;

import java.util.Scanner;


public class J229 {
	public static void main(String[] args)  
    {  
		Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		byte b[]=str.getBytes(); 
		int byteLength=b.length; 
		int strLength=str.length(); 
		System.out.print(byteLength);
    }
}
