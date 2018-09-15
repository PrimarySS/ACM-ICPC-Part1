package ������;

/**
 * ��Ŀ����
����һ������������д��������ж��ٶ������ĺ͵���������������������������������ֵС��1000��
�磬����Ϊ10, ����Ӧ��������Ϊ2�����������������ĺ�Ϊ10,�ֱ�Ϊ(5,5),(3,7)��
��������:
�������һ������n,(3 �� n < 1000)
�������:
�������
ʾ��1 
����
10
���
2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] PrimeArray = new int[n]; // �洢��Χn�ڵ�����
			int p = -1; // ����ռ��ڴ���˷�
			// ���n��Χ�ڵ���������
			for (int i = 2; i <= n; i++) {
				if (isPrime(i)) {
					p++;
					PrimeArray[p] = i;
				}
			}
			// ��������͵���n������������
			int count = 0;
			for (int i = 0; i <= p; i++) {
				for (int j = i; j <= p; j++) {
					if (PrimeArray[i] + PrimeArray[j] == n) {
						count++;
					}
				}
			}
			// �������������
			System.out.println(count);
		}
		cin.close();
	}

	/**
	 * �ж��Ƿ�Ϊ�����ķ���
	 * 
	 * @param number
	 *            ��Χ�ڵı���
	 */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
