package 膨胀的牛牛;

import java.util.HashSet;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			int A = in.nextInt();
			HashSet<Integer> set = new HashSet<Integer>();
			// 把所有a_i存到set集合中
			for (int i = 0; i < n; i++) {
				int a_i = in.nextInt();
				set.add(a_i);
			}
			// 当且仅当此 set 包含一个满足的 e 元素时，返回 true
			while (set.contains(A)) {
				A *= 2;
			}
			System.out.println(A);
		}
		in.close();
	}
}
