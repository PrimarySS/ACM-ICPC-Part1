package ����׳˺�;

/**
 *��Ŀ������
 *
 * ���ڸ�����������N����Ҫ����� S = 1! + 2! + 3! + ... + N!��
�����ʽ�� 
������һ���и���һ��������10��������N�� 
�����ʽ�� 
��һ�������S��ֵ��
����������
3
���������
9
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			// ��׳˵ĺ�
			int finSum = 0;
			for (int j = 1; j <= n; j++) {
				finSum += mutiply(j);
			}
			System.out.println(finSum);
		}
		in.close();
	}

	/**
	 * ���ܣ���׳�
	 * 
	 * @param j
	 *            ����׳˲���
	 * @return ���ؽ׳˵�ֵ
	 */
	private static int mutiply(int j) {
		int sum = 1;
		for (int i = 1; i <= j; i++) {
			sum *= i;
		}
		return sum;
	}

}
