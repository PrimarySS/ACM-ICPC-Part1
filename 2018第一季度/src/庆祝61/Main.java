package ��ף61;

/**
 * ��Ŀ������
 * ţ��ׯ�׶�԰Ϊ��ף61��ͯ�ھٰ���ף�,��ף�����һ����Ŀ��С������Χ��һ��ԲȦ���衣ţ��ʦ��ѡ��n��С���Ѳ��������Ŀ,��֪ÿ��С���ѵ����h_i��Ϊ�����赸��������г,ţ��ʦ��Ҫ�������ԲȦ����������С���ѵ���߲�����ֵ��С,ţ��ʦ������,ϣ�����ܰ������
��������ʾ:
��ԲȦ���鰴��100,98,103,105˳ʱ�����е�ʱ�������߲�Ϊ5,�������в���õ����ŵĽ� 
��������:
�����������,��һ��Ϊһ��������n(3 �� n �� 20)
�ڶ���Ϊn������h_i(80 �� h_i �� 140),��ʾÿ��С���ѵ���ߡ�


�������:
���һ������,��ʾ���������µ�����С������߲�����ֵ��

��������1:
4
100 103 98 105

�������1:
5
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			int[] h_a = new int[n];
			int[] h_max = new int[n * n];
			for (int i = 0; i < h_a.length; i++) {
				h_a[i] = in.nextInt();
			}

			int k = 0;
			for (int i = 0; i < h_a.length; i++) {
				for (int j = i + 1; j < h_a.length; j++) {
					if (h_a[i] >= h_a[j]) {
						h_max[k] = h_a[i] - h_a[j];
					} else {
						h_max[k] = h_a[j] - h_a[i];
					}
					k++;
				}
			}
			sort(h_max);
			for (int i = 0; i < h_max.length; i++) {
				System.out.println(h_max[i]);
			}
		}
		in.close();
	}

	/**
	 * ���ܣ�����
	 * 
	 * @param a
	 *            ����
	 */
	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
