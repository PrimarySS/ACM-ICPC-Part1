package a����b;

/**
 * ��Ŀ����
����Ҫ�����A/B������A�ǲ�����1000λ����������B��1λ������������Ҫ�������Q������R��ʹ��A = B * Q + R������

��������:
������1�������θ���A��B���м���1�ո�ָ���

�������:
��1�����������Q��R���м���1�ո�ָ���

��������:
123456789050987654321 7

�������:
17636684150141093474 3
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			BigInteger A = in.nextBigInteger();
			BigInteger B = in.nextBigInteger();

			System.out.println(A.divide(B) + " " + A.mod(B));

		}
		in.close();
	}

}
