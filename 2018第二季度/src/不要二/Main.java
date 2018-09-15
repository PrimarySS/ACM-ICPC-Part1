package 不要二;

/**
 * 题目描述
二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，
任意两块蛋糕的欧几里得距离不能等于2。

对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。

输入描述:
每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)

输出描述:
输出一个最多可以放的蛋糕数

示例1 
输入
3 2
输出
4
 * 
 * 分整除4，整除2，奇数等几种情况讨论即可。蛋糕位置就是间隔每个2*2的正方形的区域。 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int width = cin.nextInt(); // 网格宽度
			int hight = cin.nextInt(); // 网格高度
			System.out.println(dealSum(width, hight)); // 最多可以放的蛋糕数
		}
		cin.close();
	}

	/**
	 * 功能： 计算最多可以放的蛋糕数
	 * 
	 * @param width
	 *            网格的宽度
	 * @param hight
	 *            网格的高度
	 * @return 返回可以放的蛋糕数
	 */
	private static int dealSum(int width, int hight) {
		int n = 0;
		if (width % 4 == 0 || hight % 4 == 0) {
			n = (width * hight) / 2; // 如果能整除4 那么蛋糕个数为网格个数的一半
		} else {
			n = (width * hight) / 2 + 1;// 为网格个数的一半 + 1
		}
		return n;
	}
}
