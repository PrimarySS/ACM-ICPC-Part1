package ��ƻ��;

/**
 * ��Ŀ����
С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)�� ����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����������ܹ���ǡ��n��ƻ����С�׽����Ṻ��
��������:
����һ������n����ʾС���빺��n(1 �� n �� 100)��ƻ��
�������:
���һ��������ʾ������Ҫ����Ĵ��������������ǡ��n��ƻ�������-1
ʾ��1 
����
20
���
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // ��Ҫ���ƻ����

			// ������ǡ��n��ƻ�������-1
			if (n >= 1 && n <= 11) {
				if (n == 6 || n == 8) {
					System.out.println(1);
				} else {
					System.out.println(-1);
				}
			} else {
				// [12,100]�������ܹ���
				if (n % 2 != 0) {
					System.out.println(-1);
				} else {
					// ż����������ܹ������������
					// 6 * x + 8 * y = n
					boolean flag = false;
					for (int x = 0; x <= 15; x++) {
						for (int y = 0; y <= 15; y++) {
							// �ҵ���С��������ѭ��
							if (6 * x + 8 * y == n) {
								System.out.println(x + y);
								flag = true;
								break;
							}
						}
						// ���flag = true�����ҵ���С����������ѭ��
						if (flag) {
							break;
						}
					}
				}
			}
		}
		cin.close();
	}

}
