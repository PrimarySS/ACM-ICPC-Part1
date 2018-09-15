package �±�;

import java.util.Arrays;
import java.util.Scanner;

//���������ڴ洢�±����ܼۡ���������Լ������䵥��
class moCake implements Comparable<moCake> {
	int totalValue; // �±����ܼ�
	int repertories; // �������
	double price; // ÿ���±��ļ��㵥λ

	@Override
	public int compareTo(moCake m) {
		// �����±�������Ϊ���۴Ӵ�С��˳��
		// if (this.price > m.price) {
		// return -1;
		// } else {
		// return 1;
		// }
		return this.price > m.price ? -1 : 1;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// �±������������Լ���������
		int num = in.nextInt();
		int requirement = in.nextInt();

		moCake[] mc = new moCake[num];
		for (int i = 0; i < mc.length; i++) {
			// �Զ������֮ǰ���Ƚ���ʵ����
			mc[i] = new moCake();
			mc[i].repertories = in.nextInt();
		}
		for (int i = 0; i < mc.length; i++) {
			mc[i].totalValue = in.nextInt();
		}
		in.close();
		// ����ÿ���±��ĵ���
		for (int i = 0; i < mc.length; i++) {
			mc[i].price = (double) mc[i].totalValue / mc[i].repertories;
		}
		// ���±������������
		Arrays.sort(mc);

		double earning = 0.0;
		// ���±��������ʼ������ֱ����������
		for (int i = 0; i < mc.length; i++) {
			if (requirement > mc[i].repertories) {
				earning += mc[i].totalValue;
				requirement -= mc[i].repertories;
			} else {
				earning += ((double) requirement / mc[i].repertories) * mc[i].totalValue;
				break;
			}
		}
		System.out.printf("%.2f\n", earning);// ��ʽ�����
	}

}