package ͬ���칹��;

/**
 * ��Ŀ����  
��ѧ�ϣ�ͬ���칹����һ������ͬ����ʽ���в�ͬ��ԭ�����еĻ�����򵥵�˵�������������ͬ����ʽ�������в�ͬ�ṹ�����󣬽���ͬ���칹����
����һ����n����n��̼������������̼���⡢̼̼������̼�ⵥ�������ɣ���ͬ���칹�����Ŀn=3,4,5����ͼ��ʾ 

��������:
����һ����n(n<=9)
�������:
һ��������ʾ��
ʾ��1 
����
3
���
1
ʾ��2 
����
4
���
2
ʾ��3 
����
5
���
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			if (n >= 1 && n <= 9) {
				if (n >= 1 && n <= 3)
					System.out.println(1);
				else if (n == 4)
					System.out.println(2);
				else if (n == 5)
					System.out.println(3);
				else if (n == 6)
					System.out.println(5);
				else if (n == 7)
					System.out.println(9);
				else if (n == 8)
					System.out.println(18);
				else
					System.out.println(35);
			}
		}
		cin.close();
	}
}
