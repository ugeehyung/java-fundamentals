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
				System.out.print("���ڸ� �Է��ϼ��� >> ");
				int num = sc.nextInt();
				System.out.println("�Է��� ����: " + num);
				break;
			} catch (Exception e) {
				System.out.println("��ο� �����ִ� ��� : " + sc.nextLine());
			} 
		}
	}
}
