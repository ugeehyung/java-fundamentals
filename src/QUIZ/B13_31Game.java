package QUIZ;

import java.util.Random;
import java.util.Scanner;

public class B13_31Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String player[] = {"��ǻ�Ͱ� �����մϴ�. 1,2,3 �� ���ڸ� �Է��ϼ���.\n", 
				"����ڰ� �����մϴ�. 1,2,3 �� ���ڸ� �Է��ϼ���.\n"};
		int random_player = ran.nextInt(2);
		int sum = 0;
		
		switch (random_player) {
		case 0 :
			System.out.println(player[0]);	
			while(true) {
				int computer = ran.nextInt(3)+1;			
				System.out.println("��ǻ��: " + computer);
				sum += computer;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n��ǻ�� loose");
					System.exit(0);
				}
				System.out.print("�����: ");
				int user = sc.nextInt();
				if(user<1 || user>3) {
					System.out.println("1,2,3 �� ���ڸ� �Է��ϼ���.");
					continue;
				}
				sum += user;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n����� loose");
					System.exit(0);
				}
			}
		case 1:
			System.out.println(player[1]);
			while(true) {
				System.out.print("�����: ");
				int user = sc.nextInt();
				if(user<1 || user>3) {
					System.out.println("1,2,3 �� ���ڸ� �Է��ϼ���.");
					continue;
				}
				sum += user;
				System.out.println(" > sum: " +sum);
				if (sum >= 31) {
					System.out.println("\n����� loose");
					System.exit(0);
				}
				int computer = ran.nextInt(3)+1;			
				System.out.println("��ǻ��: " + computer);
				sum += computer;
				System.out.println(" > sum: " + sum);
				if (sum >= 31) {
					System.out.println("\n��ǻ�� loose");
					System.exit(0);
				}
			}
		}
	}
}

