package 锤子剪刀布;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			// 输入甲乙的n次交锋
			int rel = 0;
			int AWin = 0, BWin = 0;
			int AWinByC = 0, AWinByB = 0, AWinByJ = 0;
			int BWinByC = 0, BWinByB = 0, BWinByJ = 0;
			for (int i = 0; i < n; i++) {
				String AShow = in.next(); // 甲
				String BShow = in.next(); // 乙
				// 1.双方打平
				if (AShow.equals(BShow)) {
					rel++;
				}
				// 2.甲出锤子时
				else if (AShow.equals("C")) {
					// 甲胜
					if (BShow.equals("J")) {
						AWin++;
						AWinByC++;
					} else {
						// 乙胜
						BWin++;
						BWinByB++;
					}
				}
				// 3.甲出剪刀时
				else if (AShow.equals("J")) {
					// 甲胜
					if (BShow.equals("B")) {
						AWin++;
						AWinByJ++;
					} else {
						// 乙胜
						BWin++;
						BWinByC++;
					}
				}
				// 4.甲出剪刀时
				else if (AShow.equals("B")) {
					// 甲胜
					if (BShow.equals("C")) {
						AWin++;
						AWinByB++;
					} else {
						// 乙胜 
						BWin++;
						BWinByJ++;
					}
				}
			}
			// 输出甲乙的战绩分析表
			System.out.println(AWin + " " + rel + " " + (n - AWin - rel));
			System.out.println(BWin + " " + rel + " " + (n - BWin - rel));
			// 排序通过哪个赢的机率
			int AWinCountBy = sort(AWinByC, AWinByJ, AWinByB);
			int BWinCountBy = sort(BWinByC, BWinByJ, BWinByB);

			// 甲赢的绝招
			if (AWinCountBy == AWinByB) {
				System.out.print("B ");
			} else if (AWinCountBy == AWinByC) {
				System.out.print("C ");
			} else {
				System.out.print("J ");
			}
			// 乙赢的绝招
			if (BWinCountBy == BWinByB) {
				System.out.println("B");
			} else if (BWinCountBy == BWinByC) {
				System.out.println("C");
			} else {
				System.out.println("J");
			}
		}
		in.close();
	}

	/**
	 * 获得三个数的最大值
	 * 
	 * @param aWinByC
	 * @param aWinByJ
	 * @param aWinByB
	 * @return 返回最大值
	 */
	private static int sort(int aWinByC, int aWinByJ, int aWinByB) {
		int max = 0;
		if (aWinByJ > aWinByC)
			max = aWinByJ;
		else
			max = aWinByC;
		if (aWinByB > max)
			max = aWinByB;
		return max;
	}

}
