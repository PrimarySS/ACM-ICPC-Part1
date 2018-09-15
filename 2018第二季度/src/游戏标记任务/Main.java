package 游戏标记任务;

/**
 * 题目描述
游戏里面有很多各式各样的任务，其中有一种任务玩家只能做一次，这类任务一共有1024个，任务ID范围[1,1024]。
请用32个unsigned int类型来记录着1024个任务是否已经完成。初始状态都是未完成。 输入两个参数，都是任务ID，
需要设置第一个ID的任务为已经完成；并检查第二个ID的任务是否已经完成。 输出一个参数，如果第二个ID的任务已经完成输出1，
如果未完成输出0。如果第一或第二个ID不在[1,1024]范围，则输出-1。

输入描述:
输入包括一行,两个整数表示人物ID.

输出描述:
输出是否完成

示例1 
输入
1024 1024
输出
1
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		// 任务标记处理
		int[] a = new int[1025];
		// 初始化数组
		for (int i = 1; i < a.length; i++) {
			a[i] = -1;
		}

		while (cin.hasNext()) {
			int m = cin.nextInt(); // 输入第一个整数
			int n = cin.nextInt(); // 输入第二个整数

			// 超出范围处理
			if (m > 1024 || m < 1 || n > 1024 || n < 1) {
				System.out.println(-1);
			} else {
				// 检查标记任务情况
				// 第一个数不存在就添加标记
				if (a[m] != 1) {
					a[m] = 1;
				}
				// 第二个数已标记就输出1，否则标记并输出0
				if (a[n] == 1) {
					System.out.println(1);
				} else {
					a[n] = 1;
					System.out.println(0);
				}
			}
		}
		cin.close();
	}
}
