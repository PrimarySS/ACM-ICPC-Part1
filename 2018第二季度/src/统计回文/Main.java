package ͳ�ƻ���;

/**
 * ��Ŀ����
�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ��������ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ���
���յ�ʱ�����õ���������ֱ����ַ���A���ַ���B���������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ���
����ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ�������ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��

���磺
A = ��aba����B = ��b����������4�ְ�B����A�İ취��
* ��A�ĵ�һ����ĸ֮ǰ: "baba" ���ǻ��� 
* �ڵ�һ����ĸ��a��֮��: "abba" �ǻ��� 
* ����ĸ��b��֮��: "abba" �ǻ��� 
* �ڵڶ�����ĸ'a'֮�� "abab" ���ǻ��� 
�������������Ĵ�Ϊ2

��������:
ÿ���������ݹ����С�
��һ��Ϊ�ַ���A
�ڶ���Ϊ�ַ���B
�ַ������Ⱦ�С��100��ֻ����Сд��ĸ

�������:
���һ�����֣���ʾ���ַ���B�����ַ���A֮�󹹳�һ�����Ĵ��ķ�����
ʾ��1 
����
aba
b
���
2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // �����һ���ַ���
			String ss = cin.nextLine(); // �����һ���ַ���
			int count = 0; // �洢�����ַ�����
			// �����ײ�
			String HeadStrstr = ss + s;
			// �����ַ���
			String NewHeadStr = new StringBuffer(HeadStrstr).reverse().toString(); 
			// �ж��Ƿ�Ϊ�����ַ���
			if (NewHeadStr.equals(HeadStrstr)) {
				count++;
			}
			// ��ss���뵽s�е����п���,���ж�ÿ�ֿ����Ƿ���ڻ������
			for (int j = 0; j < s.length(); j++) {
				// ��ss���뵽s��
				String str = s.substring(0, j + 1) + ss + s.substring(j + 1, s.length());
				// �����ַ���
				String NewStr = new StringBuffer(str).reverse().toString();
				// �ж��Ƿ�Ϊ�����ַ���
				if (NewStr.equals(str)) {
					count++;
				}
			}
			// ��������ַ����Ļ��Ĵ���
			System.out.println(count);
		}
		cin.close();
	}
}
