package 竞赛技巧;

/**
 * 题目描述  
在ACM竞赛中，当遇到有两个队伍（人） 解出相同的题目数量的时候，我们需要通过他们解决问题的总时间进行排序。 
一共有 N(1<=N<=5,000)条时间被以时(0<=Hours<=99)， 分(0<=Minutes<=59)，秒(0<=Seconds<=59)的形式记录。 
你必须要把他们按时，分，秒排序为 升序，最少的时间最先。 考虑到如下的样例，这三个解出相同题目数量的时间为 

输入描述:
第 1 行，一个整数 N 第 2~n+1 行，每行 3 个整数，表示时，分，秒

输出描述:
共 n 行，每行 3 个整数，表示排序完后的结果

示例1 
输入
3 
11 20 20
11 15 12
14 20 14
输出
11 15 12 
11 20 20 
14 20 14
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // 输入时间个数
			// 输入n个时间的信息
			int[] time = new int[n]; // 存放总h
			int i = 0;
			while (i < n) {
				// 计算第i总时间s
				time[i] = cin.nextInt() * 3600 + cin.nextInt() * 60 + cin.nextInt();
				i++;
			}
			// 从小到大排序时间
			for (int j = 0; j < time.length; j++) {
				for (int k = j + 1; k < time.length; k++) {
					if (time[j] > time[k]) {
						int temp = time[j];
						time[j] = time[k];
						time[k] = temp;
					}
				}
			}
			// 从小到达输出时间
			for (int j = 0; j < time.length; j++) {
				int h = (int) time[j] / 3600;
				int m = (int) (time[j] - 3600 * h) / 60;
				int s = (int) time[j] - (h * 3600 + m * 60);
				System.out.println(h + " " + m + " " + s);
			}
		}
		cin.close();
	}

}
