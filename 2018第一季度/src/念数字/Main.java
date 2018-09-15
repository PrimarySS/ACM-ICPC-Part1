package 念数字;

/**
 * 题目描述：
 * 
 * 输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出“fu”字。十个数字对应的拼音如下： 
0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu

输入格式： 
输入在一行中给出一个整数，如： 1234 。 
提示：整数包括负数、零和正数。 

输出格式： 
在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如 yi er san si。

输入样例：
-600
输出样例：
fu liu ling ling
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			char[] ch = str.toCharArray();
			String[] newStr = new String[ch.length];
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '-') {
					newStr[i] = "fu";
				} else if (ch[i] - '0' == 0) {
					newStr[i] = "ling";
				} else if (ch[i] - '0' == 1) {
					newStr[i] = "yi";
				} else if (ch[i] - '0' == 2) {
					newStr[i] = "er";
				} else if (ch[i] - '0' == 3) {
					newStr[i] = "san";
				} else if (ch[i] - '0' == 4) {
					newStr[i] = "si";
				} else if (ch[i] - '0' == 5) {
					newStr[i] = "wu";
				} else if (ch[i] - '0' == 6) {
					newStr[i] = "liu";
				} else if (ch[i] - '0' == 7) {
					newStr[i] = "qi";
				} else if (ch[i] - '0' == 8) {
					newStr[i] = "ba";
				} else if (ch[i] - '0' == 9) {
					newStr[i] = "jiu";
				}
			}
			
			for (int i = 0; i < newStr.length; i++) {
				if (i == newStr.length - 1) {
					System.out.println(newStr[i]);
				} else {
					System.out.print(newStr[i] + " ");
				}
			}
		}
		in.close();

	}

}
