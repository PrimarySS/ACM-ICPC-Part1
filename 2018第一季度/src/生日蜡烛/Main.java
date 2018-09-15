package 生日蜡烛;

/**
 * 生日蜡烛

某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

现在算起来，他一共吹熄了236根蜡烛。

请问，他从多少岁开始过生日party的？
请问，现在的年龄是多少岁？

请填写他开始过生日party的年龄数。
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int candleSum = in.nextInt();	//现在算起来，他一共吹熄的蜡烛
			int sum = 0;
			int endSum = 0;
			for (int i = 1; i <= candleSum; i++) {
				// 第i岁过生日是的蜡烛
				sum = i;
				endSum = i;
				// 假设从i岁开始过生日
				for (int j = i; j <= candleSum; j++) {
					sum++;
					endSum += sum;
					if (endSum == candleSum) {
						// 开始过生日年龄
						System.out.println(i);
						// 现在的年龄
						System.out.println(j + 1);
						break;
					}
				}
			}
		}
		in.close();
	}

}
