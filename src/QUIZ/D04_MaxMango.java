package QUIZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {

	public static void main(String[] args) {
		
		List<Mango> mang = new ArrayList<>();
		
		for (int i=0; i<100; ++i) {
			mang.add(new Mango());
			}
		
		Mango most_delicious = Collections.max(mang);
		
		System.out.println("Ä®·Î¸®: " + most_delicious.calorie);
		System.out.println("´çµµ: " + most_delicious.sweet);

	}
}
