package �����߷���Ŀ;

/**
 * ��Ŀ����
��һ��X*Y������С��Ҫ�ڴ������ϴ����Ͻǵ����½ǣ�ֻ���߸����ֻ�����һ������ߡ������һ���㷨������С���ж������߷���
��������������int x,int y���뷵��С�ŵ��߷���Ŀ��

��������:
�������һ�У����Ÿ���������������x��y��ȡֵ��Χ[1,10]��

�������:
�������һ�У�Ϊ�߷�����Ŀ��

ʾ��1 
����
3 2
���
10

������

	(x * y)��������һ��·��������(x + y)����·����Ŀ=(x + y)! /(x! * y!)
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int x = cin.nextInt(); // ��������ĺ���
			int y = cin.nextInt(); // �������������

			// �涨x,y�ķ�Χ
			if (x > 10 || x < 1 || y > 10 || y < 1) {
				break;
			}

			// ���·������
			System.out.println(sum(x + y) / (sum(x) * sum(y)));
		}
		cin.close();
	}

	/**
	 * ���ܣ�����׳�
	 * 
	 * @param s
	 *            �׳˵ķ�Χ
	 * @return ���ؽ׳˵�ֵ
	 */
	private static long sum(int s) {
		long sum = 1;
		for (int i = 1; i <= s; i++) {
			sum *= i;
		}
		return sum;
	}
}
