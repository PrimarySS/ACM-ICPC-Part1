package 高精度阶乘;

/**
 * 题目描述
用高精度计算出S=1！+2！+3！+…+n！(n≤50)
其中“！”表示阶乘，例如：5！=5*4*3*2*1。

输入输出格式
输入格式：
一个正整数N。

输出格式：
一个正整数S，表示计算结果。

输入输出样例
输入样例#1： 复制 
3
输出样例#1： 复制 
9
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			BigDecimal n = cin.nextBigDecimal(); // 输入阶乘
			BigDecimal sumOfFactorial = BigDecimal.ZERO; // 阶乘总和
			// 调用函数计算小阶乘的和，再计算每个小阶乘的总和
			for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
				sumOfFactorial = sumOfFactorial.add(factorial(i));
			}
			System.out.println(sumOfFactorial);
		}
		cin.close();
	}

	/**
	 * 功能：计算高精度阶乘之和
	 * 
	 * @param i
	 *            所求阶乘
	 * @return 返回阶乘之和
	 */
	private static BigDecimal factorial(BigDecimal i) {
		BigDecimal sum = BigDecimal.ONE;
		for (BigDecimal j = BigDecimal.ONE; j.compareTo(i) <= 0; j = j.add(BigDecimal.ONE)) {
			sum = sum.multiply(j);
		}
		return sum;
	}

}
