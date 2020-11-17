import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D08_String {

	public static void main(String[] args) {

		String str = "apple/banana/orange/kiwi";

		//split: 문자열을 해당 문자기준으로 자름
		String[] fruits = str.split("/"); 
		System.out.println(Arrays.toString(fruits));

		//join: 전달한 문자를 이용하여 배열을 합침
		System.out.println(String.join("-", fruits)); 

		//replace (replaceAll : 해당 정규표현식과 일치하는 문자열을 모두 교체)
		str = "abc@naver.com";
		str = str.replace("naver.com", "gmail.com");
		System.out.println(str);

		//format: 서식을 이용해 원하는 문자열을 생성한다.
		str = String.format("%d시 %d분 %d.%d",1 ,2 ,3 ,1234);
		System.out.println(str);

		//contains: 문자열에 해당 문자열이 포함되어있는지를 검사한다.
		str = "BOB";
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));

		//equalsIgnoreCase(): 대소문자에 상관없이 일치하는지 검사한다.
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));

		//startsWith / endsWith: 문자열이 해당 문자열로 시작/끝나는지 검사한다.
		str = "image-fruit-apple.jpg";
		System.out.println(str.startsWith("image"));
		System.out.println(str.endsWith("jpg"));

		//getBytes: 문자열로 byte타입 배열을 생성한다.
		str = "안녕하세요"; 
		try {

			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));

			System.out.println(new String(utf8_bytes));
			System.out.println(new String(euc_bytes));

		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 코딩입니다.");
		}

		//getChars: char[]에 문자열의 원하는 	부분을 담아준다.
		//str.getchars(어디서부터 자를건지, 어디까지 자를건지, 어디에 넣을건지, 어디부터 넣을건지)
		str = "Hello, java python c-lang";

		char[] buffer = new char[10];
		str.getChars(7, 11, buffer, 0);
		System.out.println(buffer);

		//substring(begin, end): 문자열의 원하는 부분을 문자열로 반환한다.
		System.out.println(str.substring(10));
		System.out.println(str.substring(11, 15));

		//compareTo: Comparable 인터페이스 메서드
		System.out.println("compare result: " + "car".compareTo("Jet"));

		//trim: 문자열 바깥쪽의 공백을 제거한다.
		str = "    good bye...     ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());

		//valueOf: 다른 타입의 값을 문자열로 변환 (해당 객체의 toString 결과 반환)
		String ott = String.valueOf(123);
		System.out.println(ott);

		//StringTokenizer: 문자열을 자르는데에 특화된 케이스 (split의 빠른 버전)
		str = "99/88/77/66/55/44/33/22/11";
		StringTokenizer st = new StringTokenizer(str, "/");
		System.out.println("Token 개수: " + st.countTokens());
		//(자를 때 사용했던 문자열이 필요하다면 세번째 파라미터를 true로 활성화.)
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken()+ " ");
		}

		
	}

}
