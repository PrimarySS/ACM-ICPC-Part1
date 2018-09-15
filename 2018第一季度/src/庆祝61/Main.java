package 庆祝61;

/**
 * 题目描述：
 * 牛家庄幼儿园为庆祝61儿童节举办庆祝活动,庆祝活动中有一个节目是小朋友们围成一个圆圈跳舞。牛老师挑选出n个小朋友参与跳舞节目,已知每个小朋友的身高h_i。为了让舞蹈看起来和谐,牛老师需要让跳舞的圆圈队形中相邻小朋友的身高差的最大值最小,牛老师犯了难,希望你能帮帮他。
如样例所示:
当圆圈队伍按照100,98,103,105顺时针排列的时候最大身高差为5,其他排列不会得到更优的解 
输入描述:
输入包括两行,第一行为一个正整数n(3 ≤ n ≤ 20)
第二行为n个整数h_i(80 ≤ h_i ≤ 140),表示每个小朋友的身高。


输出描述:
输出一个整数,表示满足条件下的相邻小朋友身高差的最大值。

输入例子1:
4
100 103 98 105

输出例子1:
5
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int[] h_a = new int[n];
			int[] h_max = new int[n * n];
			for (int i = 0; i < h_a.length; i++) {
				h_a[i] = in.nextInt();
			}

			int k = 0;
			for (int i = 0; i < h_a.length; i++) {
				for (int j = i + 1; j < h_a.length; j++) {
					if (h_a[i] >= h_a[j]) {
						h_max[k] = h_a[i] - h_a[j];
					} else {
						h_max[k] = h_a[j] - h_a[i];
					}
					k++;
				}
			}
			sort(h_max);
			for (int i = 0; i < h_max.length; i++) {
				System.out.println(h_max[i]);
			}
		}
		in.close();
	}

	/**
	 * 功能：排序
	 * 
	 * @param a
	 *            数组
	 */
	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
