package QUIZ;

import java.util.Scanner;
//ctrl + shift + o: 자동 import

public class B04_AppleQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 개수를 입력하시오 > ");
		
		int apple_num = sc.nextInt();
		int basket = 10;
		
		if ( apple_num < basket && apple_num > 0) {
			System.out.println("필요한 바구니의 개수는 1개 입니다.");
		}
		else if ( apple_num < 0 ) {
			System.out.println("0 이상의 숫자를 입력하셔야 합니다.");
		}
		else if ( apple_num % basket == 0) {
			System.out.println("필요한 바구니의 개수는 " + apple_num/basket + "개 입니다.");
		}
		else {
			System.out.println("필요한 바구니의 개수는 " + (apple_num/basket + 1) + "개 입니다.");
		}	
	}	
}
