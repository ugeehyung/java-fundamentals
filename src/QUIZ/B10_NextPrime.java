package QUIZ;

import java.util.Scanner;

public class B10_NextPrime {

	public static void main(String[] args) {

		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = new Scanner(System.in).nextInt();
		
		for (int i = num; true; ++i) { //i=�Ҽ����� �׽�Ʈ�ϴ� ����
			int count = 0;
			for (int j = 2; j <= Math.sqrt(i); ++j) { //j=i�� 2���� i�����ٱ��� �ѹ��� �� ���� ����
				if (i % j == 0) {
					count++;
				}		
			}
			if (count == 0) {
				System.out.print(num + "�̻��� �Ҽ��� " + i);
				break;
			}
		}
	}
}
