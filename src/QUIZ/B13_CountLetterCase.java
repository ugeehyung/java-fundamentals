package QUIZ;

import java.util.Scanner;

public class B13_CountLetterCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요> ");
		String msg = sc.nextLine();
		char[] msgArr = msg.toCharArray();
		int[] lower = new int[26];
		int[] upper = new int[26];
		int[] number = new int[26];

		for(int i=0; i<msgArr.length; ++i) {
			char ch = msg.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lower[ch-'a'] += 1;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper[ch-'A'] += 1;
			} else if (ch >= 48 && ch <= 58) {
				number[ch-48] += 1;
			}
		}
		for (int i=0; i<26; ++i) {
			if (lower[i]>0) {
				System.out.println((char)(i+97) + ":" + lower[i] + "번");
			} else if (upper[i]>0) {
				System.out.println((char)(i+65) + ":" + upper[i] + "번");
			} else if (number[i]>0) {
				System.out.println((char)(i+48) + ":" + number[i] + "번");
			}
		}
	}
}
