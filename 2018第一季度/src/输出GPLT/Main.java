package ���GPLT;

/**
 * ��Ŀ������
 * 
 * ����һ�����Ȳ�����10000�ġ�����Ӣ����ĸ���ɵ��ַ������뽫�ַ����µ���˳�򣬰���GPLTGPLT....��������˳������������������ַ�����Ȼ�������ַ��������ִ�Сд���ĸ�����һ����һ����ģ���ĳ���ַ��Ѿ�����꣬�����µ��ַ��԰�GPLT��˳���ӡ��ֱ�������ַ����������
�����ʽ�� 
������һ���и���һ�����Ȳ�����10000�ġ�����Ӣ����ĸ���ɵķǿ��ַ����� 
�����ʽ�� 
��һ���а���ĿҪ������������ַ�������Ŀ��֤����ǿա�
����������
pcTclnGloRgLrtLhgljkLhGFauPewSKgt
���������
GPLTGPLTGLTGLGLL
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (bf.ready()) {
			String str = bf.readLine();
			String newStr = str.toUpperCase();

			int GCount = 0, PCount = 0, LCount = 0, TCount = 0;
			for (int i = 0; i < newStr.length(); i++) {
				if (newStr.charAt(i) == 'G') {
					GCount++;
				} else if (newStr.charAt(i) == 'P') {
					PCount++;
				} else if (newStr.charAt(i) == 'L') {
					LCount++;
				} else if (newStr.charAt(i) == 'T') {
					TCount++;
				}
			}

			while (GCount > 0 || PCount > 0 || LCount > 0 || TCount > 0) {
				if (GCount > 0) {
					System.out.print("G");
					GCount--;
				}
				if (PCount > 0) {
					System.out.print("P");
					PCount--;
				}
				if (LCount > 0) {
					System.out.print("L");
					LCount--;
				}
				if (TCount > 0) {
					System.out.print("T");
					TCount--;
				}
			}
		}
		bf.close();
	}

}
