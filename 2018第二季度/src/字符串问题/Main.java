package 字符串问题;

/**
 * 题目描述  
有一个字符串 让你找到这个字符串 S 里面的子串T 这个子串 T 必须满足即使这个串的前缀 也是这个
串的后缀 并且 在字符串中也出现过一次的(提示 要求满足前后缀的同时也要在字符串中出现一次 只是前后缀可不行 输出最长满足要求字符串)
输入描述:
给出一个字符串 长度 1 到 1e6  全部是小写字母
输出描述:
如果找的到就输出这个子串T 如果不行就输出 Just a legend
示例1 
输入
fixprefixsuffix
输出
fix
示例2 
输入
abcdabc
输出
Just a legend
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.next();
			int length = str.length();
			String restr = "Just a legend";

			for (int i = 1; i <= length - 2; i++) {
				String pre = str.substring(0, i);
				String suf = str.substring(length - i);
				String mid = str.substring(1, length - 1);

				if (pre.equals(suf) && mid.contains(pre)) {
					restr = pre;
				}
			}
			System.out.print(restr);
		}
		in.close();
	}
}