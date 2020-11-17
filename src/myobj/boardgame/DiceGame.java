package myobj.boardgame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import QUIZ.D03_Dice;

public class DiceGame {

	public static void main(String[] args) throws InterruptedException {
		
		D03_Dice dice = new D03_Dice();
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			dice.roll();
			System.out.println("�ٲٱ� > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			
			System.out.println("�ٽ� ������ �ε���: " + rerolls);
			dice.reroll(rerolls);
			
			Thread.sleep(2000);
		}
	}
}
