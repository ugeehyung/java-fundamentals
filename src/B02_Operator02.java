
public class B02_Operator02 {

	public static void main(String[] args) {
	
		//#비교연산
		//비교 연산의 결과는 참 또는 거짓이다. (Boolean 타입)
		//산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다.
		//a + (b > 10)
		
		int a = 7, b = 9;
		
		System.out.println("a>b: " + (a>b));
		System.out.println("a<b: " + (a<b));
		System.out.println("a=b: " + (a>=b));
		System.out.println("a<=b: " + (a<=b));
		
		System.out.println("a==b: " + (a==b));
		System.out.println("a!=b: " + (a!=b));
		
		//#논리연산
		//Boolean 타입값 두개로 하는 연산
		//&&: 두 값이 모두 true일때 true (and)
		//||: 두 값 중 하나만 true여도 true (or)
		//!: true면 false, false면 true (not)
		
		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(a>10));
		System.out.println(!(b<10));
		
	}

}
