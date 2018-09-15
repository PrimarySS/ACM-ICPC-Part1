package n的倍数;

/**
 * 给出一个数n，求1到n中，有多少个数不是2 5 11 13的倍数。 
输入描述:
本题有多组输入
每行一个数n，1<=n<=10^18.
输出描述:
每行输出输出不是2 5 11 13的倍数的数共有多少。
示例1 
输入
15
输出
4
说明
1 3 7 9
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			BigInteger n = cin.nextBigInteger();

			BigInteger a = BigInteger.ONE.add(BigInteger.ONE); // 2

			BigInteger b = BigInteger.TEN.divide(a); // 5

			BigInteger c = BigInteger.TEN.add(BigInteger.ONE); // 11

			BigInteger d = a.add(c); // 13

			// 不是2 5 11 13的倍数
			BigInteger count = BigInteger.ZERO;

			for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

				if (i.remainder(a) == BigInteger.ZERO || i.remainder(b) == BigInteger.ZERO
						|| i.remainder(c) == BigInteger.ZERO || i.remainder(d) == BigInteger.ZERO) {
					continue;
				} else {
					count = count.add(BigInteger.ONE);
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
