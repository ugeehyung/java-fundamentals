package QUIZ;

import java.util.Scanner;

public class B01_CelToFahr {

	public static void main(String[] args) {

		//�����µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷� (�Ҽ� ù° �ڸ�����)

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �µ�: ");

		float celcius = sc.nextInt();

		System.out.printf("ȭ�� �µ�: %.1f��", (celcius * 5 / 9 + 32));

	}

}
