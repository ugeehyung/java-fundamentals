package QUIZ;

import java.util.Scanner;

public class B05_CheckWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 > ");
		String word = sc.next();
		
		if (word == null || word =="") {
			System.out.println("단어를 입력해주세요");
			return;
		}
		
		if (word.charAt(0) == word.charAt(word.length()-1))
			System.out.println("OK");
		else
			System.out.println("NOT OK");
			
	}
}
