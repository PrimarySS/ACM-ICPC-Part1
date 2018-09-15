package 删除字符串;

/**
 * 题目描述
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
输入描述:
每个测试输入包含2个字符串
输出描述:
输出删除后的字符串
示例1 
输入
They are students. aeiou
输出
Thy r stdnts.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // 父字符串
			String ss = cin.nextLine(); // 子字符串
			// 当子字符串为长串   
			Map<Integer, Character> map = new HashMap<Integer, Character>();
			char[] chDad = s.toCharArray(); // 把父字符串转化为字符串数组
			// 把父字符串存到map中
			for (int i = 0; i < chDad.length; i++) {
				map.put(i, chDad[i]);
			}
			int a = 0;
			while (a < ss.length()) {
				for (int i = 0; i < s.length(); i++) {
					if (ss.charAt(a) == s.charAt(i)) {
						map.remove(i); // 移除判断过存在的字符，避免个数的干扰
					}
				}
				a++;
			}
			// 遍历删除后的map
			Set<Integer> Valekey = map.keySet();
			for (Integer integer : Valekey) {
				System.out.print(map.get(integer));
			}
		}
		cin.close();
	}

}
