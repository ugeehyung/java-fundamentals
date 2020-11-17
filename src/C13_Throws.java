import java.util.EmptyStackException;

public class C13_Throws {

	//throws: 현재 메서드에서 발생하는 예외 처리를 메서드 호출한 곳으로 미룬다.
	//메서드 뒤에 발생할 위험이 있는 예외를 함께 정의한다.
	
	//throw: 원하는 예외를 발생시킨다. 
	
	//exception 클래스를 상속받은 객체는 "반드시 처리해야 하는 예외 객체"가 된다.
	//RuntimException을 상속받은 객체는 "반드시 처리하지 않아도 되는 예외 객체"가 된다.
	

	public static void stupid_method() throws ArrayIndexOutOfBoundsException {
		
		throw new ArrayIndexOutOfBoundsException("그냥발생"); 
		
	}
		
	public static void main(String[] args) {

		int a = 1;
		if (a == 2) {
			throw new ArithmeticException();
		} else if (a == 3) {
			throw new EmptyStackException();
		}
		
		stupid_method();
		System.out.println();
	}
}