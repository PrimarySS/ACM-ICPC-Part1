package ��Ӷ���;

/**
 * ��Ŀ����  
����һ���ϴ������ N(1<=N<=2,000,000,000) 
���� 980364535�����ǳ�����Ҫһλһλ����������Ǽ�λ��������������� ������ÿ��λ��һ�����ţ������ø��������ʶ��� 
��ˣ�������ּ��϶��ų����µ�ģ����980,364,535��дһ������������������� 

��������:
һ��һ������ N
�������:
һ��һ���ַ�����ʾ����궺�ŵĽ��
ʾ��1 
����
980364535
���
980,364,535
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String str = cin.nextLine();
			// ���ȷ�Χ��[1-3]
			if (str.length() <= 3) {
				System.out.println(str);
			} else {
				// ���ȷ�Χ��[4-n]
				// �����ַ���
				str = new StringBuffer(str).reverse().toString();
				String newStr = "";

				// ������������Ӷ���
				for (int i = 0; i < str.length(); i++) {
					if (i * 3 + 3 > str.length()) {
						newStr += str.substring(i * 3, str.length());
						break;
					}
					newStr += str.substring(i * 3, i * 3 + 3) + ",";
				}
				// ������һ������
				if (newStr.endsWith(",")) {
					newStr = newStr.substring(0, newStr.length() - 1);
				}
				// ���ַ������û���
				System.out.println(new StringBuffer(newStr).reverse().toString());
			}
		}
		cin.close();
	}

}
