package �������Ϻ�;

/**
 * ��Ŀ������
 * 
 * ������������A��B�������A��B�����������Լ���Щ���ĺ͡�
 * �����ʽ��
 * ������һ���и���2������A��B������-100<=A<=B<=100������Կո�ָ��� 
 * �����ʽ��
 * ����˳�������A��B������������ÿ5������ռһ�У�ÿ������ռ5���ַ���ȣ����Ҷ��롣�����һ�������ȫ�����ֵĺ͡�
 *  
 * ���������� -3 8 
 * ���������
 *  -3 -2 -1 0 1 
 *   2  3  4 5 6 
 *   7  8 
 *   Sum = 30
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int beginNum = in.nextInt();
			int endNum = in.nextInt();

			int sum = 0;
			int k = 0;
			for (int i = beginNum; i <= endNum; i++) {
				sum += i;
				System.out.printf("%5d", i);
				k++;
				if (k % 5 == 0) {
					System.out.println();
				} else if (i == endNum) {
					System.out.println();
				}
			}
			System.out.println("sum = " + sum);
		}
		in.close();
	}

}
