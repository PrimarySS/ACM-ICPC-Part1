package ż��;

/**
 * ���һ���ַ�����������ͬ�ַ������Ӷ���,�ͳ�����ַ�����ż��������"xyzxyz"��"aaaaaa"��ż��,����"ababab"��"xyzxy"ȴ���ǡ�
ţţ���ڸ���һ��ֻ����Сд��ĸ��ż��s,����Դ��ַ���s��ĩβɾ��1�ͻ��߶���ַ�,��֤ɾ��֮����ַ�������һ��ż��,ţţ��֪��ɾ��֮��õ��ż�������Ƕ��١� 
��������:
�������һ���ַ���s,�ַ�������length(2 �� length �� 200),��֤s��һ��ż������Сд��ĸ����

�������:
���һ������,��ʾɾ��֮���ܵõ����ż�������Ƕ��١���֤���������з����

��������1:
abaababa                    

�������1:
6
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();
			int len = str.length();

			if (len == 1) {
				System.out.println(0);
			} else if (len == 2) {
				System.out.println(1);
			} else {
				while (len > 0) {
					int i = 2;
					String str1 = str.substring(0, (len - i) / 2);
					String str2 = str.substring((len - i) / 2, len - i);
					if (str1.equals(str2)) {
						System.out.println(len - 2);
						break;
					}
					len -= 2;
				}
			}
		}
		in.close();
	}
}