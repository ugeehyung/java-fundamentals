package QUIZ;

import java.util.Scanner;

public class B10_GCD2 {
	
	//유클리드 호제법

	public static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}else {
			return gcd(num2, num1%num2);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요 > ");
		int num1 = sc.nextInt();
		System.out.print("숫자2를 입력하세요 > ");
		int num2 = sc.nextInt();
		
		int gcd = gcd(num1,num2);
		System.out.println("최대공약수 > " + gcd);
		System.out.println("최소공배수 > " + num1*num2/gcd);
	}
}
