package 考试座位号;

/**
 * 题目描述：
 * 
 * 每个PAT考生在参加考试时都会被分配两个座位号，一个是试机座位，一个是考试座位。正常情况下，考生在入场时先得到试机座位号码，入座进入试机状态后，系统会显示该考生的考试座位号码，考试时考生需要换到考试座位就座。但有些考生迟到了，试机已经结束，他们只能拿着领到的试机座位号码求助于你，从后台查出他们的考试座位号码。 
输入格式： 
输入第一行给出一个正整数N（<=1000），随后N行，每行给出一个考生的信息：“准考证号 试机座位号 考试座位号”。其中准考证号由14位数字组成，座位从1到N编号。输入保证每个人的准考证号都不同，并且任何时候都不会把两个人分配到同一个座位上。 
考生信息之后，给出一个正整数M（<=N），随后一行中给出M个待查询的试机座位号码，以空格分隔。 
输出格式： 
对应每个需要查询的试机座位号码，在一行中输出对应考生的准考证号和考试座位号码，中间用1个空格分隔。 
输入样例：
4
10120150912233 2 4
10120150912119 4 1
10120150912126 1 3
10120150912002 3 2
2
3 4
输出样例：
10120150912002 2
10120150912119 1
 */
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();

			Map<Integer, BigInteger> map1 = new HashMap<Integer, BigInteger>();
			Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

			for (int i = 0; i < N; i++) {
				BigInteger strValue = in.nextBigInteger();
				int map2key = in.nextInt();
				int map2value = in.nextInt();
				map1.put(map2key, strValue);
				map2.put(map2key, map2value);
			}

			int M = in.nextInt();
			int[] arr = new int[M];
			for (int i = 0; i < M; i++) {
				arr[i] = in.nextInt();
				System.out.println(map1.get(arr[i]) + " " + map2.get(arr[i]));
			}
		}
		in.close();
	}

}
