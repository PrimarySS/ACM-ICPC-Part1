package ������λ��;

/**
 * ��Ŀ������
 * 
 * ÿ��PAT�����ڲμӿ���ʱ���ᱻ����������λ�ţ�һ�����Ի���λ��һ���ǿ�����λ����������£��������볡ʱ�ȵõ��Ի���λ���룬���������Ի�״̬��ϵͳ����ʾ�ÿ����Ŀ�����λ���룬����ʱ������Ҫ����������λ����������Щ�����ٵ��ˣ��Ի��Ѿ�����������ֻ�������쵽���Ի���λ�����������㣬�Ӻ�̨������ǵĿ�����λ���롣 
�����ʽ�� 
�����һ�и���һ��������N��<=1000�������N�У�ÿ�и���һ����������Ϣ����׼��֤�� �Ի���λ�� ������λ�š�������׼��֤����14λ������ɣ���λ��1��N��š����뱣֤ÿ���˵�׼��֤�Ŷ���ͬ�������κ�ʱ�򶼲���������˷��䵽ͬһ����λ�ϡ� 
������Ϣ֮�󣬸���һ��������M��<=N�������һ���и���M������ѯ���Ի���λ���룬�Կո�ָ��� 
�����ʽ�� 
��Ӧÿ����Ҫ��ѯ���Ի���λ���룬��һ���������Ӧ������׼��֤�źͿ�����λ���룬�м���1���ո�ָ��� 
����������
4
10120150912233 2 4
10120150912119 4 1
10120150912126 1 3
10120150912002 3 2
2
3 4
���������
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
