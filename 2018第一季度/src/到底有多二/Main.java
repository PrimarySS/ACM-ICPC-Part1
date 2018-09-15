package 到底有多二;

/**
 * 题目描述：
 * 
 * 一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。如果这个数是负数，则程度增加0.5倍；
 * 如果还是个偶数，则再增加1倍。例如数字“-13142223336”是个11位数，其中有3个2，并且是负数，也是偶数，
 * 则它的犯二程度计算为：3/11*1.5*2*100%，约为81.82%。本题就请你计算一个给定整数到底有多二。 
输入格式： 
输入第一行给出一个不超过50位的整数N。 
输出格式： 
在一行中输出N犯二的程度，保留小数点后两位。 
输入样例：
-13142223336
输出样例：
81.82%
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();
			int count = 0;
			int len = str.length();

			// 统计2出现的次数
			for (int i = 0; i < len; i++) {
				if (str.charAt(i) - '0' == 2) {
					count++;
				}
			}
			float per = 0;
			// 负
			if (str.charAt(0) == '-') {
				// 偶
				if (str.charAt(len - 1) % 2 == 0) {
					per = (float) ((float) count / (float) (len - 1) * 1.5 * 2 * 100);
				} else {
					// 非偶
					per = (float) ((float) count / (float) (len - 1) * 1.5 * 100);
				}
			} else {
				// 非负
				// 偶
				if (str.charAt(len - 1) % 2 == 0) {
					per = (float) ((float) count / (float) len * 2 * 100);
				} else {
					// 非偶
					per = (float) ((float) count / (float) len * 100);
				}
			}
			System.out.printf("%.2f", per);
			System.out.println("%");
		}
		in.close();
	}

}
