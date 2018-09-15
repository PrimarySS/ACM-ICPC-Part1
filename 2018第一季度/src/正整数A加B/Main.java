package 正整数A加B;

/**
 * 题目描述：
 * 本题的目标很简单，就是求两个正整数A和B的和，其中A和B都在区间[1,1000]。稍微有点麻烦的是，输入并不保证是两个正整数。 
 * 
输入格式： 
输入在一行给出A和B，其间以空格分开。问题是A和B不一定是满足要求的正整数，有时候可能是超出范围的数字、负数、带小数点的实数、
甚至是一堆乱码。 
注意：我们把输入中出现的第1个空格认为是A和B的分隔。题目保证至少存在一个空格，并且B不是一个空字符串。

输出格式： 
如果输入的确是两个正整数，则按格式“A + B = 和”输出。如果某个输入不合要求，则在相应位置输出“?”，显然此时和也是“?”。 

输入样例1：
123 456
输出样例1：
123 + 456 = 579

输入样例2：
22. 18
输出样例2：
? + 18 = ?

输入样例3：
-100 blabla bla...33
输出样例3：
? + ? = ?

 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {

			String str = in.nextLine();

			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != '-' && str.charAt(i) - '0' < 0 && str.charAt(i) - '0' > 9) {
					flag = false;
					break;
				}
			}

			if (flag) {
				String[] a = str.split(" ");

				int A = Integer.parseInt(a[0]);
				int B = Integer.parseInt(a[1]);

				if ((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
					System.out.println(A + " + " + B + " = " + (A + B));
				} else if ((A >= 1 && A <= 1000)) {
					System.out.println(A + " + ？ = ？");
				} else if ((B >= 1 && B <= 1000)) {
					System.out.println("? + " + B + " = ?");
				} else {
					System.out.println("? + ? = ?");
				}
			} else {
				System.out.println("2:? + ? = ?");
			}
		}
		in.close();

	}

}
