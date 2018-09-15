package 素数对;

/**
 * 题目描述
给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。
如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
输入描述:
输入包括一个整数n,(3 ≤ n < 1000)
输出描述:
输出对数
示例1 
输入
10
输出
2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] PrimeArray = new int[n]; // 存储范围n内的素数
			int p = -1; // 避免空间内存的浪费
			// 获得n范围内的所有素数
			for (int i = 2; i <= n; i++) {
				if (isPrime(i)) {
					p++;
					PrimeArray[p] = i;
				}
			}
			// 获得素数和等于n的所有素数对
			int count = 0;
			for (int i = 0; i <= p; i++) {
				for (int j = i; j <= p; j++) {
					if (PrimeArray[i] + PrimeArray[j] == n) {
						count++;
					}
				}
			}
			// 输出素数对总数
			System.out.println(count);
		}
		cin.close();
	}

	/**
	 * 判断是否为素数的方法
	 * 
	 * @param number
	 *            范围内的变量
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
