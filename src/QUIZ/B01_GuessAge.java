package QUIZ;

import java.util.Scanner;

public class B01_GuessAge {

	public static void main(String[] args) {

		//사용자로부터 올해의 년도와 태어난 년도를 입력받으면 한국 나이를 계산하여 몇 살인지 알려주는 프로그램

		Scanner sc = new Scanner(System.in);

		System.out.print("올해의 년도를 입력하시오: ");
		int this_year = sc.nextInt();

		System.out.print("태어난 년도를 입력하시오: ");
		int birth_year = sc.nextInt();

		System.out.println("한국 나이: " + (this_year - birth_year + 1));

	}

}
