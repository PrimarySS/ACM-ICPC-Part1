package filenameExtension;

/**
 * ��Ŀ����
Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
��������:
��������Ϊһ���ļ�·��
�������:
����ÿ������ʵ����Ҫ�������Ӧ��filename extension
ʾ��1 
����
Abc/file.txt
���
txt
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String str = cin.nextLine();

			if (!str.contains(".")) {
				System.out.println("null");
			} else {
				System.out.println(str.substring(str.lastIndexOf(".") + 1, str.length()));
			}
		}
		cin.close();
	}

}
