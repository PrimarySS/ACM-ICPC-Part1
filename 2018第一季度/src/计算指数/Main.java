package 计算指数;

/**
 * 输入格式： 
输入在一行中给出一个不超过10的正整数n。 
输出格式： 
在一行中按照格式“2^n = 计算结果”输出2n的值。 
输入样例：
5
输出样例：
2^5 = 32
**/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int sum = 1;
			for (int i = 1; i <= n; i++) {
				sum *= 2;
			}
			System.out.println("2^" + n + " = " + sum);
		}
		in.close();

	}

}
