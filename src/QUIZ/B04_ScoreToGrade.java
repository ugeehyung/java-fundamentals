package QUIZ;

import java.util.Scanner;

public class B04_ScoreToGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� > ");
		
		double score = sc.nextInt();
		
		if ( score < 0) {
			System.out.println("0 �̻��� ���� �Է��ϼž� �մϴ�.");
			return; //main()�� ������.
			//System.exit(0); : ���α׷��� �����Ѵ�.
		} else if ( score > 100) {
			System.out.println("100 ������ ���� �Է��ϼž� �մϴ�.");
			return;
		} else if ( score >= 90) {
			System.out.println("A����Դϴ�.");
		} else if ( score >= 80) {
			System.out.println("B����Դϴ�.");
		} else if ( score >= 70) {
			System.out.println("C����Դϴ�.");
		} else if ( score >= 60) {
			System.out.println("D����Դϴ�.");
		} else {
			System.out.println("F����Դϴ�.");
		}
		
	}
}
