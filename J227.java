package java7��;

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
            System.out.println("IP��ַ��Ч");
            return;
        }
         
    }
    System.out.println("IP��ַ��Ч");
	}
}
