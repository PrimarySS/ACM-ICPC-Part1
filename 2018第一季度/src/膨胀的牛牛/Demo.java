package ���͵�ţţ;

import java.util.HashSet;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			int A = in.nextInt();
			HashSet<Integer> set = new HashSet<Integer>();
			// ������a_i�浽set������
			for (int i = 0; i < n; i++) {
				int a_i = in.nextInt();
				set.add(a_i);
			}
			// ���ҽ����� set ����һ������� e Ԫ��ʱ������ true
			while (set.contains(A)) {
				A *= 2;
			}
			System.out.println(A);
		}
		in.close();
	}
}
