package ���С��;

/**
 * ��Ŀ����
��һƬ1000*1000�Ĳݵأ�С�׳�ʼվ��(1,1)(�����Ͻǵ�λ��)��С����ÿһ��������������ƶ������ڵĲݵ��ϳԲ�(С�ײ����߳��߽�)��
���ɳ�����ȥ��׽�ɰ���С�ף���������n�����塣��i�����屻�����ں�����Ϊxi ��������Ϊyi ��λ���ϣ�С��һ������һ�����壬
���ᱻ������׽����Ϊ��ȥ���С�ף���Ҫ֪��С�����ٶ�������ܻ�����һ�����壬�Ӷ���ǰ���С�ס�

��������:
��һ��Ϊһ������n(n �� 1000)����ʾ����һ��ӵ��n�����塣
�ڶ�����n������xi����ʾ��i������ĺ�����
��������n������yi����ʾ��i�������������
��֤���궼�ڲݵط�Χ�ڡ�

�������:
���һ������,��ʾС�����ٿ��ܶ���������볬��������

ʾ��1 
����
3
4 6 8
1 2 1
���
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // ����ĸ���

			// �洢�������������
			int[] x = new int[n];
			int[] y = new int[n];

			// �洢���������
			for (int i = 0; i < x.length; i++) {
				x[i] = cin.nextInt();
			}

			// �洢����������
			for (int i = 0; i < y.length; i++) {
				y[i] = cin.nextInt();
			}

			// ���С�׵�����������������
			int[] path = new int[n];
			for (int i = 0; i < n; i++) {
				path[i] = (x[i] - 1) + (y[i] - 1);
			}

			// ���С�׵��������С·��
			int minPath = path[0];
			for (int i = 1; i < path.length; i++) {
				if (path[i] < minPath) {
					minPath = path[i];
				}
			}

			System.out.println(minPath);

		}
		cin.close();
	}
}
