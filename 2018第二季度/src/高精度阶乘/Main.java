package �߾��Ƚ׳�;

/**
 * ��Ŀ����
�ø߾��ȼ����S=1��+2��+3��+��+n��(n��50)
���С�������ʾ�׳ˣ����磺5��=5*4*3*2*1��

���������ʽ
�����ʽ��
һ��������N��

�����ʽ��
һ��������S����ʾ��������

�����������
��������#1�� ���� 
3
�������#1�� ���� 
9
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			BigDecimal n = cin.nextBigDecimal(); // ����׳�
			BigDecimal sumOfFactorial = BigDecimal.ZERO; // �׳��ܺ�
			// ���ú�������С�׳˵ĺͣ��ټ���ÿ��С�׳˵��ܺ�
			for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
				sumOfFactorial = sumOfFactorial.add(factorial(i));
			}
			System.out.println(sumOfFactorial);
		}
		cin.close();
	}

	/**
	 * ���ܣ�����߾��Ƚ׳�֮��
	 * 
	 * @param i
	 *            ����׳�
	 * @return ���ؽ׳�֮��
	 */
	private static BigDecimal factorial(BigDecimal i) {
		BigDecimal sum = BigDecimal.ONE;
		for (BigDecimal j = BigDecimal.ONE; j.compareTo(i) <= 0; j = j.add(BigDecimal.ONE)) {
			sum = sum.multiply(j);
		}
		return sum;
	}

}
