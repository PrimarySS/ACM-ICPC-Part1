package ����ָ��;

/**
 * �����ʽ�� 
������һ���и���һ��������10��������n�� 
�����ʽ�� 
��һ���а��ո�ʽ��2^n = �����������2n��ֵ�� 
����������
5
���������
2^5 = 32
**/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int sum = 1;
			for (int i = 1; i <= n; i++) {
				sum *= 2;
			}
			System.out.println("2^" + n + " = " + sum);
		}
		in.close();

	}

}
