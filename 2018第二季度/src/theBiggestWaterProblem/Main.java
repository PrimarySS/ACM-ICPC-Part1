package theBiggestWaterProblem;

/**
 * ��Ŀ����  
����һ�������������а�����������ɳ³ɳ³��Сħ�ɴ����������б�����������������Ļ����ͼ���������������ֱ����������Ϊֹ�� 
������������ɳ³ɳ³��Сħ�ɴ��������һ��������������λ�ϵ����ֽ��мӺͣ��õ��µ����� 
�����������Ǹ�λ���Ļ�����ô��������������

��������:
��һ����������n(1<=n<=1e9)��

�������:
�����n��������������������
ʾ��1 
����
12
���
3

˵��
12 -> 1 + 2 = 3
ʾ��2 
����
38
���
2
˵��
38 -> 3 + 8 = 11 -> 1 + 1 = 2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();
			while (n >= 10) {
				n = goOn(n);
			}
			System.out.println(n);
		}
		cin.close();
	}

	private static int goOn(int n) {
		int temp = n;
		int rem = 0;
		int resverse = 0;

		while (temp > 0) {
			rem = temp % 10;
			resverse += rem;
			temp /= 10;
		}
		return resverse;
	}

}
