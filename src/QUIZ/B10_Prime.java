package QUIZ;

import java.util.Scanner;

public class B10_Prime {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 > ");
		int num = new Scanner(System.in).nextInt();
		
		if(num < 0) {
			System.out.print("양수를 입력하세요");

		} else {
			for (int i = 2 ; i <= num; ++i) { //i=소수인지 테스트하는 숫자
				int count = 0;
				for (int j = 1; j <= i; ++j) { //j=i를 1부터 i까지 한번씩 다 나눌 숫자
					if (i % j == 0) {
						count++;
					}		
				}
				if (count == 2) {
					System.out.print(i + "는 소수입니다.\n");
				}
			}
		}
	}
}
