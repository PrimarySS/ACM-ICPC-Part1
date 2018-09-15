package ����e��;

/**
 * �����һ����n�������ӽ�n!/e������ 

��������:
һ��һ������n
1<=n<=10^8

�������:
һ��һ������������Ŀ��������������������ֿ��ܴܺ�����ֻ��Ҫ֪��mod 998244353��Ľ��

ʾ��1 
����
6
���
265
ʾ��2 
����
87
���
158005593
ʾ��3 
����
16777216
���
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