package fibonacci����;

/*
 * Fibonacci��������������ģ�
F[0] = 0
F[1] = 1
for each i �� 2: F[i] = F[i-1] + F[i-2]
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...����Fibonacci�����е������ǳ�ΪFibonacci����
����һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ�
���Ա�ΪFibonacci����

��������:
����Ϊһ��������N(1 �� N �� 1,000,000)

�������:
���һ����С�Ĳ�����ΪFibonacci��"

ʾ��1 
����
15
���
2

������
	쳲��������У��ֳƻƽ�ָ����У�ָ��������һ�����У�1��1��2��3��5��8��13��21����������ѧ�ϣ�
	쳲��������������±��Եݹ�ķ������壺F[0]=0��F[1]=1��F[n]=F[n-1]+F[n-2]��n>=2��n��N*����

	1.�ݹ���(N + 1)��Fibonacci��.
	2.���� (X - 1) ���� (X + 1) ��� N �� (N + 1) ��Fibonacci���������С����֮��Ĳ���
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			long n = cin.nextInt(); // ����N

			long Min1 = 1000000;
			long Min2 = 1000000;
			long min = 0;
			for (long i = 0; i <= n; i++) {
				// ��õ�i��Fibonacci��
				long sum = fibonacci_iteration(i);

				// N��ΪFibonacci���Ĳ���
				if (sum >= n) Min1 = sum - n;
				else Min2 = n - sum;

				if (Min1 > Min2) min = Min2;
				else min = Min1;

				// ����fibonacciList[i] >= nʱ����Min1 > Min2����
				Min1 = min;
				Min2 = min;
			}
			// �����С����
			System.out.println(min);
		}
		cin.close();
	}

	/**
	 * ���ܣ���������쳲�������
	 * 
	 * @param n
	 *            ��n��fibonacci��
	 * @return ����fibonacciֵ
	 */
	private static long fibonacci_iteration(long n) {
		// ����ǰ��Ľ�����ټ������
		long result; // F[n]
		long previous_result; // F[n-1]
		long next_older_result; // F[n-2]

		if (n == 0) {
			return 0;
		} else {
			result = previous_result = 1;

			while (n > 2) {
				n -= 1;
				// ����F[n-2]
				next_older_result = previous_result;
				// ����F[n-1]
				previous_result = result;
				// F[n] = F[n-1] + F[n-2]
				result = previous_result + next_older_result;
			}
			return result;
		}
	}

	/**
	 * ���ܣ��ݹ����쳲�������
	 * 
	 * @param n
	 *            ��n��fibonacci��
	 * @return ����fibonacciֵ
	 */
	// private static int fibonacci(int n) {
	// // ���Ƿ�Χ[0,2]��[3,n]
	// if (n <= 2) {
	// if (n == 0)
	// return 0;
	// else
	// return 1;
	// } else {
	// return fibonacci(n - 1) + fibonacci(n - 2);
	// }
	// }

}
