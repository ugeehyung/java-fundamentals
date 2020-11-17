
public class B06_Swtich {

	public static void main(String[] args) {
		
		//Switch-Case문
		//()안의 연산 결과에 따라 실행할 코드를 결정한다.
		//If문으로 완벽하게 대체 가능하다.
		//break를 안쓰면 break를 만날때까지 모든 case를 실행한다.
		
		int a =10;
		
		//짝수 or 홀수
		switch (a % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		}
		//시작하는 단어
		String word = "apple";
		
		switch (word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a로 시작하는 단어입니다.");
			break;//break가 없으면 "b로 시작하는 단어입니다."도 실행된다.
		case 'B': case 'b':
			System.out.println("b로 시작하는 단어입니다.");
			break;
		case 'c':
			System.out.println("c로 시작하는 단어입니다.");
			break;
		default:
			System.out.println("위의 case가 모두 아닙니다.");
			break;
			
		}

	}

}
