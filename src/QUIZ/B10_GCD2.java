package QUIZ;

import java.util.Scanner;

public class B10_GCD2 {
	
	//��Ŭ���� ȣ����

	public static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}else {
			return gcd(num2, num1%num2);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ��� > ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ��� > ");
		int num2 = sc.nextInt();
		
		int gcd = gcd(num1,num2);
		System.out.println("�ִ����� > " + gcd);
		System.out.println("�ּҰ���� > " + num1*num2/gcd);
	}
}
