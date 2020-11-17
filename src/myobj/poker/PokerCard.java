package myobj.poker;

import java.util.ArrayList;
import java.util.Collections;

public class PokerCard {

	Rank rank;
	Suit suit;

	public PokerCard(Rank rank, Suit suit) {
		
		this.rank = rank;
		this.suit = suit;
		
	}

	public String toString() {

		return rank +" "+ suit.getSuitPic();
	}

	public static void main(String[] args) {

		ArrayList<PokerCard> deck = new ArrayList<>();

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				System.out.println(rank);
				System.out.println(suit);
			}
		}
		Collections.shuffle(deck);
	}

}
