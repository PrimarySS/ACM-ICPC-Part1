package 解救小易;

/**
 * 题目描述
有一片1000*1000的草地，小易初始站在(1,1)(最左上角的位置)。小易在每一秒会横向或者纵向移动到相邻的草地上吃草(小易不会走出边界)。
大反派超超想去捕捉可爱的小易，他手里有n个陷阱。第i个陷阱被安置在横坐标为xi ，纵坐标为yi 的位置上，小易一旦走入一个陷阱，
将会被超超捕捉。你为了去解救小易，需要知道小易最少多少秒可能会走入一个陷阱，从而提前解救小易。

输入描述:
第一行为一个整数n(n ≤ 1000)，表示超超一共拥有n个陷阱。
第二行有n个整数xi，表示第i个陷阱的横坐标
第三行有n个整数yi，表示第i个陷阱的纵坐标
保证坐标都在草地范围内。

输出描述:
输出一个整数,表示小易最少可能多少秒就落入超超的陷阱

示例1 
输入
3
4 6 8
1 2 1
输出
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // 陷阱的个数

			// 存储陷阱坐标的数组
			int[] x = new int[n];
			int[] y = new int[n];

			// 存储陷阱横坐标
			for (int i = 0; i < x.length; i++) {
				x[i] = cin.nextInt();
			}

			// 存储陷阱纵坐标
			for (int i = 0; i < y.length; i++) {
				y[i] = cin.nextInt();
			}

			// 获得小易到所有陷阱的网格距离
			int[] path = new int[n];
			for (int i = 0; i < n; i++) {
				path[i] = (x[i] - 1) + (y[i] - 1);
			}

			// 获得小易到陷阱的最小路径
			int minPath = path[0];
			for (int i = 1; i < path.length; i++) {
				if (path[i] < minPath) {
					minPath = path[i];
				}
			}

			System.out.println(minPath);

		}
		cin.close();
	}
}
