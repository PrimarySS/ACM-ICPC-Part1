package ���Ӽ�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			// ������ҵ�n�ν���
			int rel = 0;
			int AWin = 0, BWin = 0;
			int AWinByC = 0, AWinByB = 0, AWinByJ = 0;
			int BWinByC = 0, BWinByB = 0, BWinByJ = 0;
			for (int i = 0; i < n; i++) {
				String AShow = in.next(); // ��
				String BShow = in.next(); // ��
				// 1.˫����ƽ
				if (AShow.equals(BShow)) {
					rel++;
				}
				// 2.�׳�����ʱ
				else if (AShow.equals("C")) {
					// ��ʤ
					if (BShow.equals("J")) {
						AWin++;
						AWinByC++;
					} else {
						// ��ʤ
						BWin++;
						BWinByB++;
					}
				}
				// 3.�׳�����ʱ
				else if (AShow.equals("J")) {
					// ��ʤ
					if (BShow.equals("B")) {
						AWin++;
						AWinByJ++;
					} else {
						// ��ʤ
						BWin++;
						BWinByC++;
					}
				}
				// 4.�׳�����ʱ
				else if (AShow.equals("B")) {
					// ��ʤ
					if (BShow.equals("C")) {
						AWin++;
						AWinByB++;
					} else {
						// ��ʤ 
						BWin++;
						BWinByJ++;
					}
				}
			}
			// ������ҵ�ս��������
			System.out.println(AWin + " " + rel + " " + (n - AWin - rel));
			System.out.println(BWin + " " + rel + " " + (n - BWin - rel));
			// ����ͨ���ĸ�Ӯ�Ļ���
			int AWinCountBy = sort(AWinByC, AWinByJ, AWinByB);
			int BWinCountBy = sort(BWinByC, BWinByJ, BWinByB);

			// ��Ӯ�ľ���
			if (AWinCountBy == AWinByB) {
				System.out.print("B ");
			} else if (AWinCountBy == AWinByC) {
				System.out.print("C ");
			} else {
				System.out.print("J ");
			}
			// ��Ӯ�ľ���
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
	 * ��������������ֵ
	 * 
	 * @param aWinByC
	 * @param aWinByJ
	 * @param aWinByB
	 * @return �������ֵ
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
