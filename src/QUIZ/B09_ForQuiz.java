package QUIZ;

import java.util.Scanner;

public class B09_ForQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		int sum = 0;
		
		//1. 10���� ����
		if (num < 10) {
			for ( int i = 10; i >= num; --i) {  
				sum += i;}
		}	
		else { 
			for (int i = 10; i <= num; ++i) {
				sum += i;}	
		}
		System.out.println("10������ ����: " + sum);
		
		
		//2. 1���� 3�� ���
		System.out.print("3�� ���: ");
		if (num > 0) {
		for (int i = 1; i <= num; ++i) {
			if ( i % 3 == 0)
			System.out.print(i + " ");
			if ( i % 3 != 0)
				continue;}
		}
		else {
		for (int i = -1; i >= num; --i) {
			if ( -i % 3 == 0)
			System.out.print(i + " ");
			if ( -i % 3 != 0)
				continue;}
		}
		System.out.println();
		System.out.println("3�� ����� ����: " + Math.abs(num)/3);
	}
}	
