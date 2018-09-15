package ������;

/*
 * ��Ŀ����
С��ͬѧѧϰ�˲�ͬ�Ľ���֮��������һЩ������������Ϸ��С��ͬѧ֪�������ճ�������������õ���ʮ��������
���ڼ�����У���������Ҳ�ܳ��á����ڶ���һ������x��С��ͬѧ���������������f(x)��g(x)�� f(x)��ʾ��x���
����ʮ����д���������λ�ϵ�����֮�͡���f(123)=1+2+3=6�� g(x)��ʾ��x������ö�����д���������λ�ϵ�����֮�͡�
��123�Ķ����Ʊ�ʾΪ1111011����ô��g(123)=1+1+1+1+0+1+1=6�� С��ͬѧ���ֶ���һЩ������x����f(x)=g(x)��
������������Ϊ����������������֪����С�ڵ���n���������ж��ٸ���

��������:
ÿ����������һ����n(n<=100000)

�������:
ÿ���������һ�У�С�ڵ���n��������������

ʾ��1 
����
21
���
3
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			// �����[1,n]��Χ��������
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (DECSum(i) == BINSum(i)) {
					count++;
				}
			}
			// ����������ĸ���
			System.out.println(count);
		}
		cin.close();

	}

	/**
	 * ���ܣ� ����ʮ���Ƹ�����λ�ϵ�����֮��
	 * 
	 * @param i
	 *            ��ǰ����
	 * 
	 * @return ���ظ�����λ�ϵ�����֮��
	 */
	private static int DECSum(int i) {
		int temp = i; // ��������ı仯Ӱ��n
		int rem = 0; // ÿ�������ֵ
		int sum = 0; // ��������֮��
		while (temp > 0) {
			rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		return sum;
	}

	/**
	 * ���ܣ� ��������Ƹ�����λ�ϵ�����֮��
	 * 
	 * @param i
	 *            ��ǰ����
	 * @return ���ظ�����λ�ϵ�����֮��
	 */
	private static int BINSum(int i) {
		int temp = i; // ��������ı仯Ӱ��n
		int rem = 0; // ÿ�������ֵ
		int sum = 0; // ��������֮��
		while (temp > 0) {
			rem = temp % 2;
			sum += rem;
			temp /= 2;
		}
		return sum;
	}

}
