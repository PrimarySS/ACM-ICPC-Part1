package �����еĺ�;

/**
 * ��Ŀ����
���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
��������:
���������ж��飬ÿ��ռһ�У�����������n��n < 10000����m(m < 1000)��ɣ�n��m�ĺ�����ǰ������
�������:
����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����
ʾ��1 
����
81 4
2 2
���
94.73
3.41
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // ���еĵ�һ��
			int m = cin.nextInt(); // ǰm��

			double sum = 0; // ǰm��ĺ�
			double ni = n; // ��i��ĺ�
			for (int i = 0; i < m; i++) {
				sum += ni;
				ni = Math.sqrt(ni);
			}
			System.out.println(String.format("%.2f", sum)); // ���ǰm��ĺ�
		}
		cin.close();
	}

}
