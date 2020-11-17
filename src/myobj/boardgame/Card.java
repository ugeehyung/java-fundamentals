package myobj.boardgame;

public class Card{


	public static char[] shape = {'♥','♠','♣','◇'};
	public static String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public static int[] number_value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,10 ,10, 10};

	public Card() {
		
	}
	
	public void show(int index) {
		
		System.out.println("카드 공개> " + number[index] + shape[index]);
		
	}
	
	public char shape(int index) {

		return shape[index];

	}

	public String number(int index) {

		return number[index];
	}
	
	public int number_value(int index) {
		
		return number_value[index];
		
	}
	

}
