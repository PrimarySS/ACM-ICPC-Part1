package 输出GPLT;

/**
 * 题目描述：
 * 
 * 给定一个长度不超过10000的、仅由英文字母构成的字符串。请将字符重新调整顺序，按“GPLTGPLT....”这样的顺序输出，并忽略其它字符。当然，四种字符（不区分大小写）的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按GPLT的顺序打印，直到所有字符都被输出。
输入格式： 
输入在一行中给出一个长度不超过10000的、仅由英文字母构成的非空字符串。 
输出格式： 
在一行中按题目要求输出排序后的字符串。题目保证输出非空。
输入样例：
pcTclnGloRgLrtLhgljkLhGFauPewSKgt
输出样例：
GPLTGPLTGLTGLGLL
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (bf.ready()) {
			String str = bf.readLine();
			String newStr = str.toUpperCase();

			int GCount = 0, PCount = 0, LCount = 0, TCount = 0;
			for (int i = 0; i < newStr.length(); i++) {
				if (newStr.charAt(i) == 'G') {
					GCount++;
				} else if (newStr.charAt(i) == 'P') {
					PCount++;
				} else if (newStr.charAt(i) == 'L') {
					LCount++;
				} else if (newStr.charAt(i) == 'T') {
					TCount++;
				}
			}

			while (GCount > 0 || PCount > 0 || LCount > 0 || TCount > 0) {
				if (GCount > 0) {
					System.out.print("G");
					GCount--;
				}
				if (PCount > 0) {
					System.out.print("P");
					PCount--;
				}
				if (LCount > 0) {
					System.out.print("L");
					LCount--;
				}
				if (TCount > 0) {
					System.out.print("T");
					TCount--;
				}
			}
		}
		bf.close();
	}

}
