
public class B07_Operator03 {

	public static void main(String[] args) {
		
		//삼항 연산자 = 조건 연산자
		//if문을 할줄로 표현할 수 있다.
		//조건 ? 예 : 아니오
	
		//ex: 필요한 사과 봉지 개수 계산하기
		int apple = 31;
		int size = 10;
		int needs = apple % 10 == 0 ? apple / size : apple / size +1;
		System.out.printf("필요한 봉지는 &d개 입니다.", needs);
		
		//ex: 숫자가 홀수인지 짝수인지
		String msg = apple % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.printf("현재 사과의 개수는 %s\n", msg);


		
	}

}
