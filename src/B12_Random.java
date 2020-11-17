import java.util.Random;

public class B12_Random {

	public static void main(String[] args) {

		//Java���� ������ ���� �����ϱ�

		//1. Math.random() : double Ÿ���� 0 <= x < 1 �� ���� �Ҽ��� �����Ѵ�.
		//�� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�.

		//���ϴ� ���ڸ� ����� ���� (ex. 80~100)
		//(1) ���ϴ� ������ "����"�� ���Ѵ�(*)
		//	0 * 21 <= x <= 1 * 21
		//(2) ���ϴ� ���� �� "���� ���� ����"�� ���Ѵ�(+)
		//	0 + 80 <= x <= 21 + 80
		//(3) �Ҽ��� �Ʒ��� �����Ѵ�(int)

		//for (int i = 0; i < 100; ++i) {
		//	System.out.println(i + ". " + (int)(Math.random()*21 + 80));
		//}
		
		// 2. Random Ŭ����
		// ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�.
		// ���� �õ��ȣ�� �����ϸ� ���� ���� ���´�.
		// �õ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�.
		// ���ο� ���� �õ� ����
		Random ran2 = new Random();
		Random ran30 = new Random();
		Random ran80 = new Random();
		
		//Random.nextInt(bound) : ���ϴ� ������ ������ ��ȯ�Ѵ�.
		//0~bound �̸��� ������ ��ȯ�Ѵ�.
		//bound�� �������� ������ int �������� ���� ������ ���õȴ�.
		ran30.nextInt(30); // 0~29
		ran2.nextInt(2); // 0~1
		
		System.out.println("ran30 : " + ran30.nextInt(30));
		System.out.println("ran2: " + ran2.nextInt(2));
		System.out.println("ran80: " + ran80.nextInt(21)+80);//80~100
		
		//QUIZ: 3000�̻� 5000���� ���� ������ 100�� �̰� �׵��� ���Դ� ���� ū ���� ���� ���� ���� ����ϼ���.
		int max = 3000;
		int min = 5000;		

		for (int i = 0; i < 100; ++i) {
			int n = (int)(Math.random()*2001 + 3000);
			System.out.println(n);
			if (max < n) {
				max = n;
			}//max = Math.max(max,n);
			if (min > n) {
				min = n;
			}//min = Math.min(min,n);
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
