package java7��;

public class J222 {
	public static void main(String[] args) {
		String s="want you to know one thing";
		String[] c=s.split("");
		int x=0;int y=0;
		for(int i=0;i<c.length;i++) {
			if(c[i].equals("o")) {
				x+=1;
			}else if(c[i].equals("n")) {
				y+=1;
			}
		}
		System.out.println("o���ֵĴ����ǣ�"+x);
		System.out.println("n���ֵĴ����ǣ�"+y);
}
}
