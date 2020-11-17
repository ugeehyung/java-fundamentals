package QUIZ;

import java.util.Random;

public class B12_TempPassword {

	public static void main(String[] args) {

		for (int i=0; i<4; ++i) {

			Random ran = new Random();
			boolean n2 = ran.nextBoolean();
			// int n = ran.nextInt(2);
			if (n2) {
				System.out.print(ran.nextInt(10));
			}
			else {
				System.out.print((char)(ran.nextInt(26)+ 65));
			}
		}
	}
}
