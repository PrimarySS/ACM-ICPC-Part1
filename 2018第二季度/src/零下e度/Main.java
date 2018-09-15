package 零下e度;

/**
 * 求给定一个数n，求出最接近n!/e的整数 

输入描述:
一行一个整数n
1<=n<=10^8

输出描述:
一行一个整数，即题目描述中所求，由于这个数字可能很大，我们只需要知道mod 998244353后的结果

示例1 
输入
6
输出
265
示例2 
输入
87
输出
158005593
示例3 
输入
16777216
输出
16065816
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n = (int) in.nval;
		long ans = 0;
		for (int i = 2; i <= n; i++) {
			if ((i & 1) > 0)
				ans = i * ans - 1;
			else
				ans = i * ans + 1;
			ans %= 998244353;
		}
		out.println(ans % 998244353);
		out.flush();
	}
}