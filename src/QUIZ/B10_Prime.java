package QUIZ;

import java.util.Scanner;

public class B10_Prime {

	public static void main(String[] args) {

		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = new Scanner(System.in).nextInt();
		
		if(num < 0) {
			System.out.print("����� �Է��ϼ���");

		} else {
			for (int i = 2 ; i <= num; ++i) { //i=�Ҽ����� �׽�Ʈ�ϴ� ����
				int count = 0;
				for (int j = 1; j <= i; ++j) { //j=i�� 1���� i���� �ѹ��� �� ���� ����
					if (i % j == 0) {
						count++;
					}		
				}
				if (count == 2) {
					System.out.print(i + "�� �Ҽ��Դϴ�.\n");
				}
			}
		}
	}
}
