package fibonacci����;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int N = cin.nextInt();
			int a = 0; // f[0]
			int b = 1; // f[1]
			int temp = 0;

			// �ҵ�쳲�������NС������쳲��������ʹ������쳲�������
			while (b < N) {
				temp = b;
				b = a + b;
				a = temp;
			}

			// ����N������쳲��������ľ���
			int left = N - a;
			int right = b - N;

			System.out.println(left > right ? right : left);
		}
		cin.close();
	}
}