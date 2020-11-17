package QUIZ;

import java.util.Scanner;

public class B01_CelToFahr {

	public static void main(String[] args) {

		//섭씨온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램 (소수 첫째 자리까지)

		Scanner sc = new Scanner(System.in);

		System.out.print("섭씨 온도: ");

		float celcius = sc.nextInt();

		System.out.printf("화씨 온도: %.1f℉", (celcius * 5 / 9 + 32));

	}

}
