package java7级;

import java.util.Scanner;

public class J227 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String id = input.next();
     
    String[] idnumber= id.split("\\.");

    for(int a=0;a<idnumber.length;a++)
    {

        if(Integer.parseInt(idnumber[a])>=255)
        {
            System.out.println("IP地址无效");
            return;
        }
         
    }
    System.out.println("IP地址有效");
	}
}
