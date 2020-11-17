package QUIZ;

import java.util.Scanner;

public class C01_BlackJack {//다른함수에서 사용가능한 변수

	public static int[] deck;
	public static int[] player;
	public static int[] dealer; 
	public static int[] game_index; //0:dealer 1:player 2:deck(dealer+player) {0,0,0}

	public static int[] shuffle() {//카드섞기

		int[] deck = new int[52];
		for(int i=0; i<deck.length; ++i) {
			deck[i] = i;
		}
		for (int i=0; i<200; ++i) {
			int ran = (int)(Math.random()*51 +1);

			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
		}		
		return deck;
	}

	public static void draw(int user) {

		switch(user) {
		case 0 :
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1 :
			player[game_index[1]++] = deck[game_index[2]++];
			break;
		}
	}

	public static String prettyCard(int card) {

		char[] shape = {'♥','♠','♣','◇'};
		String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K" };

		int s_index = card/13;
		int v_index = card%13;

		return shape[s_index] + value[v_index];

	}

	public static void print_game(int mode) {

		System.out.print("DEALER: ");
		System.out.println("\t");
		for(int i=0; i<game_index[0]; ++i) {
			if(mode == 0 && i == 0) {
				System.out.print("X ");
			}else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		if(mode==0) {
			System.out.println();
		}else {
			System.out.printf("(%d)\n", check_value(0));
		}

		System.out.print("PLAYER: ");
		System.out.println("\t");
		for(int i=0; i<game_index[1]; ++i) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n", check_value(1));
	}

	public static int getSum(int[] values) {
		int sum = 0;
		int ace = 0;
		for (int i = 0; i < values.length; ++i) {
			if(values[i]==0) {
				sum += 11;
			} else if (values[i]>=10) {
				sum += 10;
			} else {
				sum += values[i] + 1;
			}
		}
		while (sum > 21 && ace > 0) { //A를 1로 변경
			sum -= 10;
			ace -= 1;
		}
		return sum;
	}

	public static int check_value(int user) {

		int[] values = new int[game_index[user]];
		for (int i=0; i<values.length; ++i) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;
		}
		return getSum(values);
	}

	public static int game_start() {//카드뽑기

		deck = shuffle();

		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];

		draw(0);
		draw(0);
		draw(1);
		draw(1);

		Scanner console = new Scanner(System.in);

		int player_value;
		while((player_value = check_value(1))<21) {

			print_game(0);
			System.out.print("1.hit\t2.stand\n>> ");
			int select = console.nextInt();


			if(select==2) {
				player_value = check_value(1);
				break;
			}
			if(select==1) {
				break;
			}else if (select==1) {
				draw(1);
			}
			player_value = check_value(1);
		} //딜러가 마저 뽑고 모든 정보를 출력한 후 결과를 리턴

		print_game(1);
		int dealer_value;
		while ((dealer_value = check_value(0)) <= 16) {

			try {//시간 늦추기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

		return check_game(dealer_value, player_value); //결과산출
	}

	public static int check_game(int d, int p) {

		if(d>21 && p>21) {
			return 0;
		}else if(d == p) {
			return 0;
		} else if(p <= 21 && d>21) {
			return p == 21 ? 2:1;
		} else if (p <= 21 && p > d) {
			return p == 21 ? 2:1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int player_money = 10000;

		while (player_money >0) {
			int betting = 5000;
			player_money -= betting;
			int game_result = game_start();

			StringBuilder msg = new StringBuilder("게임결과 : ");

			switch(game_result) {
			case 0:
				player_money += betting;
				msg.append("무승부\n");
				break;
			case 1:
				player_money += betting * 2;
				msg.append("WIN\n");
				break;
			case 2:	
				player_money += (int)(betting * 2.5);
				msg.append("BLACKJACK\n");
				break;
			default:
				msg.append("LOOSE\n");
				break;
			}
			msg.append("현재잔액 : " + player_money + "원\n");
			System.out.println(msg);
		}
	}
}
