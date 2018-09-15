package ��λ��ͳ��;

/**
 * ��Ŀ������
 * 
 * ����һ��kλ����N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)��
 * ���д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺����N = 100311������2��0��3��1����1��3��
 * 
�����ʽ�� 
ÿ���������1��������������һ��������1000λ��������N��
�����ʽ�� 
��N��ÿһ�ֲ�ͬ�ĸ�λ���֣���D:M�ĸ�ʽ��һ���������λ����D������N�г��ֵĴ���M��Ҫ��D�����������

����������
100311
���������
0:2
1:3
3:1
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			int[] arr = new int[11];
			for (int i = 0; i < len; i++) {
				arr[str.charAt(i) - '0']++;
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					System.out.println(i + ":" + arr[i]);
			}
		}
		in.close();
	}
}
