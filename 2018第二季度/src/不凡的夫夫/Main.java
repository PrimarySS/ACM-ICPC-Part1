package 不凡的夫夫;

/**
 * 题目描述  
夫夫有一天对一个数有多少位数感兴趣，但是他又不想跟凡夫俗子一样，
所以他想知道给一个整数n，求n！的在8进制下的位数是多少位。
输入描述:
第一行是一个整数t(0<t<=1000000)(表示t组数据)
接下来t行，每一行有一个整数n(0<=n<=10000000)
输出描述:
输出n！在8进制下的位数。
示例1 
输入
3
4
2
5
输出
2
1
3
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // 输入多少组数

			BigInteger N = BigInteger.valueOf(n);

			// 输入n个数
			BigInteger[] a = new BigInteger[n];
			for (BigInteger i = BigInteger.ZERO; i.compareTo(N) < 0; i = i.add(BigInteger.ONE)) {
				a[i.intValue()] = cin.nextBigInteger();
			}

			for (int i = 0; i < a.length; i++) {
				// 求每个数的阶乘
				BigInteger s = multiply(a[i]);
				// 求每个数阶乘的八进制位数
				System.out.println(OCTNum(s));
			}
		}
		cin.close();
	}

	/**
	 * 功能：求阶乘
	 * 
	 * @param a
	 *            求阶乘的参数
	 * @return 返回阶乘的积
	 */
	private static BigInteger multiply(BigInteger a) {
		BigInteger sum = BigInteger.ONE;
		for (BigInteger j = BigInteger.ONE; j.compareTo(a) <= 0; j = j.add(BigInteger.ONE)) {
			sum = sum.multiply(j);
		}
		return sum;
	}

	/**
	 * 功能:求进制的位数
	 * 
	 * @param s
	 *            参数
	 * @return s的 8进制的位数
	 */
	private static int OCTNum(BigInteger s) {
		BigInteger temp = s;
		int count = 0;
		while (temp.compareTo(BigInteger.ZERO) > 0) {
			count++;
			temp = temp.divide(BigInteger.TEN.subtract(BigInteger.ONE).subtract(BigInteger.ONE));
		}
		return count;
	}
}
