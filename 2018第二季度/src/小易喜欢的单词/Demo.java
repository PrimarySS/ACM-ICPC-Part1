package 小易喜欢的单词;

/**
 * 题目描述
小易喜欢的单词具有以下特性：
1.单词每个字母都是大写字母
2.单词没有连续相等的字母
3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。

例如：
小易不喜欢"ABBA"，因为这里有两个连续的'B'
小易不喜欢"THETXH"，因为这里包含子序列"THTH"
小易不喜欢"ABACADA"，因为这里包含子序列"AAAA"
小易喜欢"A","ABA"和"ABCBA"这些单词

给你一个单词，你要回答小易是否会喜欢这个单词。

输入描述:
输入为一个字符串，都由大写字母组成，长度小于100

输出描述:
如果小易喜欢输出"Likes",不喜欢输出"Dislikes"

示例1 
输入
AAA
输出
Dislikes

 * 分析：
 * 		“.”用于匹配除换行符之外的所有字符。
 * 		“+”元字符规定其前导字符必须在目标对象中连续出现一次或多次，
 * 		“*”元字符规定其前导字符必须在目标对象中出现零次或连续多次
 * 		“()” 把字符串组合在一起。“()”符号包含的内容必须同时出现在目标对象中。
 */
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String str = cin.nextLine();

			// 判断字符串每个字母都是否大写
			boolean p = str.matches("[A-Z]+");

			// 判断字符串是否连续相等的字母
			boolean q = str.matches(".*(.)(\\1).*");

			// 字符串没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
			boolean l = str.matches(".*(.).*(.)(.*\\1)(.*\\2).*");

			// 都是大写，沒有字母连续，没有子序列连续
			if (p && !q && !l) {
				System.out.println("Likes");
			} else {
				System.out.println("Dislikes");
			}
		}
		cin.close();
	}

}
