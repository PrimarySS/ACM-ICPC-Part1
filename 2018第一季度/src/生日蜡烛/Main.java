package ��������;

/**
 * ��������

ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

��������������һ����Ϩ��236������

���ʣ����Ӷ����꿪ʼ������party�ģ�
���ʣ����ڵ������Ƕ����ꣿ

����д����ʼ������party����������
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int candleSum = in.nextInt();	//��������������һ����Ϩ������
			int sum = 0;
			int endSum = 0;
			for (int i = 1; i <= candleSum; i++) {
				// ��i��������ǵ�����
				sum = i;
				endSum = i;
				// �����i�꿪ʼ������
				for (int j = i; j <= candleSum; j++) {
					sum++;
					endSum += sum;
					if (endSum == candleSum) {
						// ��ʼ����������
						System.out.println(i);
						// ���ڵ�����
						System.out.println(j + 1);
						break;
					}
				}
			}
		}
		in.close();
	}

}
