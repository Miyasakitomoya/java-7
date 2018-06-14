package java7级;

public class J231 {
	public static void main(String[] args) {
        String appendStr = "";// 创建字符串变量
        long startTime = System.nanoTime();// 开始记事
        for (int i = 0; i < 3000; i++) {// 遍历3000个字符
            appendStr += (char) i;// 字符串与每个字符执行连接操作
        }
        long endTime = System.nanoTime();
        System.out.println("String用时：" + (endTime - startTime) / 1000000d + "毫秒");
        StringBuilder strBuilder = new StringBuilder();// 创建字符串构建器
        startTime = System.nanoTime();// 开始计时
        for (int i = 0; i <3000; i++) {// 遍历30000个字符
            strBuilder.append((char) i);// 把每个字符追加到构建器
        }
        endTime = System.nanoTime();// 结束记事
        System.out.println("StringBuilder用时：" + (endTime - startTime) / 1000000d + "毫秒");
	}
}
