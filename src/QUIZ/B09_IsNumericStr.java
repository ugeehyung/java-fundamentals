package QUIZ;

import java.util.Scanner;

public class B09_IsNumericStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 >");
		String str = sc.nextLine();		
		
		int result = 1;
		int n = str.length();
		if (n ==0) {
			result = 2; 
		}
		else {
		for (int i = 0; i < n ; ++i) {
			char ch = str.charAt(i);
			if ( ch < '0' || ch > '9') { 
				result = 0; break; 
			}
		}
		}
		System.out.println(result);
	}

}

