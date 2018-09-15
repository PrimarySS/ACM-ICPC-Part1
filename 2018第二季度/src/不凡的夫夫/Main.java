package �����ķ��;

/**
 * ��Ŀ����  
�����һ���һ�����ж���λ������Ȥ���������ֲ������������һ����
��������֪����һ������n����n������8�����µ�λ���Ƕ���λ��
��������:
��һ����һ������t(0<t<=1000000)(��ʾt������)
������t�У�ÿһ����һ������n(0<=n<=10000000)
�������:
���n����8�����µ�λ����
ʾ��1 
����
3
4
2
5
���
2
1
3
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // �����������

			BigInteger N = BigInteger.valueOf(n);

			// ����n����
			BigInteger[] a = new BigInteger[n];
			for (BigInteger i = BigInteger.ZERO; i.compareTo(N) < 0; i = i.add(BigInteger.ONE)) {
				a[i.intValue()] = cin.nextBigInteger();
			}

			for (int i = 0; i < a.length; i++) {
				// ��ÿ�����Ľ׳�
				BigInteger s = multiply(a[i]);
				// ��ÿ�����׳˵İ˽���λ��
				System.out.println(OCTNum(s));
			}
		}
		cin.close();
	}

	/**
	 * ���ܣ���׳�
	 * 
	 * @param a
	 *            ��׳˵Ĳ���
	 * @return ���ؽ׳˵Ļ�
	 */
	private static BigInteger multiply(BigInteger a) {
		BigInteger sum = BigInteger.ONE;
		for (BigInteger j = BigInteger.ONE; j.compareTo(a) <= 0; j = j.add(BigInteger.ONE)) {
			sum = sum.multiply(j);
		}
		return sum;
	}

	/**
	 * ����:����Ƶ�λ��
	 * 
	 * @param s
	 *            ����
	 * @return s�� 8���Ƶ�λ��
	 */
	private static int OCTNum(BigInteger s) {
		BigInteger temp = s;
		int count = 0;
		while (temp.compareTo(BigInteger.ZERO) > 0) {
			count++;
			temp = temp.divide(BigInteger.TEN.subtract(BigInteger.ONE).subtract(BigInteger.ONE));
		}
		return count;
	}
}
