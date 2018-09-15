package 黑白卡片;

/**
 * 題目描述：
 * 牛牛有n张卡片排成一个序列.每张卡片一面是黑色的,另一面是白色的。初始状态的时候有些卡片是黑色朝上,有些卡片是白色朝上。
 * 牛牛现在想要把一些卡片翻过来,得到一种交替排列的形式,即每对相邻卡片的颜色都是不一样的。
 * 牛牛想知道最少需要翻转多少张卡片可以变成交替排列的形式。 
输入描述:
输入包括一个字符串S,字符串长度length(3 ≤ length ≤ 50),其中只包含'W'和'B'两种字符串,分别表示白色和黑色。整个字符串表示卡片序列的初始状态。

输出描述:
输出一个整数,表示牛牛最多需要翻转的次数。

输入例子1:
BBBW

输出例子1:
1
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			int count1 = 0;
			// 开始的字符是B，统计需要反转的次数
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (i % 2 == 0 && c != 'B') {
					count1++;
				} else if (i % 2 != 0 && c != 'W') {
					count1++;
				}
			}
			// 开始的字符是W，统计反转的次数
			int count2 = 0;
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (i % 2 == 0 && c != 'W') {
					count2++;
				} else if (i % 2 != 0 && c != 'B') {
					count2++;
				}
			}
			System.out.println(count1 >= count2 ? count2 : count1);

		}
		in.close();
	}

}
