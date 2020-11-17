package QUIZ;

import java.util.Scanner;

public class B04_ScoreToGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 > ");
		
		double score = sc.nextInt();
		
		if ( score < 0) {
			System.out.println("0 이상의 값을 입력하셔야 합니다.");
			return; //main()을 끝낸다.
			//System.exit(0); : 프로그램을 종료한다.
		} else if ( score > 100) {
			System.out.println("100 이하의 값을 입력하셔야 합니다.");
			return;
		} else if ( score >= 90) {
			System.out.println("A등급입니다.");
		} else if ( score >= 80) {
			System.out.println("B등급입니다.");
		} else if ( score >= 70) {
			System.out.println("C등급입니다.");
		} else if ( score >= 60) {
			System.out.println("D등급입니다.");
		} else {
			System.out.println("F등급입니다.");
		}
		
	}
}
