package �ڻ���ţţ;

/**
 * ��Ŀ������
 * ţţ��úڻ���,��Ҫ�ݻٵ����򡣵��������˿�����������������롣ţţ������һ���ַ���S,ţţ���ǵô�S��ȥ��һ���ַ���ǡ������ȷ������,�����ţţ����������Ҫ���Զ��ٴ����롣
��������ʾS = "ABA",3�����ܵ�������"BA", "AA", "AB".
��S = "A", ţţΨһ���Գ��Ե�������һ���յ�����,�������1. 
��������:
�������һ���ַ���S,�ַ�������length(1 �� length �� 50),���ж��Ǵ�'A'��'Z'�Ĵ�д��ĸ��


�������:
���һ������,��ʾţţ�����Ҫ���Ե����������

��������1:
ABA

�������1:
3
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String str = in.nextLine();

			int len = str.length();
			// ��S = "A", ţţΨһ���Գ��Ե�������һ���յ�����,�������1.
			if (len == 1) {
				System.out.println(1);
			} else {
				// ��s>1ʱ,���Զ������
				Map<Integer, String> map = new HashMap<Integer, String>();
				for (int i = 1; i <= len; i++) {
					String s = str.substring(0, i - 1) + str.substring(i, len);
					// ���map������û�д��ַ�������뼯����
					if (!map.containsValue(s)) {
						map.put(i, s);
					}
				}
				System.out.println(map.size());
			}
		}
		in.close();
	}

}
