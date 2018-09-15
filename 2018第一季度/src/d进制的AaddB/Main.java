package d���Ƶ�AaddB;

/**
 * ��Ŀ����
���������Ǹ�10��������A��B(<=230-1)�����A+B��D (1 < D <= 10)��������

��������:
������һ�������θ���3������A��B��D��


�������:
���A+B��D��������

��������:
123 456 8

�������:
1103
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			BigInteger A = in.nextBigInteger();
			BigInteger B = in.nextBigInteger();
			BigInteger change = in.nextBigInteger();

			BigInteger[] rem = new BigInteger[100];

			int i = 0;
			BigInteger temp = A.add(B);
			while (temp.compareTo(BigInteger.ZERO) > 0) {
				i++;
				rem[i] = temp.remainder(change);
				temp = temp.divide(change);
			}

			for (int j = i; j > 0; j--) {
				System.out.print(rem[j]);
			}
		}
		in.close();
	}

}
