package ����A��B;

/**
 * ��Ŀ����
������A�ġ�DA��Ϊ1λ���������֡�����Ϊ��A������DA��ɵ�������PA��
���磺����A = 3862767��DA = 6����A�ġ�6���֡�PA��66����ΪA����2��6��
 
 �ָ���A��DA��B��DB�����д�������PA + PB��

��������:
������һ�������θ���A��DA��B��DB���м��Կո�ָ�������0 < A, B < 1010��

�������:
��һ�������PA + PB��ֵ��

��������:
3862767 6 13530293 3

�������:
399
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int A = in.nextInt();
			int Da = in.nextInt();
			int B = in.nextInt();
			int Db = in.nextInt();

			System.out.println((P(A, Da) + P(B, Db)));
		}
		in.close();
	}

	private static int P(int a, int da) {
		StringBuilder builder = new StringBuilder();
		String str = String.valueOf(a); 

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - '0' == da) {
				builder.append(da);
			}
		}
		int p = Integer.parseInt(builder.toString());
		return p;
	}

}
