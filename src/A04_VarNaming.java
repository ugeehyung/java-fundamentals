
public class A04_VarNaming {

	public static void main(String[] args) {
		
		//#변수를 사용해야 하는 이유: 값을 한번에 변경할 수 있고 일일이 찾아다니면서 변경할 필요가 없어진다
		//값에 의미를 부여해서 소스코드의 가독성을 올릴 수 있다. 변수의 이름을 잘 짓는 것이 매우 중요하다.
		
		int apple_count = 45;
		int apple_price = 485;
		int apple_gram = 50;
		int apple_calorie = 112;
		
		System.out.println("사과의 총 가격은 " + apple_count * apple_price + "원 입니다.");
		System.out.println("사과의 총 무게는 " + apple_count * apple_gram + "g 입니다.");
		System.out.println("사과의 총 칼로리는 " + apple_count * apple_calorie + "kcal 입니다.");
		
		/* 
		  # 변수 작명 규칙 (권장사항)
		 
		  (1) 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 활용한다. (Snake_case)
		  (2) 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다. (camelCase) 
		  (3) 변수명 첫 글자는 소문자를 사용한다. (클래스명 첫 글자에는 대문자를 사용한다.)
		  (4) 프로그램 내에서 값이 변하지 않을 변수(상수)는 모두 대문자를 사용한다.
		  (5) 변수의 내용을 추측할 수 있는 적절한 단어를 사용하자
		  
		  # 변수의 작명 규칙 (필수사항)
		  
		  (1) 변수명 첫 번째 글자는 숫자가 될 수 없다.
		  (2) 변수 사이에는 공백을 사용할 수 없다.
		  (3) 특수문자는 _와 $만 사용할 수 있다. 
		  (4) 이미 자바에서 사용하고 있는 키워드는 변수명으로 사용할 수 없다.
		  
		 */
		
	}

}
