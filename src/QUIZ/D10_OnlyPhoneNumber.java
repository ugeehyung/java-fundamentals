package QUIZ;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("�޴��� ��ȣ�� �Է��ϼ���>> ");
			String phonenumber = sc.nextLine();
			if (Pattern.matches("01[01679]-[0-9]{3,4}-[0-9]{4}", phonenumber)) {
				System.out.println("[�Է� �Ϸ�]");
				break;
			} else {
				System.err.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}	
		}
	}
}
