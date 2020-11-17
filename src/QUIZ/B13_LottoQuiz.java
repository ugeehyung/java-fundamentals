package QUIZ;

import java.util.Arrays;
import java.util.Random;

public class B13_LottoQuiz {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] number = new int [45];
		int[] lotto = new int[6];

		for (int i=0; i<6; ++i) {
			int n = ran.nextInt(45) + 1; 
			number[n-1] += 1;
			if (number[n-1] > 1) {
				--i;
			} else {
				lotto[i] = n;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}

//int random = ran.nextInt(45)+1;

//int temp = number[0];
//number[0] = number[random];
//number[random] = temp;
