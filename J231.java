package java7��;

public class J231 {
	public static void main(String[] args) {
        String appendStr = "";// �����ַ�������
        long startTime = System.nanoTime();// ��ʼ����
        for (int i = 0; i < 3000; i++) {// ����3000���ַ�
            appendStr += (char) i;// �ַ�����ÿ���ַ�ִ�����Ӳ���
        }
        long endTime = System.nanoTime();
        System.out.println("String��ʱ��" + (endTime - startTime) / 1000000d + "����");
        StringBuilder strBuilder = new StringBuilder();// �����ַ���������
        startTime = System.nanoTime();// ��ʼ��ʱ
        for (int i = 0; i <3000; i++) {// ����30000���ַ�
            strBuilder.append((char) i);// ��ÿ���ַ�׷�ӵ�������
        }
        endTime = System.nanoTime();// ��������
        System.out.println("StringBuilder��ʱ��" + (endTime - startTime) / 1000000d + "����");
	}
}
