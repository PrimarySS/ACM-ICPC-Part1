package ��ż�ּ�;

/**
 * �����ʽ�� 
�����һ�и���һ������N��<= 1000������2�и���N�����������Կո�ָ��� 
�����ʽ�� 
��һ�����Ⱥ���������ĸ�����ż���ĸ������м���1���ո�ָ��� 
����������
9
88 74 101 26 15 0 34 22 77
���������
3 6
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int jishu = 0, oushu = 0;
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();
				if (num % 2 == 0) {
					oushu++;
				} else {
					jishu++;
				}
			}
			System.out.println(jishu + " " + oushu);
		}
		in.close();
	}
}
