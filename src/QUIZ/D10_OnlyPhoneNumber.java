package QUIZ;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("휴대폰 번호를 입력하세요>> ");
			String phonenumber = sc.nextLine();
			if (Pattern.matches("01[01679]-[0-9]{3,4}-[0-9]{4}", phonenumber)) {
				System.out.println("[입력 완료]");
				break;
			} else {
				System.err.println("잘못된 번호입니다. 다시 입력하세요.");
				continue;
			}	
		}
	}
}
