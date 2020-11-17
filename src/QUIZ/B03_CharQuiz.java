package QUIZ;

public class B03_CharQuiz {

	public static void main(String[] args) {
		
		//1. char 'q', 'Q'
		System.out.println((int)'q');
		System.out.println((int)'Q');
		int a = 113;
		System.out.println(a == 113 || a == 81);
		
		//2. char ' ' , '\t'
		System.out.println((int)'\0');
		System.out.println((int)'\t');
		int b = 9;
		System.out.println(!(b == 0 || b == 9));
		
		//3. char '0' ~ '9'
		System.out.println((int)'0');
		System.out.println((int)'9');
		int c = 50;
		System.out.println(c >= 48 && c <= 57);
		
		//4. char ¿µ¹®ÀÚ
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'Z');
		System.out.println((int)'z');
		int d = 100;
		System.out.println(d >= 65 && d <= 90 || d >=97 && d<=122);
		
		//5. char ÇÑ±Û
		System.out.println((int)'°¡');
		System.out.println((int)'ÆR');
		int e = 45000;
		System.out.println(e >= 44032 && e <= 55203);
			
	}
}
