package QUIZ;

import java.util.Scanner;

public class B01_WonToDollar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ȯ���� ���� �Է����ּ��� > ");
		
		float won = sc.nextInt();
		
		System.out.printf("�޷�: %.2f$\n", (won * 0.00088 / 1.75));
		
	}

}

