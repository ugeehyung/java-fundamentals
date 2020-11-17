package QUIZ;

import java.util.Random;
import java.util.Scanner;

public class C02_Test {

	public static void main(String[] args) {

		//	
		//	사용자가 시간과 분을 순서대로 입력한다.
		//	9시 10분 이전이라면 "정상"을, 9시 10분 이후라면 "지각"을, 오후 3시 이후라면 "결석"을 출력한다.
		//	정상적이지 않은 시간 또는 분이 입력된다면 "에러"를 출력한다.
		//	(단, 시간은 24시간제로 입력받는다)

		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력하세요>> ");
		int hour = sc.nextInt();
		System.out.print("분을 입력하세요>> ");
		int minute = sc.nextInt();

		if (hour>=0 && hour<=24 && minute>=0 && minute<60) {
			if(hour<9 || (hour==9 && minute<=10)) {
				System.out.println("정상");
			} else if(hour>=15) {
				System.out.println("결석");
			} else {
				System.out.println("지각");
			}
		} else {
			System.out.println("에러");
		}


		//		1. int타입 변수 a가 홀수일 때 true
		//		2. char타입 변수 ch가 영문자가 아닐 때 true
		//		3. boolean타입 변수 complete가 false일 때 true
		//		4. String타입 참조변수 str이 "yes"일 때 true
		//		5. String타입 참조변수 command가 8글자일 때 true
		//		6. String타입 참조변수 command의 세 번째 글자가 대/소문자 관계없이 q일때 true


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

		//		컴퓨터가 0부터 1000 사이의 정답을 생성하면
		//		사용자가 숫자를 입력하여 정답을 맞추는 게임을 만들어보세요
		//
		//		사용자가 숫자를 입력했을 때 상황별로 알맞은 정보를 출력해야 합니다
		//		사용자가 선택한 숫자가 정답보다 낮은 숫자인 경우 - UP!
		//		사용자가 선택한 숫자가 정답보다 높은 숫자인 경우 - DOWN!
		//		사용자가 정답을 맞춘경우 - 정답!
		//
		//		게임 종료시 정답이었던 숫자와 여태까지의 총 시도횟수를 출력해야 합니다.	
		//		

		Random ran = new Random();
		int answer = ran.nextInt(1000);
		int count = 0;

		while(true) {
			System.out.print("숫자를 입력하세요>> ");
			int num = sc.nextInt();
			if(num>answer) {
				System.out.println("DOWN!");
				count++;
			} else if (num<answer) {
				System.out.println("UP");
				count++;
			} else {
				System.out.println("정답!");
				System.out.printf("정답은 %d, 시도횟수는 %d번입니다.", answer,count);
				System.exit(0);
			}
		}
	}
}
