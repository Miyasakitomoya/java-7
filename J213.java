package java7��;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
  
public class J213 {  
      
    //�������Ĵ�д���ֵı�ͻ��ҵ�λ�ı�  
    static String[] cnNumTab = {"��", "Ҽ", "��", "��", "��", "��", "½", "��","��", "��"};  
    static String[] integerUnitTab = {"", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ"};  
    static String[] decimalUnitTab = {"��", "��", "��"};  
      
    public static void main(String[] args) {   
          
        //�������������ڽ��ռ���¼�������  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
        try {  
            //�Ѽ��̽��յĽ�����ݵ�С��λ������λ�ָ���  
            String str = in.readLine();  
            String[] strArr = str.split("\\.");  
              
            //�ѷָ��õ���λ������ݷֱ��ɢ���ַ�����  
            char[] chNumArrInteger = strArr[0].toCharArray();  
              
            //�Ѱ���������ת��Ϊ���ĵĴ�д����  
            String[] convertIntegerNum = convertUpper(chNumArrInteger);  
              
            //�����ƴ���ֺ͵�λ�õ�����  
            StringBuilder container = new StringBuilder("Ԫ��");  
              
            //Ƕ����ҵ�λ��ת���õ����Ĵ�д������ȥ  
            for(int x = convertIntegerNum.length -1, y = 0; x >=0; x--, y++) {  
                String num = convertIntegerNum[x];  
                if(num.equals("��")) {  
                    //�ж���λ�Ƿ���Ǫ���ڵ�λ�ã�������뵥λ  
                    if(y == 4 || y == 8)  
                        container.insert(0, num+integerUnitTab[y]);  
                    else  
                        container.insert(0, num);  
                } else {  
                    container.insert(0, num+integerUnitTab[y]);  
                }  
            }  
              
            //�����С��λ�����С��λ����Ҳ����ͬ����ת������  
            if(strArr.length == 2) {  
                int len = container.length();  
                container.replace(len - 2, len, "Ԫ");  
                  
                char[] chNumArrDecimal = strArr[1].toCharArray();  
                String[] convertDecimalNum = convertUpper(chNumArrDecimal);  
                  
                //Ƕ����ҵ�λ��ת���õ����Ĵ�д������ȥ  
                for (int x = 0; x < convertDecimalNum.length; x++) {  
                    container.append(convertDecimalNum[x]+decimalUnitTab[x]);  
                }  
            }  
              
            //��ʽ����  
            String put = container.toString();  
            put = put.replaceAll("����+��", "����");  
            put = put.replaceAll("����+��", "����");  
            put = put.replaceAll("Ǫ��+��", "Ǫ��");  
            put = put.replaceAll("Ǫ��+��", "Ǫ��");  
            put = put.replaceAll("��+", "��");  
            put = put.replaceAll("����", "��");  
            put = put.replaceAll("������", "��");  
            put = put.replaceAll("ʰ��", "ʰ");  
            put = put.replaceAll("��Ԫ", "Ԫ");  
              
            //��ɺ��ӡ���  
            System.out.println(put);  
              
        } catch (NumberFormatException e) {  
            System.out.println("���������������Ч�Ľ������");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        //����¼����������ݺ�������Ȼ�Ͽ��ˣ�������ù�����Դ�ķ�����  
    }  
      
    //�Ѱ���������ת��Ϊ���ĵĴ�д����  
    public static String[] convertUpper(char[] arr) {  
        String[] convertNum = new String[arr.length];  
        for(int x = 0; x < arr.length; x++) {  
            int num = Integer.parseInt(arr[x]+"");  
            convertNum[x] = cnNumTab[num];  
        }  
          
        return convertNum;  
    }  
      
}  
