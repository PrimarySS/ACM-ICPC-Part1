package ������A��B;

/**
 * ��Ŀ������
 * �����Ŀ��ܼ򵥣�����������������A��B�ĺͣ�����A��B��������[1,1000]����΢�е��鷳���ǣ����벢����֤�������������� 
 * 
�����ʽ�� 
������һ�и���A��B������Կո�ֿ���������A��B��һ��������Ҫ�������������ʱ������ǳ�����Χ�����֡���������С�����ʵ����
������һ�����롣 
ע�⣺���ǰ������г��ֵĵ�1���ո���Ϊ��A��B�ķָ�����Ŀ��֤���ٴ���һ���ո񣬲���B����һ�����ַ�����

�����ʽ�� 
��������ȷ���������������򰴸�ʽ��A + B = �͡���������ĳ�����벻��Ҫ��������Ӧλ�������?������Ȼ��ʱ��Ҳ�ǡ�?���� 

��������1��
123 456
�������1��
123 + 456 = 579

��������2��
22. 18
�������2��
? + 18 = ?

��������3��
-100 blabla bla...33
�������3��
? + ? = ?

 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {

			String str = in.nextLine();

			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != '-' && str.charAt(i) - '0' < 0 && str.charAt(i) - '0' > 9) {
					flag = false;
					break;
				}
			}

			if (flag) {
				String[] a = str.split(" ");

				int A = Integer.parseInt(a[0]);
				int B = Integer.parseInt(a[1]);

				if ((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
					System.out.println(A + " + " + B + " = " + (A + B));
				} else if ((A >= 1 && A <= 1000)) {
					System.out.println(A + " + �� = ��");
				} else if ((B >= 1 && B <= 1000)) {
					System.out.println("? + " + B + " = ?");
				} else {
					System.out.println("? + ? = ?");
				}
			} else {
				System.out.println("2:? + ? = ?");
			}
		}
		in.close();

	}

}
