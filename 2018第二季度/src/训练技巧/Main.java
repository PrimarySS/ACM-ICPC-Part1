package 训练技巧;

/**
 * 题目描述  
常州大学组织了新生寒假训练一共N天，每天训练可以获得的训练效果是Ei。但是如果连续训练超过K天，萌新们会受不了而被劝退。 
现在负责人想知道，如何安排能保证萌新不会被劝退并且能获得最大的训练效果。
 
输入描述:
第一行：两个用空格隔开的整数：N和K，1≤N≤100000，1≤K≤N
第二行到N+1行：第i+1行有一个整数，表示第N天的训练效果是Ei，(0 <= Ei <= 1,000,000,000）

输出描述:
第一行：单个整数，表示最大的能力之和
示例1 
输入
5 2 
1
2
3
4 
5
输出
12
说明
（除了第三天以外每天都在训练，总训练效果为1+2+4+5=12）
备注:
1≤n≤100,000
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // 培训天数
			int k = cin.nextInt(); // 最大连续培训天数

			// 存储每天的培训能量值
			BigInteger[] energy = new BigInteger[n];
			for (int i = 0; i < energy.length; i++) {
				energy[i] = cin.nextBigInteger();
			}

			// 计算不连续k天上课的最大能量值
			boolean flag = true;
			BigInteger maxEnergy = BigInteger.ZERO;
			int p = 0;
			while (p < energy.length) {
				int q = 1; // 控制最大连续培训天数
				while (q <= k) {
					maxEnergy = maxEnergy.add(energy[p]);
					q++;
					p++;
					if (p > energy.length - 1) {
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
				p++;
			}

			System.out.println(maxEnergy);
		}
		cin.close();
	}

}
