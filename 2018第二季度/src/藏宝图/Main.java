package 藏宝图;

/**
 * 题目描述
牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，藏宝盒上有一个机关，机关每次会显示两个字符串 s 和 t，根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。注意，子序列不要求在原字符串中是连续的，例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
输入描述:
每个输入包含一个测试用例。每个测试用例包含两行长度不超过 10 的不包含空格的可见 ASCII 字符串。
输出描述:
输出一行 “Yes” 或者 “No” 表示结果。
示例1 
输入
x.nowcoder.com
ooo
输出
Yes
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // 父字符串
			String ss = cin.nextLine(); // 子字符串

			// 判断父字符串是否包含子字符串
			// 当子字符串是一个字符
			if (ss.length() == 1) {
				if (s.contains(ss)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				// 当子字符串为长串
				Map<Integer, Character> map = new HashMap<Integer, Character>();
				char[] chDad = s.toCharArray(); // 把父字符串转化为字符串数组
				// 把父字符串存到map中
				for (int i = 0; i < chDad.length; i++) {
					map.put(i, chDad[i]);
				}
				char[] chSon = ss.toCharArray(); // 把子字符串转化为字符串数组
				boolean flag = false;
				for (int i = 0; i < chSon.length; i++) {
					if (map.containsValue(chSon[i])) {
						flag = true;
						map.remove(map.get(chSon[i])); // 移除判断过存在的字符，避免个数的干扰
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		cin.close();
	}

}
