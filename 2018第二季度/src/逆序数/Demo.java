package 逆序数;

import java.util.Scanner;

public class Demo {

	private static int count = 0;// 逆序数个数
	private static int[] a;// 待求数组
	private static int[] b;// 中转数组

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = cin.nextInt();
			}
			b = new int[a.length];
			getResult(0, a.length - 1);
			System.out.println(count);
			count = 0;
		}
		cin.close();
	}

	private static void getResult(int s, int e) {
		if (s < e) {
			int mid = (s + e) / 2;
			getResult(s, mid);
			getResult(mid + 1, e);
			getCount(s, mid, e);
		}
	}

	private static void getCount(int s, int mid, int e) {
		int i = s;
		int j = mid + 1;
		int k = 0;
		while (i < mid + 1 && j < e + 1) {
			if (a[i] <= a[j]) {
				b[k++] = a[i++];
			} else {
				count += mid - i + 1;
				b[k++] = a[j++];
			}
		}
		while (i < mid + 1) {
			b[k++] = a[i++];
		}
		while (j < e + 1) {
			b[k++] = a[j++];
		}
		for (int arg = 0; arg < e - s + 1; arg++) {
			a[s + arg] = b[arg];
		}
	}
}