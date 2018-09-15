package 四平方和;
/**
 * 四平方和

四平方和定理，又称为拉格朗日定理：
每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。

比如：
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
（^符号表示乘方的意思）

对于一个给定的正整数，可能存在多种平方和的表示法。
要求你对4个数排序：
0 <= a <= b <= c <= d
并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法

程序输入为一个正整数N (N<5000000)
要求输出4个非负整数，按从小到大排序，中间用空格分开

例如，输入：
5
则程序应该输出：
0 0 1 2

再例如，输入：
12
则程序应该输出：
0 2 2 2

再例如，输入：
773535
则程序应该输出：
1 1 267 838

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 3000ms
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt(); // 最终得数

			// 计算平方和为最终得数的A，B，C，D
			for (int A = 0; A < n; A++) {
				for (int B = 0; B < n; B++) {
					for (int C = 0; C < n; C++) {
						for (int D = 0; D < n; D++) {
							// 当平方和等于正整数
							if (A * A + B * B + C * C + D * D == n) {
								// 排序要求0 <= a <= b <= c <= d
								if (A >= 0 && B >= A && C >= B && D >= C) {
									System.out.println(A + " " + B + " " + C + " " + D);
								}
								break;
							}
						}
					}
				}
			}
		}
		in.close();
	}

}