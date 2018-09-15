package n的阶乘;

/**
 * 题目描述  
给定一个整数N（0≤N≤10000），求取N的阶乘
输入描述:
多个测试数据，每个测试数据输入一个数N
输出描述:
每组用一行输出N的阶乘
示例1 
输入
1
2
3
输出
1
2
6
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			BigInteger N = BigInteger.valueOf(n);
			BigInteger sum = BigInteger.ONE;
			for (BigInteger j = BigInteger.ONE; j.compareTo(N) <= 0; j = j.add(BigInteger.ONE)) {
				sum = sum.multiply(j);
			}

			System.out.println(sum);
		}
		cin.close();
	}
}
