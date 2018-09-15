package n个数里出现次数大于等于n一半的数;

/**
 * 题目描述
输入n个整数，输出出现次数大于等于数组长度一半的数。
输入描述:
每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
输出描述:
输出出现次数大于等于n/2的数。
示例1 
输入
3 9 3 2 5 6 7 3 2 3 3 3
输出
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String[] nums = null; // 定义字符串数组
			nums = cin.nextLine().split(" "); // 输入字符串数组，用空格分开
			int[] num = new int[nums.length]; // 定义字符串数组长度的整形数组

			// 将String字符串数组长度的int整形数组
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.valueOf(nums[i]);
			}

			// 统计数字出现次数
			for (int i = 0; i < num.length; i++) {
				int count = 0;
				for (int j = i; j < num.length; j++) {
					if (num[i] == num[j]) {
						count++;
					}
				}
				// 输出出现次数大于等于n/2的数
				if (count >= (num.length / 2)) {
					System.out.println(num[i]);
					break;
				}
			}
		}
		cin.close();
	}

}
