package ��ª���ַ���;

/**
 * ��Ŀ������
 * ţţϲ���ַ���,�����������ª���ַ���������ţţ��˵,һ���ַ����ĳ�ªֵ���ַ�������ͬ�����ַ��Եĸ�����
 * �����ַ�����ABABAABBB���ĳ�ªֵ��3,��Ϊ��һ��"AA"�������ص���"BB"�����ڸ���һ���ַ���,
 * �ַ����а����ַ�'A'��'B'��'?'��ţţ���ڿ��԰��ַ����е��ʺŸ�Ϊ'A'����'B'��
 * ţţ���������ַ����ĳ�ªֵ��С,ϣ�����ܰ������ 
 * 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();
			int count = 0;

			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				// ������ַ����ʼ�������ġ������ţ�����Կ϶�������ڳ�ªֵ
				if (i == 0) {
					while (i < ch.length && ch[i] == '?') {
						i++;
					}
				} else {
					// �����ǰֵ�ǡ������ţ������õ�ǰֵΪ��ǰһ��ֵ��ͬ����һ��ֵ��
					if (ch[i] == '?') {
						if (ch[i - 1] == 'A') {
							ch[i] = 'B';
						} else {
							ch[i] = 'A';
						}
					} else if (ch[i] == ch[i - 1]) {
						// �����ǰֵ��ǰһ��ֵ��ͬ����¼������ֵΪ��ªֵ
						count++;
					}
				}
			}
			System.out.println(count);
		}
		in.close();
	}

}
