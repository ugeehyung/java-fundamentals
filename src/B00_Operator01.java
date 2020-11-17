
public class B00_Operator01 {

	public static void main(String[] args) {
		
		//연산자 (operator) : 계산할 때 사용하는 것
		
		//#산술 연산자
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.printf("a = %d. b = %d, c = %.1f 일 때,\n", a, b, c);
		System.out.println("+: " + (a + b));
		System.out.println("-: " + (a - b));
		System.out.println("*: " + (a * b));
		
		System.out.println("/: " + (a / b));
		//정수끼리 나누기를 하면 몫만 나온다. 실수로 바꿔줘야 함.
		System.out.println("/: " + (a/ (double)b));
		System.out.println("/: " + (a/ c));
		
		System.out.println("%: " + (a % b));
		System.out.println("^: " + (a ^ b)); //제곱이 아니다.(XOR:서로 다르면 1)
		
		System.out.println("제곱: " + Math.pow(a, b)); //(결과 double 타입)
		System.out.println("제곱근: " +Math.sqrt(2)); 
		System.out.println("절대값: " + Math.abs(-20)); 
		System.out.println("반올림: " + Math.round(1.234));
		System.out.println("올림: " + Math.ceil(1.001));
		System.out.println("내림: " + Math.floor(1.999));
		System.out.println("max: " + Math.max(a,b));
		System.out.println("min: " + Math.min(a, b));
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
