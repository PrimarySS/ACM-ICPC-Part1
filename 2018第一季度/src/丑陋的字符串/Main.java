package 丑陋的字符串;

/**
 * 题目描述：
 * 牛牛喜欢字符串,但是他讨厌丑陋的字符串。对于牛牛来说,一个字符串的丑陋值是字符串中相同连续字符对的个数。
 * 比如字符串“ABABAABBB”的丑陋值是3,因为有一对"AA"和两对重叠的"BB"。现在给出一个字符串,
 * 字符串中包含字符'A'、'B'和'?'。牛牛现在可以把字符串中的问号改为'A'或者'B'。
 * 牛牛现在想让字符串的丑陋值最小,希望你能帮帮他。 
 * 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();
			int count = 0;

			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				// 如果，字符串最开始是连续的“？”号，则可以肯定不会存在丑陋值
				if (i == 0) {
					while (i < ch.length && ch[i] == '?') {
						i++;
					}
				} else {
					// 如果当前值是“？”号，则设置当前值为与前一个值不同的另一个值；
					if (ch[i] == '?') {
						if (ch[i - 1] == 'A') {
							ch[i] = 'B';
						} else {
							ch[i] = 'A';
						}
					} else if (ch[i] == ch[i - 1]) {
						// 如果当前值与前一个值相同，记录这两个值为丑陋值
						count++;
					}
				}
			}
			System.out.println(count);
		}
		in.close();
	}

}
