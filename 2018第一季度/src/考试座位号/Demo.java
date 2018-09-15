package ¿¼ÊÔ×ùÎ»ºÅ;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			long[] idArr = new long[1001];
			int[] numArr = new int[1001];

			int N = in.nextInt();                                                      
			for (int i = 0; i < N; i++) {
				long id = in.nextLong();                                            
				int index = in.nextInt();
				int num = in.nextInt();

				idArr[index] = id;
				numArr[index] = num;
			}

			int M = in.nextInt();
			int[] arr = new int[M];
			for (int i = 0; i < M; i++) {
				arr[i] = in.nextInt();
				System.out.println(idArr[arr[i]] + " " + numArr[arr[i]]);
			}

		}
		in.close();
	}

}
