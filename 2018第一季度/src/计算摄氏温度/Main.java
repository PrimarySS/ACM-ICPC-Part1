package ���������¶�;

/**
 * �}Ŀ������
 * 
 * ����һ�������¶�F������Ҫ���д���򣬼����Ӧ�������¶�C�����ü��㹫ʽ��C = 5*(F-32)/9����Ŀ��֤����������������ͷ�Χ�ڡ�
�����ʽ�� 
������һ���и���һ�������¶ȡ� 
�����ʽ�� 
��һ���а��ո�ʽ��Celsius = C�������Ӧ�������¶�C������ֵ�� 
����������
150
���������
Celsius = 65
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int F = in.nextInt();
			System.out.println("Celsius = " + 5 * (F - 32) / 9);
		}
		in.close();
	}

}
