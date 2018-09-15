package 数字分类;

/**
 * 题目描述：
 * 
 * 题目描述 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * 
 * A1 = 能被5整除的数字中所有偶数的和；
 * 
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * 
 * A3 = 被5除后余2的数字的个数；
 * 
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * 
 * A5 = 被5除后余4的数字中最大数字。
 * 
 * 输入描述: 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
 * 
 * 输出描述: 对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出“N”。
 * 
 * 输入例子: 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 
 * 输出例子: 30 11 2 9.7 9
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			// 输入n个整数
			int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
			int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
			for (int i = 1; i <= N; i++) {
				int n = in.nextInt();
				if (n % 5 == 0 && n % 2 == 0) {
					A1 += n;
					count1++;
				} else if (n % 5 == 1) {
					if ((count2 + 2) % 2 == 0) {
						A2 += n;
					} else {
						A2 -= n;
					}
					count2++;
				} else if (n % 5 == 2) {
					A3++;
					count3++;
				} else if (n % 5 == 3) {
					A4 += n;
					count4++;
				} else if (n % 5 == 4) {
					if (n > A5)
						A5 = n;
					count5++;
				}
			}
			// 求平均数A3
			float A4Sum = (float) A4 / (float) count4;
			String aver = String.format("%.1f", A4Sum);
			// 输出A1~A5
			System.out.print(count1 == 0 ? "N" : A1);
			System.out.print(" " + (count2 == 0 ? "N" : A2));
			System.out.print(" " + (count3 == 0 ? "N" : A3));
			System.out.print(" " + (count4 == 0 ? "N" : aver));
			System.out.println(" " + (count5 == 0 ? "N" : A5));
		}
		in.close();

	}

}
