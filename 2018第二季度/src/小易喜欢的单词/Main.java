package С��ϲ���ĵ���;

/**
 * ��Ŀ����
С��ϲ���ĵ��ʾ����������ԣ�
1.����ÿ����ĸ���Ǵ�д��ĸ
2.����û��������ȵ���ĸ
3.����û�����硰xyxy��(�����x��yָ�Ķ�����ĸ�����ҿ�����ͬ)�����������У������п��ܲ�������

���磺
С�ײ�ϲ��"ABBA"����Ϊ����������������'B'
С�ײ�ϲ��"THETXH"����Ϊ�������������"THTH"
С�ײ�ϲ��"ABACADA"����Ϊ�������������"AAAA"
С��ϲ��"A","ABA"��"ABCBA"��Щ����

����һ�����ʣ���Ҫ�ش�С���Ƿ��ϲ��������ʡ�

��������:
����Ϊһ���ַ��������ɴ�д��ĸ��ɣ�����С��100

�������:
���С��ϲ�����"Likes",��ϲ�����"Dislikes"

ʾ��1 
����
AAA
���
Dislikes
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String str = cin.nextLine(); // �����ַ���

			// ������ʽ�ж��ַ���ÿ����ĸ���Ƿ��д
			if (str.matches("[A-Z]+")) {
				char[] ch = str.toCharArray(); // ת��Ϊ�ַ�������
				getChar(ch); // ����ĸ�������ж�
			} else {
				System.out.println("Dislikes");
			}
		}
		cin.close();
	}

	/**
	 * ���ܣ��ж��ַ����Ƿ�������ȵ���ĸ
	 * 
	 * @param ch
	 *            �ַ�������
	 */
	private static void getChar(char[] ch) {
		boolean flag = false;

		// ֻ��һ����ĸ�����
		if (ch.length == 1) {
			System.out.println("Likes");
		} else {
			for (int i = 0; i < ch.length - 1; i++) {
				// �ж��ַ����Ƿ�������ȵ���ĸ
				if (ch[i] == ch[i + 1]) {
					System.out.println("Dislikes");
					return;
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("Likes");
			}
		}
	}

}
