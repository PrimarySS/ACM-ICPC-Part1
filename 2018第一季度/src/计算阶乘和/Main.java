package 计算阶乘和;

/**
 *题目描述：
 *
 * 对于给定的正整数N，需要你计算 S = 1! + 2! + 3! + ... + N!。
输入格式： 
输入在一行中给出一个不超过10的正整数N。 
输出格式： 
在一行中输出S的值。
输入样例：
3
输出样例：
9
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			// 求阶乘的和
			int finSum = 0;
			for (int j = 1; j <= n; j++) {
				finSum += mutiply(j);
			}
			System.out.println(finSum);
		}
		in.close();
	}

	/**
	 * 功能：求阶乘
	 * 
	 * @param j
	 *            所求阶乘参数
	 * @return 返回阶乘的值
	 */
	private static int mutiply(int j) {
		int sum = 1;
		for (int i = 1; i <= j; i++) {
			sum *= i;
		}
		return sum;
	}

}
