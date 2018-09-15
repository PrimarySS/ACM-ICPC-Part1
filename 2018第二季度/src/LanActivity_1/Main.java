package LanActivity_1;

/**
 * 煤球数目

有一堆煤球，堆成三角棱锥形。具体：
第一层放1个，
第二层3个（排列成三角形），
第三层6个（排列成三角形），
第四层10个（排列成三角形），
....
如果一共有100层，共有多少个煤球？

分析：

	n = 1	s1 = 1
	n = 2	s2 = s1 + 2
	n = 3	s3 = s2 + 3 = s1 + 2 + 3
	n = 4	s4 = s3 + 4 = s1 + 2 + 3 + 4
	n = 5	s5 = s4 + 5 = s1 + 2 + 3 + 4 + 5
	...		...
	n = 100	s100 = s1 + 2 + 3 + 4 + 5 + ... +100
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); // 输入第几层
			int s1 = 1, d = 1;
			int sum = s1 * n + (n * (n - 1) * d) / 2; // 等差数列求和公式
			System.out.println(sum);
		}
		cin.close();

	}

}
