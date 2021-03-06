import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	//정규 표현식 (regex = Regular Expression)
	//문자열이 형식/패턴을 표현하는 방식 (해당 패턴과 일치하는 문자열을 검색할 수 있다.)
	
	public static void main(String[] args) {
		
//		String str = "abc@naver.com";
//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("이메일입니다");	
//		}else {
//			System.out.println("이메일이 아닙니다");
//		}
		
		//Matcher 클래스 (true/false) regex
		//Pattern.matches("꼭 들어가야하는 문자", "sleep")
		//[]내부에는 그 위치에 어떤 문자가 올 수 있는지 나타냄. 
		
		//ex.
		System.out.println(Pattern.matches("sleep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep")); 
		//-> l도 와도 되고 h도 와도 됨.
			
		//※ []내부에 정의
		//1. abc: abc만 허용 <->  ^abc: abc를 제외한 모두 허용
		//2. a-z가-힣: a부터 z까지,가-힣 허용 <->  ^1-9: 1~9만 빼고 다.
		//3. a-zA-Z: a~z, A~Z
		//4. 교집합 a-c && c-f : c만 	
		
		//※ 여러 문자를 간단하게 표현
		//1. . : 모든 문자 허용 => []밖에 써야함!(예외)
		System.out.println(Pattern.matches(".....", "abcde"));
		//2. \\d: 모든 숫자 허용
		//3. \\D: 숫자를 제외한 모든 문자 허용
		//4. \\s: 공백 허용 [\t\n...등의 모든 공백들]
		//5. \\S: 공백을 제외한 모든 문자 허용
		//6. \\w: 일반적인 문자들을 허용 [a-zA-Z_0-9]
		//7. \\W: 일반적인 문자들을 제외 [a-zA-Z_0-9]
		
		//※ 문자의 개수를 정의 (공백이 없어야함)
		//1. 개수: {n번}
		//2. 최소 최대: {n번 이상,m번 이하}
		//3. 최소: {n번이상,}
		//4. a가 0번이나 1번: [a]?
		//5. 1번 이상: +
		//6. 0번이나 여러번: *
		
		String email = "abc@gmail.com";
		System.out.println("이메일 패턴: " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
			

		//Pattern 클래스
		//정규 표현식을 다루는 클래스
		//Pattern.compile("꼭 들어가야하는 문자"); 
		//전달한 정규표현식을 이용해 생성한 인스턴스를 반환한다.
		
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		Pattern split_regex = Pattern.compile("/");
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		//생성된 Pattern 인스턴스로 split 하기
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		//생성된 Pattern 인스턴스로 matcher 생성하기
		//:문자열을 처음부터 끝까지 검사하면서 정규표현식과 일치하는 인덱스 찾아줌
		Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");	
		while (matcher.find()) {
		System.out.print(matcher.start()+ " to " + matcher.end());
		System.out.println(" 찾은 것: " + matcher.group());
		}
		
		Matcher fruit_matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		while (fruit_matcher.find()) {
		System.out.print(fruit_matcher.start()+ " to " + fruit_matcher.end());
		System.out.println(" 찾은 것: " + fruit_matcher.group());
		}
	}
}
