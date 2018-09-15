package 优雅的点;

/**
 * 题目描述
小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，
小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
例如：半径的平方如果为25
优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
输入描述:
输入为一个整数，即为圆半径的平方,范围在32位int范围内。
输出描述:
输出为一个整数，即为优雅的点的个数
示例1 
输入
25
输出
12
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {

			int R = cin.nextInt(); // 半径的平方
			int r = (int) Math.sqrt(R); // 获得半径

			// 获得优雅点
			int count = 0;
			for (int X = 0; X <= r; X++) {
				int Y = (int) Math.sqrt(R - X * X);
				if (X * X + Y * Y == R) {
					if (X == 0 || Y == 0) {
						count += 2; // 只有 r 与 -r 的情况
					} else {
						count += 4; // 因为圆点为0，考虑x，y的正负
					}
				}
			}
			// 输出优雅点个数
			System.out.println(count);
		}
		cin.close();
	}

}
