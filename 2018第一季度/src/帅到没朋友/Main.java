package ˧��û����;

/**
 * �����ʽ�� 
�����һ�и���һ��������N��<=100��������֪����Ȧ�ĸ��������N�У�ÿ�����ȸ���һ��������K��<=1000����Ϊ����Ȧ�е�������Ȼ���г�һ������Ȧ�ڵ������ˡ���Ϊ���������ÿ�˶�Ӧһ��ID�ţ�Ϊ5λ���֣���00000��99999����ID���Կո�ָ���֮�����һ��������M��<=10000����Ϊ����ѯ�����������һ�����г�M������ѯ��ID���Կո�ָ��� 
ע�⣺û�����ѵ��˿����Ǹ���û��װ������Ȧ����Ҳ������ֻ���Լ�һ����������Ȧ���ˡ���Ȼ�и�����������Լ����Լ������ӽ�����Ȧ������Ŀ��֤����K����1������Ȧ�ﶼ������2����ͬ���ˡ�
�����ʽ�� 
�������˳�������Щ˧��û���ѵ��ˡ�ID����1���ո�ָ����е���β�����ж���ո����û����̫˧���������No one is handsome���� 
ע�⣺ͬһ���˿��Ա���ѯ��Σ���ֻ���һ�Ρ�
��������1��
3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
8
55555 44444 10000 88888 22222 11111 23333 88888
�������1��
10000 88888 23333
��������2��
3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
4
55555 44444 22222 11111
�������2��
No one is handsome
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {

			Map<Integer, Integer> map = new HashMap<>();
			int n = in.nextInt();
			int key = 0;
			for (int i = 0; i < n; i++) {
				int ni = in.nextInt();
				for (int j = 0; j < ni; j++) {
					key++;
					int id = in.nextInt();
					map.put(key, id);
				}
			}
			boolean flag = true;
			int m = in.nextInt();

			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				int checkId = in.nextInt();
				if (!map.containsValue(checkId)) {
					flag = false;
					if (!list.contains(checkId)) {
						list.add(checkId);
					}
				}
			}
			for (int i = 0; i < list.size(); i++) {
				if (i < list.size() - 1)
					System.out.print(list.get(i) + " ");
				else
					System.out.println(list.get(i));
			}
			if (flag) {
				System.out.println("No one is handsome");
			}
		}
		in.close();
	}
}
