package myobj.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PokerHand implements Comparable <PokerHand>	{

	ArrayList<PokerCard> hands;

	boolean[] opens;

	public PokerHand(int handSize) {

		hands = new ArrayList<>(handSize);
		opens = new boolean[handSize];

		for(int i=0; i<handSize; ++i) {
			if (i<2) {
				opens[i] = false;
			} else {
				opens[i] = true;
			}
		}
	}

	public void add(PokerCard card) {
		hands.add(card);
	}

	public void show() {
		for (int i=0, size = hands.size(); i<size; ++i) {
			if (opens[i]) {
				System.out.println(i+1+ "번째 카드: " + hands.get(i));
			} else {
				System.out.println(i+1+ "번째 카드: ");
			}
		}
	}

	public void open(int hand_index) {
		opens[hand_index] = !opens[hand_index];
	}

	public void openAllCard() {
		Arrays.fill(opens, true);
	}

	Set<Rank> getRankSet() {
		Set<Rank> ranks = new HashSet<>();

		for(PokerCard hand : hands) {
			ranks.add(hand.rank);
		}
		return ranks;
	}

	public static void main(String[] args) {

		int round = 0;

		while(true) {

			System.out.println("<<<round " + ++round+ ">>>");
			PokerDeck deck = new PokerDeck();
			PokerHand player01 = new PokerHand(5);

			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());

			PokerHand player02 = new PokerHand(5);

			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());

			System.out.println("----player 1----");
			player01.openAllCard();
			player01.show();
			System.out.println("----player 2----");
			player02.openAllCard();
			player02.show();

			ArrayList<PokerHand> players = new ArrayList<>();

			players.add(player01);
			players.add(player02);
			
			ArrayList<PokerCard> max = Collections.max(players).hands;
			
			System.out.println("이긴사람 카드: " + max);
			break;

			//			PokerHandRanking power = new PokerHandRanking();
			//			power.check(player01);
			//
			//			HandRank hr = power.handrank;
			//
			//			if(power.handrank != null) {
			//				System.out.println(power.handrank);
			//				player01.openAllCard();
			//				player01.show();
			//				break;
			//			} else { 
			//				player01.openAllCard();
			//				player01.show();
			//				System.out.println();
			//			}
		}
	}	

	public int compareTo(PokerHand o) {

		PokerHandRanking rank1 = new PokerHandRanking(this);
		PokerHandRanking rank2 = new PokerHandRanking(o);

		System.out.println("PLAYER1: " + rank1.getHandRank());
		System.out.println("PLAYER2: " + rank2.getHandRank());

		return rank1.getHandRank().compareTo(rank2.getHandRank());
	}

}

