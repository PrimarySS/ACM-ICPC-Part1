package ���ŵĵ�;

/**
 * ��Ŀ����
С����һ��Բ��������ԭ���Բ��С��֪��Բ�İ뾶��ƽ����С����Ϊ��Բ�ϵĵ���Һ������궼�������ĵ������ŵģ�
С��������Ѱ��һ���㷨��������ŵĵ�ĸ������������������
���磺�뾶��ƽ�����Ϊ25
���ŵĵ���У�(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)��һ��12���㡣
��������:
����Ϊһ����������ΪԲ�뾶��ƽ��,��Χ��32λint��Χ�ڡ�
�������:
���Ϊһ����������Ϊ���ŵĵ�ĸ���
ʾ��1 
����
25
���
12
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {

			int R = cin.nextInt(); // �뾶��ƽ��
			int r = (int) Math.sqrt(R); // ��ð뾶

			// ������ŵ�
			int count = 0;
			for (int X = 0; X <= r; X++) {
				int Y = (int) Math.sqrt(R - X * X);
				if (X * X + Y * Y == R) {
					if (X == 0 || Y == 0) {
						count += 2; // ֻ�� r �� -r �����
					} else {
						count += 4; // ��ΪԲ��Ϊ0������x��y������
					}
				}
			}
			// ������ŵ����
			System.out.println(count);
		}
		cin.close();
	}

}
