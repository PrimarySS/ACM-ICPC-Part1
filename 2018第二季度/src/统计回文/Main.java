package 统计回文;

/**
 * 题目描述
“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有对称美的回文串，
生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。
你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。

例如：
A = “aba”，B = “b”。这里有4种把B插入A的办法：
* 在A的第一个字母之前: "baba" 不是回文 
* 在第一个字母‘a’之后: "abba" 是回文 
* 在字母‘b’之后: "abba" 是回文 
* 在第二个字母'a'之后 "abab" 不是回文 
所以满足条件的答案为2

输入描述:
每组输入数据共两行。
第一行为字符串A
第二行为字符串B
字符串长度均小于100且只包含小写字母

输出描述:
输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
示例1 
输入
aba
b
输出
2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // 输入第一个字符串
			String ss = cin.nextLine(); // 输入第一个字符串
			int count = 0; // 存储回文字符串数
			// 插入首部
			String HeadStrstr = ss + s;
			// 倒置字符串
			String NewHeadStr = new StringBuffer(HeadStrstr).reverse().toString(); 
			// 判断是否为回文字符串
			if (NewHeadStr.equals(HeadStrstr)) {
				count++;
			}
			// 把ss插入到s中的所有可能,并判断每种可能是否存在回文组合
			for (int j = 0; j < s.length(); j++) {
				// 把ss插入到s中
				String str = s.substring(0, j + 1) + ss + s.substring(j + 1, s.length());
				// 倒置字符串
				String NewStr = new StringBuffer(str).reverse().toString();
				// 判断是否为回文字符串
				if (NewStr.equals(str)) {
					count++;
				}
			}
			// 输出这组字符串的回文串数
			System.out.println(count);
		}
		cin.close();
	}
}
