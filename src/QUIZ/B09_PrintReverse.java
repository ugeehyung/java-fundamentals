package QUIZ;

import java.util.Scanner;

public class B09_PrintReverse {

	public static void main(String[] args) {

		System.out.print("������ �Է��غ����� > ");
		String sentence = new Scanner(System.in).nextLine();
		int n = sentence.length();

		for (int i= n-1; i>=0; --i) {
			System.out.print(sentence.charAt(i));
		}
		System.out.println();
		
	}
}
