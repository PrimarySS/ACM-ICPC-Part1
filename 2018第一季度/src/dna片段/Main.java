package dnaƬ��;

/**
 * ţţ��������й�����������һ���ַ�������s,ţţ��Ҫ�������й����ߴ����ҳ����DNA���С�DNA����ָ����������ֻ����'A','T','C','G'��ţţ�����������̫����,�Ͱ����⽻�����������
����: s = "ABCBOATER"�а������DNAƬ����"AT",������ĳ�����2�� 
��������:
�������һ���ַ���s,�ַ�������length(1 �� length �� 50),�ַ�����ֻ������д��ĸ('A'~'Z')��

�������:
���һ������,��ʾ���DNAƬ��

��������1:
ABCBOATER

�������1:
2
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			if (str.contains("A") || str.contains("T") || str.contains("C") || str.contains("G")) {
				int len = 1;
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == 'A' || str.charAt(i) == 'T' || str.charAt(i) == 'C' || str.charAt(i) == 'G') {
						count++;
						if (i == str.length() - 1 && count > len) {
							len = count;
						}
					} else {
						if (count > len) {
							len = count;
						}
						count = 0;
					}
				}
				System.out.println(len);

			} else {
				System.out.println(0);
			}
		}
		in.close();
	}

}
