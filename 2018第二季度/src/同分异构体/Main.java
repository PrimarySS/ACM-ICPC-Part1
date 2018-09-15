package 同分异构体;

/**
 * 题目描述  
化学上，同分异构体是一种有相同分子式而有不同的原子排列的化合物。简单地说，化合物具有相同分子式，但具有不同结构的现象，叫做同分异构现象；
输入一个数n，求n个碳的烷烃（仅由碳、氢、碳碳单键与碳氢单键所构成）的同分异构体的数目n=3,4,5如下图所示 

输入描述:
输入一个数n(n<=9)
输出描述:
一个整数表示答案
示例1 
输入
3
输出
1
示例2 
输入
4
输出
2
示例3 
输入
5
输出
3
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			if (n >= 1 && n <= 9) {
				if (n >= 1 && n <= 3)
					System.out.println(1);
				else if (n == 4)
					System.out.println(2);
				else if (n == 5)
					System.out.println(3);
				else if (n == 6)
					System.out.println(5);
				else if (n == 7)
					System.out.println(9);
				else if (n == 8)
					System.out.println(18);
				else
					System.out.println(35);
			}
		}
		cin.close();
	}
}
