package 计算糖果;

/**
 * 题目描述
A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
输入描述:
输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
输出描述:
输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
示例1 
输入
1 -2 3 4
输出
2 1 3

 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			// 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开
			int n1 = cin.nextInt();
			int n2 = cin.nextInt();
			int n3 = cin.nextInt();
			int n4 = cin.nextInt();
			// 范围均在-30到30之间(闭区间)。
			if ((n1 >= -30 && n1 <= 30) && (n2 >= -30 && n2 <= 30) && (n3 >= -30 && n3 <= 30)
					&& (n4 >= -30 && n4 <= 30)) {
				double A = (n1 + n3) / 2d;
				double B = (n2 + n4) / 2d;
				double C = B - n2;
				// 如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格
				if (A % 1 == 0 && B % 1 == 0 && C % 1 == 0) {
					if (A >= 0 && B >= 0 && C >= 0) {
						System.out.println((int)A + " " + (int)B + " " + (int)C);
					} else {
						// 如果不存在这样的整数A，B，C，则输出No
						System.out.println("No");
					}
				} else {
					// 如果不存在这样的整数A，B，C，则输出No
					System.out.println("No");
				}
			}
		}
		cin.close();
	}

}
