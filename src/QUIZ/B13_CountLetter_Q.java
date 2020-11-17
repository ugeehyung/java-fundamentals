package QUIZ;

import java.util.Scanner;

public class B13_CountLetter_Q {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요> ");
		String msg = sc.nextLine();
		msg = msg.toLowerCase();
		
		int[] count = new int[26];
		char[] msgArr = msg.toCharArray();

		for(int i=0; i<msgArr.length; ++i) {
			char ch = msg.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count[ch-'a'] += 1;
			}
		}
		for (int i =0; i<26; ++i) {
			if (count[i]>0) {
				System.out.print((char)(i+65) + ":" + count[i] + "번\n");
			}
		}
	}
}
