package ˭�ȵ�;

/***
 * �}Ŀ������
 * 
 * ��ȭ�ǹ����й����Ļ���һ����Ȥ����ɲ��֡����������˻�ȭ�ķ���Ϊ��ÿ�˿��к���һ�����֣�ͬʱ���ֱȻ���һ�����֡����˭�Ȼ������������õ������˺���������֮�ͣ�˭�����ˣ���ҷ�һ���ơ�����ͬӮ������ͬ���������һ�֣�ֱ��Ψһ��Ӯ�ҳ��֡� 
��������ס������˵ľ���������ܺȶ��ٱ��������ͻ�ȭ��¼�������ж�������˭�ȵ���
�����ʽ�� 
�����һ���Ⱥ�����ס������˵ľ�����������100�ķǸ����������Կո�ָ�����һ�и���һ��������N��<=100�������N�У�ÿ�и���һ�ֻ�ȭ�ļ�¼����ʽΪ��
�׺� �׻� �Һ� �һ�
���С������Ǻ��������֣��������ǻ��������֣���Ϊ������100������������ֻ��һ�𻮣��� 
�����ʽ�� 
�ڵ�һ��������ȵ��µ��Ǹ��ˣ�A����ף�B�����ҡ��ڶ��������û�����Ǹ��˺��˶��ٱ�����Ŀ��֤��һ���˵��¡�ע����������˵��¾���ֹ����������ݲ��ش���
����������
1 1
6
8 10 9 12
5 10 5 10
3 8 5 12
12 18 1 13
4 16 12 15
15 1 1 16
���������
A
1
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int Achol = in.nextInt();
			int Bchol = in.nextInt();

			int jia = Achol, yi = Bchol;
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int Asay = in.nextInt();
				int Aaction = in.nextInt();
				int Bsay = in.nextInt();
				int Baction = in.nextInt();
				if (Aaction == Asay + Bsay && Baction != Asay + Bsay) {
					Achol--;
				}
				if (Aaction != Asay + Bsay && Baction == Asay + Bsay) {
					Bchol--;
				}
				// ��һ���˵���ֹͣ
				if (Achol == -1) {
					System.out.println("A\n" + (yi - Bchol));
					break;
				}
				if (Bchol == -1) {
					System.out.println("B\n" + (jia - Achol));
					break;
				}
			}
		}
		in.close();
	}
}
