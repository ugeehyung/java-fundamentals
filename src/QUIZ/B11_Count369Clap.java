package QUIZ;

import java.util.Scanner;

public class B11_Count369Clap {

	public static void main(String[] args) {

		// 프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		int count = 0;
		int i = 1;
		int j = 1;

		while (i <= num) {
			while (j > 0) {
				int remain = (j % 10); 
				if (remain == 3 || remain == 6 || remain == 9) {
					count++;
				}
				j/=10;
			}	
			++i;
			j = i;
		}
		System.out.println(count);
				
		long end_time = System.currentTimeMillis(); 
		System.out.println(end_time - start_time + "ms");
	}
}

