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
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // ���ַ���
			String ss = cin.nextLine(); // ���ַ���

			// �жϸ��ַ����Ƿ�������ַ���
			// �����ַ�����һ���ַ�
			if (ss.length() == 1) {
				if (s.contains(ss)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				// �����ַ���Ϊ����
				Map<Integer, Character> map = new HashMap<Integer, Character>();
				char[] chDad = s.toCharArray(); // �Ѹ��ַ���ת��Ϊ�ַ�������
				// �Ѹ��ַ����浽map��
				for (int i = 0; i < chDad.length; i++) {
					map.put(i, chDad[i]);
				}
				char[] chSon = ss.toCharArray(); // �����ַ���ת��Ϊ�ַ�������
				boolean flag = false;
				for (int i = 0; i < chSon.length; i++) {
					if (map.containsValue(chSon[i])) {
						flag = true;
						map.remove(map.get(chSon[i])); // �Ƴ��жϹ����ڵ��ַ�����������ĸ���
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		cin.close();
	}

}
