package ��Ҫ��;

/**
 * ��Ŀ����
����С����һ��W*H��������ӣ�������б��Ϊ0~H-1��������б��Ϊ0~W-1��ÿ������������Է�һ�鵰�⣬
�������鵰���ŷ����þ��벻�ܵ���2��

����������������(x1,y1),(x2,y2)��ŷ����þ���Ϊ:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) ������ƽ����
С����֪�������ԷŶ��ٿ鵰������������

��������:
ÿ������������񳤿�W,H���ÿո�ָ�.(1 �� W��H �� 1000)

�������:
���һ�������Էŵĵ�����

ʾ��1 
����
3 2
���
4
 * 
 * ������4������2�������ȼ���������ۼ��ɡ�����λ�þ��Ǽ��ÿ��2*2�������ε����� 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int width = cin.nextInt(); // ������
			int hight = cin.nextInt(); // ����߶�
			System.out.println(dealSum(width, hight)); // �����Էŵĵ�����
		}
		cin.close();
	}

	/**
	 * ���ܣ� ���������Էŵĵ�����
	 * 
	 * @param width
	 *            ����Ŀ��
	 * @param hight
	 *            ����ĸ߶�
	 * @return ���ؿ��Էŵĵ�����
	 */
	private static int dealSum(int width, int hight) {
		int n = 0;
		if (width % 4 == 0 || hight % 4 == 0) {
			n = (width * hight) / 2; // ���������4 ��ô�������Ϊ���������һ��
		} else {
			n = (width * hight) / 2 + 1;// Ϊ���������һ�� + 1
		}
		return n;
	}
}
