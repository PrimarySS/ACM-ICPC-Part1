package �ַ�������;

/**
 * ��Ŀ����  
��һ���ַ��� �����ҵ�����ַ��� S ������Ӵ�T ����Ӵ� T �������㼴ʹ�������ǰ׺ Ҳ�����
���ĺ�׺ ���� ���ַ�����Ҳ���ֹ�һ�ε�(��ʾ Ҫ������ǰ��׺��ͬʱҲҪ���ַ����г���һ�� ֻ��ǰ��׺�ɲ��� ��������Ҫ���ַ���)
��������:
����һ���ַ��� ���� 1 �� 1e6  ȫ����Сд��ĸ
�������:
����ҵĵ����������Ӵ�T ������о���� Just a legend
ʾ��1 
����
fixprefixsuffix
���
fix
ʾ��2 
����
abcdabc
���
Just a legend
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.next();
			int length = str.length();
			String restr = "Just a legend";

			for (int i = 1; i <= length - 2; i++) {
				String pre = str.substring(0, i);
				String suf = str.substring(length - i);
				String mid = str.substring(1, length - 1);

				if (pre.equals(suf) && mid.contains(pre)) {
					restr = pre;
				}
			}
			System.out.print(restr);
		}
		in.close();
	}
}