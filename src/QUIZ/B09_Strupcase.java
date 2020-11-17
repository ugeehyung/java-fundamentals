package QUIZ;

import java.util.Scanner;

public class B09_Strupcase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 > ");
		String str = sc.nextLine();

		int n = str.length();
		for (int i = 0; i < n ; ++i) {
			char chr = str.charAt(i);

			if (chr >= 'a' && chr <= 'z') {
				chr -= 32;
			}
			System.out.print(chr);
		}
	
	}

}
