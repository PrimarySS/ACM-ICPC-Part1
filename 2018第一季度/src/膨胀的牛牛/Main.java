package 膨胀的牛牛;

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
			// 把所有a_i存到set集合中
			for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
				BigInteger a_i = in.nextBigInteger();
				set.add(a_i);
			}
			// 当且仅当此 set 包含一个满足的 e 元素时，返回 true
			while (set.contains(A)) {
				A = A.add(A);
			}
			System.out.println(A);
		}
		in.close();
	}
}
