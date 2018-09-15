package 逆序数;

/**
 * 题目描述  
在一个排列中，如果一对数的前后位置与大小顺序相反，即前面的数大于后面的数，那么它们就称为一个逆序。
一个排列中逆序的总数就称为这个排列的逆序数。比如一个序列为4 5 1 3 2， 那么这个序列的逆序数为7，
逆序对分别为(4, 1), (4, 3), (4, 2), (5, 1), (5, 3), (5, 2),(3, 2)。

输入描述:
第一行有一个整数n(1 <= n <= 100000),  然后第二行跟着n个整数，对于第i个数a[i]，(0 <= a[i] <= 100000)。
输出描述:
输出这个序列中的逆序数

示例1 
输入
5
4 5 1 3 2
输出
7
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = cin.nextInt();
			}

			int count = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		cin.close();
	}

}
