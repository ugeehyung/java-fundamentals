package QUIZ;

import java.util.Random;
import java.util.Scanner;

public class C02_Test {

	public static void main(String[] args) {

		//	
		//	����ڰ� �ð��� ���� ������� �Է��Ѵ�.
		//	9�� 10�� �����̶�� "����"��, 9�� 10�� ���Ķ�� "����"��, ���� 3�� ���Ķ�� "�Ἦ"�� ����Ѵ�.
		//	���������� ���� �ð� �Ǵ� ���� �Էµȴٸ� "����"�� ����Ѵ�.
		//	(��, �ð��� 24�ð����� �Է¹޴´�)

		Scanner sc = new Scanner(System.in);
		System.out.print("�ð��� �Է��ϼ���>> ");
		int hour = sc.nextInt();
		System.out.print("���� �Է��ϼ���>> ");
		int minute = sc.nextInt();

		if (hour>=0 && hour<=24 && minute>=0 && minute<60) {
			if(hour<9 || (hour==9 && minute<=10)) {
				System.out.println("����");
			} else if(hour>=15) {
				System.out.println("�Ἦ");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("����");
		}


		//		1. intŸ�� ���� a�� Ȧ���� �� true
		//		2. charŸ�� ���� ch�� �����ڰ� �ƴ� �� true
		//		3. booleanŸ�� ���� complete�� false�� �� true
		//		4. StringŸ�� �������� str�� "yes"�� �� true
		//		5. StringŸ�� �������� command�� 8������ �� true
		//		6. StringŸ�� �������� command�� �� ��° ���ڰ� ��/�ҹ��� ������� q�϶� true


		int a = 3;
		char ch = '4';		
		boolean complete = false;
		String str = new String();
		str = "yes";
		String command = new String(); 
		command = "aaqnnaaa";
		char[] comArr = command.toCharArray();

		boolean num1 = a % 2 == 0 ? false : true;
		boolean num2 = ((int)ch>=65&&(int)ch<=90)||((int)ch>=97&&(int)ch<=122)? false:true;
		boolean num3 = complete == false ? true : false;
		boolean num4 = str.equals("yes")? true : false;
		boolean num5 = comArr.length==8 ? true:false;
		boolean num6 = command.charAt(2)=='q'||command.charAt(2)=='Q'? true:false;


		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);

		//		��ǻ�Ͱ� 0���� 1000 ������ ������ �����ϸ�
		//		����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߴ� ������ ��������
		//
		//		����ڰ� ���ڸ� �Է����� �� ��Ȳ���� �˸��� ������ ����ؾ� �մϴ�
		//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - UP!
		//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - DOWN!
		//		����ڰ� ������ ������ - ����!
		//
		//		���� ����� �����̾��� ���ڿ� ���±����� �� �õ�Ƚ���� ����ؾ� �մϴ�.	
		//		

		Random ran = new Random();
		int answer = ran.nextInt(1000);
		int count = 0;

		while(true) {
			System.out.print("���ڸ� �Է��ϼ���>> ");
			int num = sc.nextInt();
			if(num>answer) {
				System.out.println("DOWN!");
				count++;
			} else if (num<answer) {
				System.out.println("UP");
				count++;
			} else {
				System.out.println("����!");
				System.out.printf("������ %d, �õ�Ƚ���� %d���Դϴ�.", answer,count);
				System.exit(0);
			}
		}
	}
}
