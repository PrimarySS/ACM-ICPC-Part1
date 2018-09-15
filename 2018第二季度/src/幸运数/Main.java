package 幸运数;

/*
 * 题目描述
小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知道，在日常生活中我们最常用的是十进制数，
而在计算机中，二进制数也很常用。现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个
数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。
如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，
他把这种数称为幸运数，现在他想知道，小于等于n的幸运数有多少个？

输入描述:
每组数据输入一个数n(n<=100000)

输出描述:
每组数据输出一行，小于等于n的幸运数个数。

示例1 
输入
21
输出
3
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			// 获得在[1,n]范围的幸运数
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (DECSum(i) == BINSum(i)) {
					count++;
				}
			}
			// 输出幸运数的个数
			System.out.println(count);
		}
		cin.close();

	}

	/**
	 * 功能： 计算十进制各个数位上的数字之和
	 * 
	 * @param i
	 *            当前参数
	 * 
	 * @return 返回各个数位上的数字之和
	 */
	private static int DECSum(int i) {
		int temp = i; // 避免变量的变化影响n
		int rem = 0; // 每次求余的值
		int sum = 0; // 所有求余之和
		while (temp > 0) {
			rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		return sum;
	}

	/**
	 * 功能： 计算二进制各个数位上的数字之和
	 * 
	 * @param i
	 *            当前参数
	 * @return 返回各个数位上的数字之和
	 */
	private static int BINSum(int i) {
		int temp = i; // 避免变量的变化影响n
		int rem = 0; // 每次求余的值
		int sum = 0; // 所有求余之和
		while (temp > 0) {
			rem = temp % 2;
			sum += rem;
			temp /= 2;
		}
		return sum;
	}

}
