package �����ж��;

/**
 * ��Ŀ������
 * 
 * һ�������������ĳ̶ȡ�����Ϊ�������а���2�ĸ�������λ���ı�ֵ�����������Ǹ�������̶�����0.5����
 * ������Ǹ�ż������������1�����������֡�-13142223336���Ǹ�11λ����������3��2�������Ǹ�����Ҳ��ż����
 * �����ķ����̶ȼ���Ϊ��3/11*1.5*2*100%��ԼΪ81.82%��������������һ���������������ж���� 
�����ʽ�� 
�����һ�и���һ��������50λ������N�� 
�����ʽ�� 
��һ�������N�����ĳ̶ȣ�����С�������λ�� 
����������
-13142223336
���������
81.82%
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();
			int count = 0;
			int len = str.length();

			// ͳ��2���ֵĴ���
			for (int i = 0; i < len; i++) {
				if (str.charAt(i) - '0' == 2) {
					count++;
				}
			}
			float per = 0;
			// ��
			if (str.charAt(0) == '-') {
				// ż
				if (str.charAt(len - 1) % 2 == 0) {
					per = (float) ((float) count / (float) (len - 1) * 1.5 * 2 * 100);
				} else {
					// ��ż
					per = (float) ((float) count / (float) (len - 1) * 1.5 * 100);
				}
			} else {
				// �Ǹ�
				// ż
				if (str.charAt(len - 1) % 2 == 0) {
					per = (float) ((float) count / (float) len * 2 * 100);
				} else {
					// ��ż
					per = (float) ((float) count / (float) len * 100);
				}
			}
			System.out.printf("%.2f", per);
			System.out.println("%");
		}
		in.close();
	}

}
