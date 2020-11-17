package QUIZ;

import java.util.Scanner;

public class C03_inputRightThing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----
		//  a\n
		// -----

		while(true) {
			try {				
				System.out.print("숫자를 입력하세요 >> ");
				int num = sc.nextInt();
				System.out.println("입력한 숫자: " + num);
				break;
			} catch (Exception e) {
				System.out.println("통로에 남아있던 찌꺼기 : " + sc.nextLine());
			} 
		}
	}
}
