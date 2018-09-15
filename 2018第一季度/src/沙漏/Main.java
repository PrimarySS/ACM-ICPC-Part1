package 沙漏;

/**
 * 本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
*****
 ***
  *
 ***
*****
所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。
给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
输入格式： 
输入在一行给出1个正整数N（<=1000）和一个符号，中间以空格分隔。 
输出格式： 
首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。 
输入样例：
19 *
输出样例：
*****
 ***
  *
 ***
*****
2
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			String ch = in.nextLine();

			int rem = 0;
			for (int i = 1; i <= n; i++) {
				int Sn = 2 * i * i - 1; // 从内往外，第i层时用的总符号数
				rem = n - Sn; // i层后所剩字符
				// 如果剩下的符号不足够继续向外延伸一层，结束循环
				if (rem < 4 * i + 2) {
					break;
				}
			}
			int k = (int) Math.sqrt((n - rem + 1) / 2);
			// 输出上半部分
			for (int i = k; i >= 1; i--) {
				int p = 1;
				// 输出空格当差值
				while (p <= k - i) {
					System.out.print(" ");
					p++;
				}
				// 输出字符
				int j = 1;
				while (j <= 2 * i - 1) {
					System.out.print(ch.substring(1));
					j++;
				}
				System.out.println();
			}
			// 输出下半部分
			for (int i = 2; i <= k; i++) {
				// 输出空格当差值
				int p = 1;
				while (p <= k - i) {
					System.out.print(" ");
					p++;
				}
				// 输出字符
				int j = 1;
				while (j <= 2 * i - 1) {
					System.out.print(ch.substring(1));
					j++;
				}
				System.out.println();
			}
			System.out.println(rem);
		}
		in.close();
	}

}
