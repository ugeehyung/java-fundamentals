
public class C09_LocalInnerClass {

	void method() {
		
		class Apple{ //지역 내부 클래스: 메서드 내부에서 클래스 사용. 메서드의 범위를 벗어날 수 없다.
			int size;
			String color;
		}
		Apple a = new Apple();
		System.out.println(a.size);
		System.out.println(a.color);
	}
	
	public static void main(String[] args) {
		
		String a = "대구";
		String b = "빨간색";
		
		class Apple { //지역 내부 클래스 : 메서드가 끝나면 클래스도 사라지게 된다.
			String addr;
			String color;
			
			public Apple() {
				addr = a;
				color = b;
			}
		}
		
		Apple apple = new Apple();
		System.out.println(apple.addr);
		System.out.println(apple.color);
		
	}
}
