package ������;

/**
 * ��Ŀ����  
��һ�������У����һ������ǰ��λ�����С˳���෴����ǰ��������ں����������ô���Ǿͳ�Ϊһ������
һ������������������ͳ�Ϊ������е�������������һ������Ϊ4 5 1 3 2�� ��ô������е�������Ϊ7��
����Էֱ�Ϊ(4, 1), (4, 3), (4, 2), (5, 1), (5, 3), (5, 2),(3, 2)��

��������:
��һ����һ������n(1 <= n <= 100000),  Ȼ��ڶ��и���n�����������ڵ�i����a[i]��(0 <= a[i] <= 100000)��
�������:
�����������е�������

ʾ��1 
����
5
4 5 1 3 2
���
7
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = cin.nextInt();
			}

			int count = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		cin.close();
	}

}
