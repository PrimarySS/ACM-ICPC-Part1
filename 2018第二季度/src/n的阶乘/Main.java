package n�Ľ׳�;

/**
 * ��Ŀ����  
����һ������N��0��N��10000������ȡN�Ľ׳�
��������:
����������ݣ�ÿ��������������һ����N
�������:
ÿ����һ�����N�Ľ׳�
ʾ��1 
����
1
2
3
���
1
2
6
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			BigInteger N = BigInteger.valueOf(n);
			BigInteger sum = BigInteger.ONE;
			for (BigInteger j = BigInteger.ONE; j.compareTo(N) <= 0; j = j.add(BigInteger.ONE)) {
				sum = sum.multiply(j);
			}

			System.out.println(sum);
		}
		cin.close();
	}
}
