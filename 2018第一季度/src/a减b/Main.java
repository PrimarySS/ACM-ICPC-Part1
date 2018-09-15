package a减b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 输入格式： 
输入在2行中先后给出字符串A和B。两字符串的长度都不超过104，并且保证每个字符串都是由可见的ASCII码和空白字符组成，
最后以换行符结束。 
输出格式： 
在一行中打印出A-B的结果字符串。 

输入样例：
I love GPLT!  It's a fun game!
aeiou
输出样例：
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
