package �ر�ͼ;

/**
 * ��Ŀ����
ţţ�õ���һ���ر�ͼ��˳�Ųر�ͼ��ָʾ��ţţ������һ���ر��У��ر�������һ�����أ�����ÿ�λ���ʾ�����ַ��� s �� t�����ݹ��ϵĴ�˵��ţţ��Ҫÿ�ζ��ش� t �Ƿ��� s �������С�ע�⣬�����в�Ҫ����ԭ�ַ������������ģ����紮 abc�����������о��� {�մ�, a, b, c, ab, ac, bc, abc} 8 �֡�
��������:
ÿ���������һ������������ÿ�����������������г��Ȳ����� 10 �Ĳ������ո�Ŀɼ� ASCII �ַ�����
�������:
���һ�� ��Yes�� ���� ��No�� ��ʾ�����
ʾ��1 
����
x.nowcoder.com
ooo
���
Yes
 */
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // ���ַ���
			String ss = cin.nextLine(); // ���ַ���

			int a = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ss.charAt(a) == s.charAt(i)) {
					a++;
					if (a == ss.length())
						break;
				}
			}
			if (a == ss.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		cin.close();
	}

}
