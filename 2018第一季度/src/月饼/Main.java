package 月饼;

import java.util.Arrays;
import java.util.Scanner;

//设置类用于存储月饼的总价、库存量，以及计算其单价
class moCake implements Comparable<moCake> {
	int totalValue; // 月饼的总价
	int repertories; // 库存总量
	double price; // 每种月饼的计算单位

	@Override
	public int compareTo(moCake m) {
		// 设置月饼的排序为单价从大到小的顺序
		// if (this.price > m.price) {
		// return -1;
		// } else {
		// return 1;
		// }
		return this.price > m.price ? -1 : 1;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 月饼种类数量，以及需求数量
		int num = in.nextInt();
		int requirement = in.nextInt();

		moCake[] mc = new moCake[num];
		for (int i = 0; i < mc.length; i++) {
			// 对对象操作之前，先将其实例化
			mc[i] = new moCake();
			mc[i].repertories = in.nextInt();
		}
		for (int i = 0; i < mc.length; i++) {
			mc[i].totalValue = in.nextInt();
		}
		in.close();
		// 计算每个月饼的单价
		for (int i = 0; i < mc.length; i++) {
			mc[i].price = (double) mc[i].totalValue / mc[i].repertories;
		}
		// 对月饼数组进行排序
		Arrays.sort(mc);

		double earning = 0.0;
		// 从月饼单价最大开始遍历，直接满足需求
		for (int i = 0; i < mc.length; i++) {
			if (requirement > mc[i].repertories) {
				earning += mc[i].totalValue;
				requirement -= mc[i].repertories;
			} else {
				earning += ((double) requirement / mc[i].repertories) * mc[i].totalValue;
				break;
			}
		}
		System.out.printf("%.2f\n", earning);// 格式化输出
	}

}