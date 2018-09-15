package ab之和与C;

/**
 * 题目描述
给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。

输入描述:
输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。


输出描述:
对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。

输入例子:
4

1 2 3

2 3 4

2147483647 0 2147483646

0 -2147483648 -2147483647

输出例子:
Case #1: false

Case #2: true

Case #3: true

Case #4: false
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			int[] a = new int[n];
			// 输入n组三个整数
			int i = 0;
			while (n > 0) {
				// 输入A，B，C
				BigInteger A = in.nextBigInteger();
				BigInteger B = in.nextBigInteger();
				BigInteger C = in.nextBigInteger();
				// 判断A+B==C
				if (A.add(B).compareTo(C) > 0) {
					a[i] = 1;
				} else {
					a[i] = 0;
				}
				i++;
				n--;
			}
			// 输出结果
			for (int j = 0; j < a.length; j++) {
				if (a[j] == 1) {
					System.out.println("Case #" + (j + 1) + ": true");
				} else {
					System.out.println("Case #" + (j + 1) + ": false");
				}
			}

		}
		in.close();
	}

}
