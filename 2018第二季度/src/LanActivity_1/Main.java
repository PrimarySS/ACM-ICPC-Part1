package LanActivity_1;

/**
 * ú����Ŀ

��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��

������

	n = 1	s1 = 1
	n = 2	s2 = s1 + 2
	n = 3	s3 = s2 + 3 = s1 + 2 + 3
	n = 4	s4 = s3 + 4 = s1 + 2 + 3 + 4
	n = 5	s5 = s4 + 5 = s1 + 2 + 3 + 4 + 5
	...		...
	n = 100	s100 = s1 + 2 + 3 + 4 + 5 + ... +100
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); // ����ڼ���
			int s1 = 1, d = 1;
			int sum = s1 * n + (n * (n - 1) * d) / 2; // �Ȳ�������͹�ʽ
			System.out.println(sum);
		}
		cin.close();

	}

}
