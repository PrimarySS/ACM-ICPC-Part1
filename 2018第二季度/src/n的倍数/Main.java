package n�ı���;

/**
 * ����һ����n����1��n�У��ж��ٸ�������2 5 11 13�ı����� 
��������:
�����ж�������
ÿ��һ����n��1<=n<=10^18.
�������:
ÿ������������2 5 11 13�ı����������ж��١�
ʾ��1 
����
15
���
4
˵��
1 3 7 9
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			BigInteger n = cin.nextBigInteger();

			BigInteger a = BigInteger.ONE.add(BigInteger.ONE); // 2

			BigInteger b = BigInteger.TEN.divide(a); // 5

			BigInteger c = BigInteger.TEN.add(BigInteger.ONE); // 11

			BigInteger d = a.add(c); // 13

			// ����2 5 11 13�ı���
			BigInteger count = BigInteger.ZERO;

			for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

				if (i.remainder(a) == BigInteger.ZERO || i.remainder(b) == BigInteger.ZERO
						|| i.remainder(c) == BigInteger.ZERO || i.remainder(d) == BigInteger.ZERO) {
					continue;
				} else {
					count = count.add(BigInteger.ONE);
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
