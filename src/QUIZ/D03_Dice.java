package QUIZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class D03_Dice {

	private Random ran;
	private List<Integer> dices;  // 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts; // 각 숫자가 몇번씩 등장했는지 세어 볼 리스트 

	private String made;

	private static int NUM_OF_DICE = 5;
	private static int DICE_FACET = 6;

	private final static Set<Set<Integer>> LARGE_CASES;
	private final static Set<Set<Integer>> SMALL_CASES;

	static {
		LARGE_CASES = new HashSet<>(2);

		for (int i = 1; i <= 2; ++i) {
			Set<Integer> large = new HashSet<>(5);			
			Collections.addAll(large, i, i+1, i+2, i+3, i+4);
			LARGE_CASES.add(large);
		}

		SMALL_CASES = new HashSet<>(3);

		for (int i = 1; i <= 3; ++i) {
			Set<Integer> small = new HashSet<>(4);			
			Collections.addAll(small, i, i+1, i+2, i+3);
			SMALL_CASES.add(small);
		}
	}

	public D03_Dice() {

		ran = new Random();
		made = "UNCHECKED";

		dices = new ArrayList<>(NUM_OF_DICE); 
		counts = new ArrayList<>(DICE_FACET);

		Collections.addAll(dices, 0, 0, 0, 0, 0);
		Collections.addAll(counts, 0, 0, 0, 0, 0, 0);
	}

	private void count() {
		for (int i = 0; i < DICE_FACET; ++i) {
			int dice_num = i + 1;			
			counts.set(i, Collections.frequency(dices, dice_num));
		}
	}

	private String check() {
		// check by counts
		if (counts.contains(5)) {
			return "FIVE DICE!!!";
		} else if (counts.contains(4)) {
			return "FOUR DICE!!";
		} else if (counts.contains(2) && counts.contains(3)) {
			return "FULL HOUSE!!!";
		}

		// check by dices 
		for (Set<Integer> ls : LARGE_CASES) {
			if (dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!!";
			}
		}

		for (Set<Integer> ss : SMALL_CASES) {
			if (dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!";
			}
		}				
		return "NO MATCHES";
	}

	public void print() {
		System.out.println(dices + ":");

		if (made.equals("UNCHECKED")) {
			made = check();
		}
		System.out.println(made);
	}

	public void reroll(Set<Integer> rerolls) {

		if(rerolls.size() == 0) {
			System.out.println("NOTHING CHANGES");
			return;
		}

		made= "UNCHECKED";
		
		for(int i: rerolls) {
			int to_change = ran.nextInt(6)+1;
			dices.set(i-1, to_change);
			System.out.printf("DICE %d HAS CHANGED: %d");
		}
		count();
		print();
	}

	public void roll() {		
		for (int i = 0; i < NUM_OF_DICE; ++i) {
			dices.set(i, ran.nextInt(DICE_FACET) + 1);
		}
		count();

		System.out.print(dices + " : ");
		System.out.println(check());
	}	

	public void change(int change_num) {

		Collections.shuffle(dices);

		for (int i = 0; i < change_num; ++i) {
			dices.set(i, ran.nextInt(DICE_FACET) + 1);
		} 

		System.out.print(dices + " : ");
		System.out.println(check());

	}

	public static void main(String[] args) throws InterruptedException {

		D03_Dice dice = new D03_Dice();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			dice.roll();
			System.out.print("바꾸기 > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			
			System.out.println("다시 굴리는 인덱스: " + rerolls);
			dice.reroll(rerolls);
			
			Thread.sleep(2000);
		}
	}
}
