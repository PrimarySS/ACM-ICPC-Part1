package 部分A加B;

/**
 * 题目描述
正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。
例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 
 现给定A、DA、B、DB，请编写程序计算PA + PB。

输入描述:
输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 1010。

输出描述:
在一行中输出PA + PB的值。

输入例子:
3862767 6 13530293 3

输出例子:
399
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int A = in.nextInt();
			int Da = in.nextInt();
			int B = in.nextInt();
			int Db = in.nextInt();

			System.out.println((P(A, Da) + P(B, Db)));
		}
		in.close();
	}

	private static int P(int a, int da) {
		StringBuilder builder = new StringBuilder();
		String str = String.valueOf(a); 

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - '0' == da) {
				builder.append(da);
			}
		}
		int p = Integer.parseInt(builder.toString());
		return p;
	}

}
