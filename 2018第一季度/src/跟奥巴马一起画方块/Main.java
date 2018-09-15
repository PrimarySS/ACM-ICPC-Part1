package 跟奥巴马一起画方块;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			String ch = in.next();

			String newStr = "";
			for (int i = 0; i < n; i++) {
				newStr += ch;
			}

			for (int i = 0; i < (float) n / (float) 2; i++) {
				System.out.println(newStr);
			}
		}
		in.close();

	}
}
