package 彩色瓷砖;

/**
 * 牛牛喜欢彩色的东西,尤其是彩色的瓷砖。牛牛的房间内铺有L块正方形瓷砖。
 * 每块砖的颜色有四种可能:红、绿、蓝、黄。给定一个字符串S, 如果S的第i个字符是
 * 'R', 'G', 'B'或'Y',那么第i块瓷砖的颜色就分别是红、绿、蓝或者黄。
 * 
 * 牛牛决定换掉一些瓷砖的颜色,使得相邻两块瓷砖的颜色均不相同。请帮牛牛计算他最少需要换掉的瓷砖数量。 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			int count = 0;
			for (int i = 1; i < len; i++) {
				if (str.charAt(i) == str.charAt(i - 1)) {
					count++;
					i++;// 找到相邻两个相同的，就将计数器加一，然后直接跳过这两个，从下一个开始判断
				}
			}
			System.out.println(count);
		}
		in.close();
	}
}
