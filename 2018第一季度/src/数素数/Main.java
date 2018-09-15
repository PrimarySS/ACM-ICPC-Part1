package ������;

/**
 * ��Ŀ����
��Pi��ʾ��i�����������θ�����������M <= N <= 10000�������PM��PN������������

��������:
������һ���и���M��N������Կո�ָ���

�������:
�����PM��PN������������ÿ10������ռ1�У�����Կո�ָ�������ĩ�����ж���ո�

��������:
5 27

�������:
11 13 17 19 23 29 31 37 41 43
47 53 59 61 67 71 73 79 83 89
97 101 103
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int M = in.nextInt();
			int N = in.nextInt();
			int[] primeArr = new int[N - M + 1];
			int count = 0;
			int i = 0;
			// ��õ�M����N������
			for (int j = 2;; j++) {
				if (i == (N - M) + 1) {
					break;
				} else {
					if (prime(j)) {
						count++;
						if (count >= M) {
							primeArr[i] = j;
							i++;
						}
					}
				}
			}
			// �������
			int k = 1;
			for (int j = 0; j < i; j++) {
				if (k % 10 == 0) {
					System.out.println(primeArr[j]);
				} else if (j == i - 1) {
					System.out.print(primeArr[j]);
				} else {
					System.out.print(primeArr[j] + " ");
				}
				k++;
			}
		}
		in.close();
	}
	/**
	 * ���ܣ��ж��Ƿ�Ϊ����
	 * 
	 * @param ���жϵĲ���
	 * @return ����booleanֵ
	 */
	private static boolean prime(int j) {
		for (int i = 2; i <= j / 2; i++) {
			if (j % i == 0)
				return false;
		}
		return true;
	}

}
