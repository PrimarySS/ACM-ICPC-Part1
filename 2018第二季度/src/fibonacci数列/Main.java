package fibonacci数列;

/*
 * Fibonacci数列是这样定义的：
F[0] = 0
F[1] = 1
for each i ≥ 2: F[i] = F[i-1] + F[i-2]
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步
可以变为Fibonacci数。

输入描述:
输入为一个正整数N(1 ≤ N ≤ 1,000,000)

输出描述:
输出一个最小的步数变为Fibonacci数"

示例1 
输入
15
输出
2

分析：
	斐波纳契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……在数学上，
	斐波纳契数列以如下被以递归的方法定义：F[0]=0，F[1]=1，F[n]=F[n-1]+F[n-2]（n>=2，n∈N*）。

	1.递归获得(N + 1)个Fibonacci数.
	2.利用 (X - 1) 或者 (X + 1) 算出 N 与 (N + 1) 个Fibonacci数里相距最小的数之间的步数
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			long n = cin.nextInt(); // 输入N

			long Min1 = 1000000;
			long Min2 = 1000000;
			long min = 0;
			for (long i = 0; i <= n; i++) {
				// 获得第i个Fibonacci数
				long sum = fibonacci_iteration(i);

				// N变为Fibonacci数的步数
				if (sum >= n) Min1 = sum - n;
				else Min2 = n - sum;

				if (Min1 > Min2) min = Min2;
				else min = Min1;

				// 避免fibonacciList[i] >= n时干扰Min1 > Min2条件
				Min1 = min;
				Min2 = min;
			}
			// 输出最小步数
			System.out.println(min);
		}
		cin.close();
	}

	/**
	 * 功能：迭代计算斐波那契数
	 * 
	 * @param n
	 *            第n个fibonacci数
	 * @return 返回fibonacci值
	 */
	private static long fibonacci_iteration(long n) {
		// 保存前面的结果减少计算次数
		long result; // F[n]
		long previous_result; // F[n-1]
		long next_older_result; // F[n-2]

		if (n == 0) {
			return 0;
		} else {
			result = previous_result = 1;

			while (n > 2) {
				n -= 1;
				// 保存F[n-2]
				next_older_result = previous_result;
				// 保存F[n-1]
				previous_result = result;
				// F[n] = F[n-1] + F[n-2]
				result = previous_result + next_older_result;
			}
			return result;
		}
	}

	/**
	 * 功能：递归计算斐波那契数
	 * 
	 * @param n
	 *            第n个fibonacci数
	 * @return 返回fibonacci值
	 */
	// private static int fibonacci(int n) {
	// // 考虑范围[0,2]，[3,n]
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
