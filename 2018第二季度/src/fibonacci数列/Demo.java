package fibonacci数列;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int N = cin.nextInt();
			int a = 0; // f[0]
			int b = 1; // f[1]
			int temp = 0;

			// 找到斐波那契数N小的相邻斐波那契数和大的相邻斐波那契数
			while (b < N) {
				temp = b;
				b = a + b;
				a = temp;
			}

			// 计算N与相邻斐波那契数的距离
			int left = N - a;
			int right = b - N;

			System.out.println(left > right ? right : left);
		}
		cin.close();
	}
}