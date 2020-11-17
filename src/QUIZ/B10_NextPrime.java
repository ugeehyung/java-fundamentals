package QUIZ;

import java.util.Scanner;

public class B10_NextPrime {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 > ");
		int num = new Scanner(System.in).nextInt();
		
		for (int i = num; true; ++i) { //i=소수인지 테스트하는 숫자
			int count = 0;
			for (int j = 2; j <= Math.sqrt(i); ++j) { //j=i를 2부터 i제곱근까지 한번씩 다 나눌 숫자
				if (i % j == 0) {
					count++;
				}		
			}
			if (count == 0) {
				System.out.print(num + "이상의 소수는 " + i);
				break;
			}
		}
	}
}
