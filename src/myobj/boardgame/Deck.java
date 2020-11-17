package myobj.boardgame;

import java.util.ArrayList;

public class Deck extends Card{

	public Deck() {

	}

	public int DECK_NUM = 52;

	public static int index;
	
	public static String[] deck = new String[52];
	public static char[] deck_shape = new char[52];
	public static String[] deck_number = new String[52];
	public static int[] deck_value = new int[52];
	
	public ArrayList<String> player = new ArrayList<>();
	public ArrayList<Character> player_shape = new ArrayList<>();
	public ArrayList<String> player_number = new ArrayList<>();
	
	public static int draw_num;

	public void shuffle() {

		for(int i=0; i<52; ++i) {
			int s_index = i % 4; 
			int v_index = i % 13; 
			deck[i] = number[v_index] + shape[s_index];
		}
		for (int i=0; i<200; ++i) {
			int ran = (int)(Math.random()*52 +1);
			String temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
		}	
		for(int i=0; i<52; ++i) {
			int s_index = i % 4; 
			int v_index = i % 13; 
			deck_shape[i] = deck_shape[s_index];
			deck_number[i] = deck_number[v_index];
			deck_value[i] = number_value[v_index];
			deck[i] = number[v_index] + shape[s_index];
		}
	}

	public ArrayList<String> draw(int draw_num) {
		
		for (int i=0; i<draw_num; ++i) {
			player.add(deck[i]);
		}
		draw_num++;
		return player;
	}

	public void add() {

		player.add(deck[draw_num]);
		System.out.print("추가한 카드: " + deck[draw_num]);
		draw_num++;

	}

}












