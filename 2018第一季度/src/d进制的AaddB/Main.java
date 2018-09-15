package d进制的AaddB;

/**
 * 题目描述
输入两个非负10进制整数A和B(<=230-1)，输出A+B的D (1 < D <= 10)进制数。

输入描述:
输入在一行中依次给出3个整数A、B和D。


输出描述:
输出A+B的D进制数。

输入例子:
123 456 8

输出例子:
1103
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			BigInteger A = in.nextBigInteger();
			BigInteger B = in.nextBigInteger();
			BigInteger change = in.nextBigInteger();

			BigInteger[] rem = new BigInteger[100];

			int i = 0;
			BigInteger temp = A.add(B);
			while (temp.compareTo(BigInteger.ZERO) > 0) {
				i++;
				rem[i] = temp.remainder(change);
				temp = temp.divide(change);
			}

			for (int j = i; j > 0; j--) {
				System.out.print(rem[j]);
			}
		}
		in.close();
	}

}
