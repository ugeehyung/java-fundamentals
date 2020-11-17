package QUIZ;

import java.util.Scanner;

public class B11_ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();//()안에 진법을 입력하면 다른 진법 사용가능. 10진수여서 10
		
		String str = Integer.toString(num);
		int n = str.length();
		int i = n;
		while (--i >= 0) {
			System.out.print(str.charAt(i));
		}
		System.out.println();


		while(1 <= num) {
			int remain = (num % 10); 
			System.out.print(remain);
			num /= 10; 	// num -= remain; :어차피 정수니까 빼지 않아도 됨.
		}
	}
}






