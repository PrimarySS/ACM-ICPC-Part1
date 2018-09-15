package 数素数;

/**
 * 题目描述
令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。

输入描述:
输入在一行中给出M和N，其间以空格分隔。

输出描述:
输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。

输入例子:
5 27

输出例子:
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
			// 获得第M到第N个素数
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
			// 输出数组
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
	 * 功能：判断是否为素数
	 * 
	 * @param 需判断的参数
	 * @return 返回boolean值
	 */
	private static boolean prime(int j) {
		for (int i = 2; i <= j / 2; i++) {
			if (j % i == 0)
				return false;
		}
		return true;
	}

}
