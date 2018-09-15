package ѵ������;

/**
 * ��Ŀ����  
���ݴ�ѧ��֯����������ѵ��һ��N�죬ÿ��ѵ�����Ի�õ�ѵ��Ч����Ei�������������ѵ������K�죬�����ǻ��ܲ��˶���Ȱ�ˡ� 
���ڸ�������֪������ΰ����ܱ�֤���²��ᱻȰ�˲����ܻ������ѵ��Ч����
 
��������:
��һ�У������ÿո������������N��K��1��N��100000��1��K��N
�ڶ��е�N+1�У���i+1����һ����������ʾ��N���ѵ��Ч����Ei��(0 <= Ei <= 1,000,000,000��

�������:
��һ�У�������������ʾ��������֮��
ʾ��1 
����
5 2 
1
2
3
4 
5
���
12
˵��
�����˵���������ÿ�춼��ѵ������ѵ��Ч��Ϊ1+2+4+5=12��
��ע:
1��n��100,000
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt(); // ��ѵ����
			int k = cin.nextInt(); // ���������ѵ����

			// �洢ÿ�����ѵ����ֵ
			BigInteger[] energy = new BigInteger[n];
			for (int i = 0; i < energy.length; i++) {
				energy[i] = cin.nextBigInteger();
			}

			// ���㲻����k���Ͽε��������ֵ
			boolean flag = true;
			BigInteger maxEnergy = BigInteger.ZERO;
			int p = 0;
			while (p < energy.length) {
				int q = 1; // �������������ѵ����
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
