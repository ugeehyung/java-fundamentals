package QUIZ;

import java.util.Arrays;
import java.util.Random;

public class B13_CountRandomFruit {

	public static void main(String[] args) {

		String[] random_fruits = new String[100];
		String[] fruits = {"apple", "banana", "orange", "peach", "kiwi"};
		Random ran = new Random();

		for(int i=0; i<100; ++i) {
			int random = ran.nextInt(5);
			random_fruits[i] = fruits[random];
		}
		System.out.println(Arrays.toString(random_fruits)+"\n");

		int[] count = new int[5];
		for (int i=0; i<100; ++i) {
			for (int j =0; j<5; ++j) {
				if (random_fruits[i]==fruits[j]) {
					count[j]++;
				}
			}
		} 
		for (int i=0; i<5; ++i) {
			if (count[i]>0) {
				System.out.println(fruits[i] + ": " + count[i] + "°³");
			}
		}	
		
		//enum
		int apple = 0;
		int banana = 1;
		int orange = 2;
		System.out.println("\n¿À·»ÁöÀÇ ¹øÈ£: " + orange);
		System.out.println("¿À·»Áö µîÀå È½¼ö: " + count[orange]);
		System.out.println("¿À·»Áö ÀÌ¸§: " + fruits[orange]);
	}
}
