package ����;

/**
 * ��Ŀ������
 * 
 * �����������������������������壻����������������������������һ������������1��7��Ӧ����һ�������ա�����ĳһ�죬�����������ġ����족�����ڼ��� 
�����ʽ�� 
�����һ�и���һ��������D��1 <= D <=7���������������ĳһ�졣 
�����ʽ�� 
��һ�������D��ĺ��������ڼ��� 
����������
3
���������
5
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int D = in.nextInt();

			if (D >= 1 && D <= 5) {
				System.out.println(D + 2);
			} else {
				if (D == 6) {
					System.out.println(1);
				} else {
					System.out.println(2);
				}
			}
		}
		in.close();
	}

}
