package QUIZ;

import java.util.Scanner;

public class B10_GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ��� > ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ��� > ");
		int num2 = sc.nextInt();

		for (int i = num1; i>0; --i) {
			if (num1 % i == 0 ) {
				if(num2 % i == 0) {
					System.out.println("�ִ����� > " + i);
					break;
				}
			}
		}
	}
}

