package �ڰ׿�Ƭ;

/**
 * �}Ŀ������
 * ţţ��n�ſ�Ƭ�ų�һ������.ÿ�ſ�Ƭһ���Ǻ�ɫ��,��һ���ǰ�ɫ�ġ���ʼ״̬��ʱ����Щ��Ƭ�Ǻ�ɫ����,��Щ��Ƭ�ǰ�ɫ���ϡ�
 * ţţ������Ҫ��һЩ��Ƭ������,�õ�һ�ֽ������е���ʽ,��ÿ�����ڿ�Ƭ����ɫ���ǲ�һ���ġ�
 * ţţ��֪��������Ҫ��ת�����ſ�Ƭ���Ա�ɽ������е���ʽ�� 
��������:
�������һ���ַ���S,�ַ�������length(3 �� length �� 50),����ֻ����'W'��'B'�����ַ���,�ֱ��ʾ��ɫ�ͺ�ɫ�������ַ�����ʾ��Ƭ���еĳ�ʼ״̬��

�������:
���һ������,��ʾţţ�����Ҫ��ת�Ĵ�����

��������1:
BBBW

�������1:
1
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			int count1 = 0;
			// ��ʼ���ַ���B��ͳ����Ҫ��ת�Ĵ���
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (i % 2 == 0 && c != 'B') {
					count1++;
				} else if (i % 2 != 0 && c != 'W') {
					count1++;
				}
			}
			// ��ʼ���ַ���W��ͳ�Ʒ�ת�Ĵ���
			int count2 = 0;
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (i % 2 == 0 && c != 'W') {
					count2++;
				} else if (i % 2 != 0 && c != 'B') {
					count2++;
				}
			}
			System.out.println(count1 >= count2 ? count2 : count1);

		}
		in.close();
	}

}
