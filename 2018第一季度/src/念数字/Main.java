package ������;

/**
 * ��Ŀ������
 * 
 * ����һ�����������ÿ�����ֶ�Ӧ��ƴ����������Ϊ����ʱ���������fu���֡�ʮ�����ֶ�Ӧ��ƴ�����£� 
0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu

�����ʽ�� 
������һ���и���һ���������磺 1234 �� 
��ʾ������������������������� 

�����ʽ�� 
��һ����������������Ӧ��ƴ����ÿ�����ֵ�ƴ��֮���ÿո�ֿ�����ĩû�����Ŀո��� yi er san si��

����������
-600
���������
fu liu ling ling
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			char[] ch = str.toCharArray();
			String[] newStr = new String[ch.length];
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '-') {
					newStr[i] = "fu";
				} else if (ch[i] - '0' == 0) {
					newStr[i] = "ling";
				} else if (ch[i] - '0' == 1) {
					newStr[i] = "yi";
				} else if (ch[i] - '0' == 2) {
					newStr[i] = "er";
				} else if (ch[i] - '0' == 3) {
					newStr[i] = "san";
				} else if (ch[i] - '0' == 4) {
					newStr[i] = "si";
				} else if (ch[i] - '0' == 5) {
					newStr[i] = "wu";
				} else if (ch[i] - '0' == 6) {
					newStr[i] = "liu";
				} else if (ch[i] - '0' == 7) {
					newStr[i] = "qi";
				} else if (ch[i] - '0' == 8) {
					newStr[i] = "ba";
				} else if (ch[i] - '0' == 9) {
					newStr[i] = "jiu";
				}
			}
			
			for (int i = 0; i < newStr.length; i++) {
				if (i == newStr.length - 1) {
					System.out.println(newStr[i]);
				} else {
					System.out.print(newStr[i] + " ");
				}
			}
		}
		in.close();

	}

}
