
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		 # 정수 타입 (''문자 타입 값도 정수 취급을 받는다)
		 ※ 타입마다 데이터를 저장할 수 있는 크기가 다르다. 
		 -byte	(1byte)  -128	~ +127
		 -char	(2byte)  0		~ +65535 (65536개, 문자에 최적화)
		 -short (2byte)  -32768 ~ +32767 (65536개)
		 -int	(4byte)  -22억	~ +22억 (2^32개)
		 -long	(8byte)  엄청 큰 범위
		 */

		byte b = 127; //표현할 수 있는 숫자가 적은 대신 공간을 절약할 수 있다.
		char c = 0; 
		short s = -32768;
		int i = 2100000000;
		//int의 범위를 벗어나는 숫자를 적을 땐 뒤에 L을 붙여야 한다. 
		long l = 900000000;
		
		/*
		 	#실수 타입 (거의 그래픽 계산에만 이용된다)
		 	※ 부동소수점 방식을 사용한다.
		 	
		 	-float	(4byte)
		 	-double	(8byte)
		 	
		 */
		
		float f = 123.123f; //float값을 적을 땐 뒤에 f를 붙여야 한다.
		double d = 123.123;
		
		// # Literal(리터럴)
		// 그냥 적는 값
		// "", '', 소수, 소수f, 정수, 정수L...
		// 0숫자(8), 0x숫자(16), 0b숫자(2)
		// true, false
		
		//16진수: 0123456789ABCDEF 10(16)
		//8진수: 01234567 10(8)
		//2진수: 01 10(2)
		
		System.out.println("111(10) : " + 111);
		System.out.println("111(2) : " + 0b111);
		System.out.println("111(8) : " + 0111);
		System.out.println("111(16) : " + 0x111);
		
		/*
		 	# 참/거짓 타입
		 	boolean: true, false 두 가지의 값만 대입할 수 있는 변수 타입
		 */
		boolean bl = false;
		boolean goonpil = false;
		boolean passExam = true;
		boolean complete = true;
		
		/*
		 #참조형 타입 (클래스 타입)
		 String: 문자열
		 그 외 모든 클래스들...
		 ※ 대문자로 시작하는 모든 타입들은 참조형 타입이다
		 */
		
		String hiMsg = "Hi, nice to meet you!";
		String byeMsg = "Good bye";
		
		System.out.println(hiMsg);
		System.out.println(byeMsg + byeMsg + byeMsg);
	}

	
	
	
	
	
	
	
	
	
	
	
}
