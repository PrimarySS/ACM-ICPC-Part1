package 奇偶分家;

/**
 * 输入格式： 
输入第一行给出一个正整N（<= 1000）；第2行给出N个正整数，以空格分隔。 
输出格式： 
在一行中先后输出奇数的个数、偶数的个数。中间以1个空格分隔。 
输入样例：
9
88 74 101 26 15 0 34 22 77
输出样例：
3 6
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int jishu = 0, oushu = 0;
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();
				if (num % 2 == 0) {
					oushu++;
				} else {
					jishu++;
				}
			}
			System.out.println(jishu + " " + oushu);
		}
		in.close();
	}
}
