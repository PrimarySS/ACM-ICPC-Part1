package 添加逗号;

/**
 * 题目描述  
对于一个较大的整数 N(1<=N<=2,000,000,000) 
比如 980364535，我们常常需要一位一位数这个数字是几位数，但是如果在这 个数字每三位加一个逗号，它会变得更加易于朗读。 
因此，这个数字加上逗号成如下的模样：980,364,535请写一个程序帮她完成这件事情 

输入描述:
一行一个整数 N
输出描述:
一行一个字符串表示添加完逗号的结果
示例1 
输入
980364535
输出
980,364,535
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String str = cin.nextLine();
			// 长度范围在[1-3]
			if (str.length() <= 3) {
				System.out.println(str);
			} else {
				// 长度范围在[4-n]
				// 倒置字符串
				str = new StringBuffer(str).reverse().toString();
				String newStr = "";

				// 重做左往右添加逗号
				for (int i = 0; i < str.length(); i++) {
					if (i * 3 + 3 > str.length()) {
						newStr += str.substring(i * 3, str.length());
						break;
					}
					newStr += str.substring(i * 3, i * 3 + 3) + ",";
				}
				// 解除最后一个逗号
				if (newStr.endsWith(",")) {
					newStr = newStr.substring(0, newStr.length() - 1);
				}
				// 将字符串倒置回来
				System.out.println(new StringBuffer(newStr).reverse().toString());
			}
		}
		cin.close();
	}

}
