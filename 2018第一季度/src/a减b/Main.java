package a��b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * �����ʽ�� 
������2�����Ⱥ�����ַ���A��B�����ַ����ĳ��ȶ�������104�����ұ�֤ÿ���ַ��������ɿɼ���ASCII��Ϳհ��ַ���ɣ�
����Ի��з������� 
�����ʽ�� 
��һ���д�ӡ��A-B�Ľ���ַ����� 

����������
I love GPLT!  It's a fun game!
aeiou
���������
I lv GPLT!  It's  fn gm!
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (bf.ready()) {
			String s = bf.readLine();
			String ss = bf.readLine();

			System.out.println(s.replaceAll("[" + ss + "]", ""));
		}
		cin.close();
	}

}
