package myobj.poker;

import java.util.Collections;
import java.util.LinkedList;

public class PokerDeck {

	LinkedList<PokerCard> deck;

	public PokerDeck() {

		deck = new LinkedList<>();

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new PokerCard(rank, suit));
			}
		}
		Collections.shuffle(deck);
		System.out.println("[SYSTEM] New deck created and shuffled.");

	}

	public PokerCard draw() {
		//ArrayList�� remove()�� pop�� ��ɵ� �Ѵ�.
		return deck.pop();
	}

	public static void main(String[] args) {
		new PokerDeck();

	}
}
