package ab֮����C;

/**
 * ��Ŀ����
��������[-2��31�η�, 2��31�η�]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��

��������:
�����1�и���������T(<=10)���ǲ��������ĸ�����������T�����������ÿ��ռһ�У�˳�����A��B��C���������Կո�ָ���


�������:
��ÿ�������������һ���������Case #X: true�����A+B>C�����������Case #X: false��������X�ǲ��������ı�ţ���1��ʼ����

��������:
4

1 2 3

2 3 4

2147483647 0 2147483646

0 -2147483648 -2147483647

�������:
Case #1: false

Case #2: true

Case #3: true

Case #4: false
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			int[] a = new int[n];
			// ����n����������
			int i = 0;
			while (n > 0) {
				// ����A��B��C
				BigInteger A = in.nextBigInteger();
				BigInteger B = in.nextBigInteger();
				BigInteger C = in.nextBigInteger();
				// �ж�A+B==C
				if (A.add(B).compareTo(C) > 0) {
					a[i] = 1;
				} else {
					a[i] = 0;
				}
				i++;
				n--;
			}
			// ������
			for (int j = 0; j < a.length; j++) {
				if (a[j] == 1) {
					System.out.println("Case #" + (j + 1) + ": true");
				} else {
					System.out.println("Case #" + (j + 1) + ": false");
				}
			}

		}
		in.close();
	}

}
