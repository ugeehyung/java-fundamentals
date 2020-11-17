package QUIZ;

import java.util.Scanner;

public class B09_Palindrome {

	public static void main(String[] args) {
		
		System.out.print("단어를 입력해주세요 > ");
		String word = new Scanner(System.in).nextLine();
		
		int n = word.length();
		System.out.println(n);
		
		String palindrome = "";
		
		for (int i=0; i<n/2; ++i) {
			char chr1 = word.charAt(i);
			char chr2 = word.charAt(n-1-i);
			if (chr1 != chr2) {
				palindrome = "NOT ";
				break;
			}
		}
		System.out.println(palindrome + "PALINDROME");
	}
}
