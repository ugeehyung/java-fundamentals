package QUIZ;

import java.util.Scanner;
//ctrl + shift + o: �ڵ� import

public class B04_AppleQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ �Է��Ͻÿ� > ");
		
		int apple_num = sc.nextInt();
		int basket = 10;
		
		if ( apple_num < basket && apple_num > 0) {
			System.out.println("�ʿ��� �ٱ����� ������ 1�� �Դϴ�.");
		}
		else if ( apple_num < 0 ) {
			System.out.println("0 �̻��� ���ڸ� �Է��ϼž� �մϴ�.");
		}
		else if ( apple_num % basket == 0) {
			System.out.println("�ʿ��� �ٱ����� ������ " + apple_num/basket + "�� �Դϴ�.");
		}
		else {
			System.out.println("�ʿ��� �ٱ����� ������ " + (apple_num/basket + 1) + "�� �Դϴ�.");
		}	
	}	
}
