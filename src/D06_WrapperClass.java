
public class D06_WrapperClass {

	//WrapperClass
	//기본형 타이틀을 참조형 타입으로 사용하고 싶을 때 사용한다.
	//각 타입들에 대한 유용한 기능들이 모여있다.
	
	//기본형: byte, short, char, int, long, float, double
	//참조형: Byte, short, Character, Integer, Long, Float, Double
	
	public static void main(String[] args) {
		
		//.typeValue() 시리즈: 참조형에 저장된 값을 원하는 타입으로 변환한다.
		Integer a = 10; 		//Integer b = new Integer(10); -> JDK이후로 deprecated
		a.byteValue();
		a.doubleValue();
		a.byteValue();
		a.floatValue();	
		
		//parseType 시리즈 : 값을 원하는 타입으로 변환한다.
		String str = "10";
		Integer.parseInt(str); //int로!
		Integer.parseInt(str,16);//16진수 int로!
		Double.parseDouble(str); //double로!
		Byte.parseByte(str);//byte로!
				
		//비교
		//new Integer(10) == new Integer(10); 
		new Integer(10).equals(new Integer(10)); 
			
		//진법변환이 가능하다.(radix생략시 십진법)
		Integer.toString(123, 2); //2진법으로!
		Integer.toString(123, 8); //8진법으로!
		Integer.toString(123, 10); //10진법으로!
		Integer.toString(123, 16); //16진법으로!
		
		Boolean b1 = Boolean.valueOf("true"); //문자열을 boolean으로 변환
		
		//해당 진법의 숫자를 char타입으로 반환.
		Character.forDigit(35, 36); //36진법의 35에 해당하는 문자를 반환 
		Character.forDigit(35, 16); //16진법의 35에 해당하는 문자를 반환
	}
}
