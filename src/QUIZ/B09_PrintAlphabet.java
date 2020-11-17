package QUIZ;

public class B09_PrintAlphabet {

	public static void main(String[] args) {
		
		
		for (char ch= 'A'; ch <= 'Z'; ++ch) {
			System.out.print(ch);
		}
		System.out.println();
		
		for (char ch = 'z'; ch>='a'; --ch) {
			System.out.print(ch);
		}
	}
}
