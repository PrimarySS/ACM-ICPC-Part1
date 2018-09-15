package 黑化的牛牛;

/**
 * 题目描述：
 * 牛牛变得黑化了,想要摧毁掉地球。但他忘记了开启地球毁灭器的密码。牛牛手里有一个字符串S,牛牛还记得从S中去掉一个字符就恰好是正确的密码,请你帮牛牛求出他最多需要尝试多少次密码。
如样例所示S = "ABA",3个可能的密码是"BA", "AA", "AB".
当S = "A", 牛牛唯一可以尝试的密码是一个空的密码,所以输出1. 
输入描述:
输入包括一个字符串S,字符串长度length(1 ≤ length ≤ 50),其中都是从'A'到'Z'的大写字母。


输出描述:
输出一个整数,表示牛牛最多需要尝试的密码次数。

输入例子1:
ABA

输出例子1:
3
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			// 当S = "A", 牛牛唯一可以尝试的密码是一个空的密码,所以输出1.
			if (len == 1) {
				System.out.println(1);
			} else {
				// 当s>1时,尝试多次密码
				Map<Integer, String> map = new HashMap<Integer, String>();
				for (int i = 1; i <= len; i++) {
					String s = str.substring(0, i - 1) + str.substring(i, len);
					// 如果map集合里没有此字符串则加入集合中
					if (!map.containsValue(s)) {
						map.put(i, s);
					}
				}
				System.out.println(map.size());
			}
		}
		in.close();
	}

}
