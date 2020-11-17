package QUIZ;

import java.util.Random;
import java.util.Scanner;

public class B13_31Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String player[] = {"컴퓨터가 시작합니다. 1,2,3 중 숫자를 입력하세요.\n", 
				"사용자가 시작합니다. 1,2,3 중 숫자를 입력하세요.\n"};
		int random_player = ran.nextInt(2);
		int sum = 0;
		
		switch (random_player) {
		case 0 :
			System.out.println(player[0]);	
			while(true) {
				int computer = ran.nextInt(3)+1;			
				System.out.println("컴퓨터: " + computer);
				sum += computer;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n컴퓨터 loose");
					System.exit(0);
				}
				System.out.print("사용자: ");
				int user = sc.nextInt();
				if(user<1 || user>3) {
					System.out.println("1,2,3 중 숫자를 입력하세요.");
					continue;
				}
				sum += user;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n사용자 loose");
					System.exit(0);
				}
			}
		case 1:
			System.out.println(player[1]);
			while(true) {
				System.out.print("사용자: ");
				int user = sc.nextInt();
				if(user<1 || user>3) {
					System.out.println("1,2,3 중 숫자를 입력하세요.");
					continue;
				}
				sum += user;
				System.out.println(" > sum: " +sum);
				if (sum >= 31) {
					System.out.println("\n사용자 loose");
					System.exit(0);
				}
				int computer = ran.nextInt(3)+1;			
				System.out.println("컴퓨터: " + computer);
				sum += computer;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n컴퓨터 loose");
					System.exit(0);
				}
			}
		}
	}
}

