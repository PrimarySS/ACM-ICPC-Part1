package n��������ִ������ڵ���nһ�����;

/**
 * ��Ŀ����
����n��������������ִ������ڵ������鳤��һ�������
��������:
ÿ������������� n���ո�ָ��n��������n������100��������һ���������ִ������ڵ���n/2��
�������:
������ִ������ڵ���n/2������
ʾ��1 
����
3 9 3 2 5 6 7 3 2 3 3 3
���
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String[] nums = null; // �����ַ�������
			nums = cin.nextLine().split(" "); // �����ַ������飬�ÿո�ֿ�
			int[] num = new int[nums.length]; // �����ַ������鳤�ȵ���������

			// ��String�ַ������鳤�ȵ�int��������
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.valueOf(nums[i]);
			}

			// ͳ�����ֳ��ִ���
			for (int i = 0; i < num.length; i++) {
				int count = 0;
				for (int j = i; j < num.length; j++) {
					if (num[i] == num[j]) {
						count++;
					}
				}
				// ������ִ������ڵ���n/2����
				if (count >= (num.length / 2)) {
					System.out.println(num[i]);
					break;
				}
			}
		}
		cin.close();
	}

}
