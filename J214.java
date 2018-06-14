package java7级;

import java.util.Scanner;

public class J214 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		J214 a=new J214();
		System.out.println(a.stringToUnicode(s));
	}
	
	public static String stringToUnicode(String string) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);  
            unicode.append("\\u" +Integer.toHexString(c));
        }
        return unicode.toString();
    }
}
