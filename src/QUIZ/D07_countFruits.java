package QUIZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {

	private enum Fruit {
		 
		APPLE, BANANA, ORANGE, KIWI 
	}
	
	static List<Fruit> fruits;

	static {

		fruits = new ArrayList<>();
		for (int i=0; i<50; ++i) {
			fruits.add(Fruit.values()[(int)(Math.random()*4)]);
		}
	}

	public static void main(String[] args) {

		for(int i=0; i<4; ++i) {
			System.out.println(Fruit.values()[i] + " °³¼ö: " + Collections.frequency(fruits, Fruit.values()[i]));			
		}
				
		Map<Fruit,Integer> fruit_count = new HashMap<>();
		
		for(Fruit fruit: Fruit.values()) {
			int freq = Collections.frequency(fruits, fruit);
			fruit_count.put(fruit, freq);
		}
		System.out.println(fruit_count);
	}
}
