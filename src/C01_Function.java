import java.util.Arrays;

public class C01_Function {

	//�Լ�(function)
	//����� �̸� �����صΰ� ���߿� ������ ���� ��
	//�Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� �Լ��� ���� ����� ��ȯ�ȴ�.
	//������ ���ɼ��� �ִ� ����� �̸� ����� �۾��� �ݺ��� ���δ�.
	//EX:
	
	
	//��� ���� �ʿ��� �ٱ��� ����
	public static int appleBasket(int appleNum, int basketSize) {
		int result;
		if (appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize +1;
		}
		return result;
	}
	
	
	//���� �� ����
	public static int cheapPrice(int[] prices) {
		int min =0;
		for (int i=0; i<prices.length; ++i) {
			if (i == 0) {
				min = prices[i];
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return min;
	}
	
	
	//��հ���
	public static double avgPrice(int[] prices) {
		int sum=0;
		for (int i=0; i<prices.length; ++i) {
			sum+= prices[i];
		}
		return sum/ (double) prices.length;
	}
	
	
	//10000�� ���� ����
	public static void raisePrice(int[] prices) { //void: return����
		for(int i=0; i<prices.length; ++i) {
			prices[i] += 10000;
		}
	}
	
	
	public static void main(String[] args) {

		int count = appleBasket(25,10);
		System.out.println("�ٱ��� ����: " + count);
		
		count = appleBasket(33,8);
		System.out.println("�ٱ��� ����2: " + count);
		
		int[] apples = {1000, 2000, 989, 1100, 990};
		System.out.println("cheap price: " + cheapPrice(apples));
		System.out.println("avg price: " + avgPrice(apples));

		raisePrice(apples);
		System.out.println("����+10000: " +Arrays.toString(apples));
		
			
	}
}