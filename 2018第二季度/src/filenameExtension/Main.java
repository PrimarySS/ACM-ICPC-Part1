package filenameExtension;

/**
 * 题目描述
Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
输入描述:
输入数据为一个文件路径
输出描述:
对于每个测试实例，要求输出对应的filename extension
示例1 
输入
Abc/file.txt
输出
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
