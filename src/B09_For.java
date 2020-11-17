
public class B09_For {

	public static void main(String[] args) {
		
		//반복문
		//for, while, do-while(안씀), for each
		//똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
		
		/*for (초기값; 조건; 증가값) 에서 
		 1. 초기값으로 간다. 
		 2. 조건으로 간다. 
		 3. 실행하러 간다.
		 4. 실행을 끝나면(중괄호 끝) 증가값으로 올라간다.
		 5. 2번으로 돌아간다.		 
		 {
		 가운데 조건이 true인 동안 반복할 실행문
		 }
		 */
		
		//1.가장 기본적인 형태
		//원하는 횟수만큼 반복
		//초기값은 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다.
		//증가는 1씩한다. 
		//++i와 i++은 차이가 없다.
		for (int i = 0; i < 5000; ++i) {
		System.out.println("Hello, World!" +i);
		}
		
		//2.초기값과 증가값의 수치는 마음대로 변경할 수 없다.
		for (int i = 10; i < 33; i+= 2) {
			System.out.println("Hello " +i);
		}
		for (int i = 9000; i >0; i -= 100) {
			System.out.println("Minus " +i);
		}
		
		//초기값과 증가값의 위치를 마음대로 변경할 수 있다.
		int num = 0;
		for (; num < 100;) {
			System.out.println("마음대로 " +num);
			++num;
		}
		
		//3.내부에 다른 문법도 자유롭게 사용할 수 있다.
		for (int month = 1; month <= 12; ++month){
			switch(month) {
			case 1: case 2: case 12:
				System.out.printf("%d월은 겨울입니다.", month);
				break;
			case 3: case 4: case 5:
				System.out.printf("%d월은 봄입니다.", month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d월은 여름입니다.", month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d월은 가울입니다.", month);
				break;
			default:
			 System.out.println("잘못 입력되었습니다.");
			 break;
			}
			
			System.out.println();
		//4.조건을 비워놓거나 true를 넣으면 무한반복
		//※break를 이용해 반복문을 탈출할 수 있다.
		}
		num = 0;
		for (;;) {
			System.out.println(num += 99);
			break;
		}
		
		//5.continue: 만나면 반복문을 스킵한다.
		for (int i = 0; i < 100; ++i) {
			System.out.printf("%-3d", i);
			if ( i % 10 != 9)
				continue;
			System.out.println(); //줄바꿈
			
		}
		
		//6.반복문으로 총합 구하기
		//총합을 저장할 변수를 선언하고 0으로 초기화한다.
		//반복문을 통해 해당 변수에 값을 누적시킨다.
		
		int sum = 0;
		for (int i = 80; i <= 333; ++i) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
