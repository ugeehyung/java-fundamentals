package QUIZ;

public class B10_Gugudan {

	public static void main(String[] args) {

		System.out.println("구구단\n");

		//1.
		for (int dan=2; dan<=9; ++dan) {
			System.out.printf("%d단 : \t", dan);
			for (int gu=1; gu <=9; ++gu) {
				System.out.printf("%dX%d=%d\t", dan, gu, dan*gu);
			}
			System.out.println();
		}
		System.out.println();

		//2.
		for(int dan=2; dan<=9; ++dan) {
			System.out.printf("%d단\t", dan);
		}
		System.out.println();
		for(int gu=1; gu<=9; ++gu) {
			for (int dan = 2; dan <=9; ++dan) {
				System.out.printf("%dX%d=%d\t", dan, gu, dan*gu);
			}
			System.out.println();
		}
	}
}

