package QUIZ;

import java.util.Scanner;

public class B11_ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = sc.nextInt();//()�ȿ� ������ �Է��ϸ� �ٸ� ���� ��밡��. 10�������� 10
		
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
			num /= 10; 	// num -= remain; :������ �����ϱ� ���� �ʾƵ� ��.
		}
	}
}






