package ��ɫ��ש;

/**
 * ţţϲ����ɫ�Ķ���,�����ǲ�ɫ�Ĵ�ש��ţţ�ķ���������L�������δ�ש��
 * ÿ��ש����ɫ�����ֿ���:�졢�̡������ơ�����һ���ַ���S, ���S�ĵ�i���ַ���
 * 'R', 'G', 'B'��'Y',��ô��i���ש����ɫ�ͷֱ��Ǻ졢�̡������߻ơ�
 * 
 * ţţ��������һЩ��ש����ɫ,ʹ�����������ש����ɫ������ͬ�����ţţ������������Ҫ�����Ĵ�ש������ 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			int count = 0;
			for (int i = 1; i < len; i++) {
				if (str.charAt(i) == str.charAt(i - 1)) {
					count++;
					i++;// �ҵ�����������ͬ�ģ��ͽ���������һ��Ȼ��ֱ������������������һ����ʼ�ж�
				}
			}
			System.out.println(count);
		}
		in.close();
	}
}
