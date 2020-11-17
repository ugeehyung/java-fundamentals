package QUIZ;

import java.util.Scanner;

public class B01_WonToDollar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("환전할 돈을 입력해주세요 > ");
		
		float won = sc.nextInt();
		
		System.out.printf("달러: %.2f$\n", (won * 0.00088 / 1.75));
		
	}

}

