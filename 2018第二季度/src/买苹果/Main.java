package 买苹果;

/**
 * 题目描述
小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
输入描述:
输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
输出描述:
输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
示例1 
输入
20
输出
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // 需要买的苹果数

			// 不能买恰好n个苹果则输出-1
			if (n >= 1 && n <= 11) {
				if (n == 6 || n == 8) {
					System.out.println(1);
				} else {
					System.out.println(-1);
				}
			} else {
				// [12,100]奇数不能购买
				if (n % 2 != 0) {
					System.out.println(-1);
				} else {
					// 偶数的情况，能购买，求袋数最少
					// 6 * x + 8 * y = n
					boolean flag = false;
					for (int x = 0; x <= 15; x++) {
						for (int y = 0; y <= 15; y++) {
							// 找到最小袋数跳出循环
							if (6 * x + 8 * y == n) {
								System.out.println(x + y);
								flag = true;
								break;
							}
						}
						// 如果flag = true，则找到最小袋数，跳出循环
						if (flag) {
							break;
						}
					}
				}
			}
		}
		cin.close();
	}

}
