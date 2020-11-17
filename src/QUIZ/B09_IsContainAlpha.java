package QUIZ;

import java.util.Scanner;

public class B09_IsContainAlpha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 > ");
		String sentence = sc.nextLine();
		int n = sentence.length();
		boolean result = false;

		for (int i = 0; i <= n-1; ++i) {
			char a = sentence.charAt(i);
			if (a>='A' && a<='Z' || a>='a' && a<='z') {
				result = true;
				break;
			}
		}

		System.out.println(result);

	}

}
