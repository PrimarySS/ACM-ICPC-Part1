package ɾ���ַ���;

/**
 * ��Ŀ����
���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ������磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��
��������:
ÿ�������������2���ַ���
�������:
���ɾ������ַ���
ʾ��1 
����
They are students. aeiou
���
Thy r stdnts.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String s = cin.nextLine(); // ���ַ���
			String ss = cin.nextLine(); // ���ַ���
			// �����ַ���Ϊ����   
			Map<Integer, Character> map = new HashMap<Integer, Character>();
			char[] chDad = s.toCharArray(); // �Ѹ��ַ���ת��Ϊ�ַ�������
			// �Ѹ��ַ����浽map��
			for (int i = 0; i < chDad.length; i++) {
				map.put(i, chDad[i]);
			}
			int a = 0;
			while (a < ss.length()) {
				for (int i = 0; i < s.length(); i++) {
					if (ss.charAt(a) == s.charAt(i)) {
						map.remove(i); // �Ƴ��жϹ����ڵ��ַ�����������ĸ���
					}
				}
				a++;
			}
			// ����ɾ�����map
			Set<Integer> Valekey = map.keySet();
			for (Integer integer : Valekey) {
				System.out.print(map.get(integer));
			}
		}
		cin.close();
	}

}
