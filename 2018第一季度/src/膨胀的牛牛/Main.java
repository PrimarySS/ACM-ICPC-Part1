package ���͵�ţţ;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			BigInteger n = in.nextBigInteger();
			BigInteger A = in.nextBigInteger();
			HashSet<BigInteger> set = new HashSet<BigInteger>();
			// ������a_i�浽set������
			for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
				BigInteger a_i = in.nextBigInteger();
				set.add(a_i);
			}
			// ���ҽ����� set ����һ������� e Ԫ��ʱ������ true
			while (set.contains(A)) {
				A = A.add(A);
			}
			System.out.println(A);
		}
		in.close();
	}
}
