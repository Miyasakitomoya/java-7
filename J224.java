package java7¼¶;

import java.util.Random;

public class J224 {
	  public static void main( String args[] ) {
		  Random randomno = new Random();    
	      int[] value = new int[5];
	    for(int i=0;i<5;i++) {
	    	 System.out.print((value[i]=randomno.nextInt(30)+1)+" ");  
	    }
	  }
}
