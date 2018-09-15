package ����;

/**
 * ��Ŀ������
 * 
 * ΢�����и��Գơ�����V���ļһÿ�����Ӵߴ���ũ�ǰ�ϧ�������˯�����������ڱ����Լ���ϢҲ���Ǻܹ��ɣ��������Ӳ�����ʱ��һ�����ӵĵ����Ǹ�������ʱ������ģ����������ĳ�������ã���ô���������͵����Ǹ�������������������㣬������һ�������������⣬��Ȼһ����24Сʱ����ȴ��ֻ�ں������1~12�¡�������23:00���ӣ����ǡ���������������������������������23:01�ͻ��ǡ���������������������������������ҹ00:00������12:00�ڼ䣨�˵�ʱ��������ڣ��������ǲ��õġ� 
���������д�����򣬸��ݵ�ǰʱ����������ӡ�
�����ʽ�� 
�����һ�а��ա�hh:mm���ĸ�ʽ������ǰʱ�䡣����hh��Сʱ����00��23֮�䣻mm�Ƿ��ӣ���00��59֮�䡣 
�����ʽ�� 
���ݵ�ǰʱ����������ӣ�����һ���������Ӧ��������Dang����������������ڣ��������
Only hh:mm.  Too early to Dang.
���С�hh:mm���������ʱ�䡣 
��������1��
19:05
�������1��
DangDangDangDangDangDangDangDang
��������2��
07:05
�������2��
Only 07:05.  Too early to Dang.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.next();

			int hh = (str.charAt(0) - '0') * 10 + str.charAt(1) - '0';
			int mm = (str.charAt(3) - '0') * 10 + str.charAt(4) - '0';

			if (hh <= 12 && mm == 0) {
				System.out.println("Only " + str + ".  Too early to Dang.");
			} else {
				for (int i = 0; i < hh - 12; i++) {
					System.out.print("duang");
				}
				if (mm > 0) {
					System.out.println("duang");
				}
			}
		}
		in.close();
	}
}
