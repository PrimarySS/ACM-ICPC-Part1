package ���ַ���;

/**
 * ��Ŀ������
 * 
 * ��Ŀ���� ����һϵ�����������밴Ҫ������ֽ��з��࣬���������5�����֣�
 * 
 * A1 = �ܱ�5����������������ż���ĺͣ�
 * 
 * A2 = ����5������1�����ְ�����˳����н�����ͣ�������n1-n2+n3-n4...��
 * 
 * A3 = ��5������2�����ֵĸ�����
 * 
 * A4 = ��5������3�����ֵ�ƽ��������ȷ��С�����1λ��
 * 
 * A5 = ��5������4��������������֡�
 * 
 * ��������: ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��������N��������1000�Ĵ�����������������ּ��Կո�ָ���
 * 
 * �������: �Ը�����N��������������ĿҪ�����A1~A5����һ����˳����������ּ��Կո�ָ�������ĩ�����ж���ո�
 * ������ĳһ�����ֲ����ڣ�������Ӧλ�������N����
 * 
 * ��������: 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 
 * �������: 30 11 2 9.7 9
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			// ����n������
			int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
			int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
			for (int i = 1; i <= N; i++) {
				int n = in.nextInt();
				if (n % 5 == 0 && n % 2 == 0) {
					A1 += n;
					count1++;
				} else if (n % 5 == 1) {
					if ((count2 + 2) % 2 == 0) {
						A2 += n;
					} else {
						A2 -= n;
					}
					count2++;
				} else if (n % 5 == 2) {
					A3++;
					count3++;
				} else if (n % 5 == 3) {
					A4 += n;
					count4++;
				} else if (n % 5 == 4) {
					if (n > A5)
						A5 = n;
					count5++;
				}
			}
			// ��ƽ����A3
			float A4Sum = (float) A4 / (float) count4;
			String aver = String.format("%.1f", A4Sum);
			// ���A1~A5
			System.out.print(count1 == 0 ? "N" : A1);
			System.out.print(" " + (count2 == 0 ? "N" : A2));
			System.out.print(" " + (count3 == 0 ? "N" : A3));
			System.out.print(" " + (count4 == 0 ? "N" : aver));
			System.out.println(" " + (count5 == 0 ? "N" : A5));
		}
		in.close();

	}

}
