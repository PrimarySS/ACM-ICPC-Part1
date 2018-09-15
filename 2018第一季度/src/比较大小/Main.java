package 比较大小;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int[] arr = new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int t = arr[j];
						arr[j] = arr[i];
						arr[i] = t;
					}
				}
			}
			System.out.println(arr[0] + "->" + arr[1] + "->" + arr[2]);
		}
		in.close();
	}

}
