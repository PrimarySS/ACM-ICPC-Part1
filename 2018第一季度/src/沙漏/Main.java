package ɳ©;

/**
 * ����Ҫ����д������Ѹ����ķ��Ŵ�ӡ��ɳ©����״���������17����*����Ҫ�����и�ʽ��ӡ
*****
 ***
  *
 ***
*****
��ν��ɳ©��״������ָÿ��������������ţ����з������Ķ��룻�������з�������2���������ȴӴ�С˳��ݼ���1���ٴ�С����˳���������β��������ȡ�
��������N�����ţ���һ�����������һ��ɳ©��Ҫ���ӡ����ɳ©���õ������ܶ�ķ��š�
�����ʽ�� 
������һ�и���1��������N��<=1000����һ�����ţ��м��Կո�ָ��� 
�����ʽ�� 
���ȴ�ӡ���ɸ���������ɵ�����ɳ©��״�������һ�������ʣ��û�õ��ķ������� 
����������
19 *
���������
*****
 ***
  *
 ***
*****
2
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			String ch = in.nextLine();

			int rem = 0;
			for (int i = 1; i <= n; i++) {
				int Sn = 2 * i * i - 1; // �������⣬��i��ʱ�õ��ܷ�����
				rem = n - Sn; // i�����ʣ�ַ�
				// ���ʣ�µķ��Ų��㹻������������һ�㣬����ѭ��
				if (rem < 4 * i + 2) {
					break;
				}
			}
			int k = (int) Math.sqrt((n - rem + 1) / 2);
			// ����ϰ벿��
			for (int i = k; i >= 1; i--) {
				int p = 1;
				// ����ո񵱲�ֵ
				while (p <= k - i) {
					System.out.print(" ");
					p++;
				}
				// ����ַ�
				int j = 1;
				while (j <= 2 * i - 1) {
					System.out.print(ch.substring(1));
					j++;
				}
				System.out.println();
			}
			// ����°벿��
			for (int i = 2; i <= k; i++) {
				// ����ո񵱲�ֵ
				int p = 1;
				while (p <= k - i) {
					System.out.print(" ");
					p++;
				}
				// ����ַ�
				int j = 1;
				while (j <= 2 * i - 1) {
					System.out.print(ch.substring(1));
					j++;
				}
				System.out.println();
			}
			System.out.println(rem);
		}
		in.close();
	}

}
