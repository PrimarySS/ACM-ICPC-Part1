package dna片段;

/**
 * 牛牛从生物科研工作者那里获得一段字符串数据s,牛牛需要帮助科研工作者从中找出最长的DNA序列。DNA序列指的是序列中只包括'A','T','C','G'。牛牛觉得这个问题太简单了,就把问题交给你来解决。
例如: s = "ABCBOATER"中包含最长的DNA片段是"AT",所以最长的长度是2。 
输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 50),字符串中只包括大写字母('A'~'Z')。

输出描述:
输出一个整数,表示最长的DNA片段

输入例子1:
ABCBOATER

输出例子1:
2
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			if (str.contains("A") || str.contains("T") || str.contains("C") || str.contains("G")) {
				int len = 1;
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == 'A' || str.charAt(i) == 'T' || str.charAt(i) == 'C' || str.charAt(i) == 'G') {
						count++;
						if (i == str.length() - 1 && count > len) {
							len = count;
						}
					} else {
						if (count > len) {
							len = count;
						}
						count = 0;
					}
				}
				System.out.println(len);

			} else {
				System.out.println(0);
			}
		}
		in.close();
	}

}
