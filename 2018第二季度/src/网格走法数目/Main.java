package 网格走法数目;

/**
 * 题目描述
有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。请设计一个算法，计算小团有多少种走法。
给定两个正整数int x,int y，请返回小团的走法数目。

输入描述:
输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。

输出描述:
输出包括一行，为走法的数目。

示例1 
输入
3 2
输出
10

分析：

	(x * y)的网格中一条路径至少走(x + y)步，路径数目=(x + y)! /(x! * y!)
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int x = cin.nextInt(); // 输入网格的横轴
			int y = cin.nextInt(); // 输入网格的纵轴

			// 规定x,y的范围
			if (x > 10 || x < 1 || y > 10 || y < 1) {
				break;
			}

			// 输出路径总数
			System.out.println(sum(x + y) / (sum(x) * sum(y)));
		}
		cin.close();
	}

	/**
	 * 功能：计算阶乘
	 * 
	 * @param s
	 *            阶乘的范围
	 * @return 返回阶乘的值
	 */
	private static long sum(int s) {
		long sum = 1;
		for (int i = 1; i <= s; i++) {
			sum *= i;
		}
		return sum;
	}
}
