
public class C04_Static {

	//static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	//같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다.
	//static 영역은 클래스 당 하나이기 때문에 클래스 이름.으로 사용하는 것이 권장된다.
	//static 영역의 변수/메서드는 인스턴스가 생기기 전에도 호출할 수 있다.
	//인스턴스가 존재하지 않을 때도 static이 사용될 가능성이 있기 때문에 static 메서드에서는 instance 자원을 쓸수 없다.
	//(instance에서 static으로의 접근은 허용한다.)

	public static void main(String[] args) {

		Card s1 = new Card("Spade", 1);

		System.out.println(Card.width);
		System.out.println(s1.width); //s1.width = Card.width
	}
}

class Card {

	String shape; //각 카드마다 다른값 (인스턴스)
	int number; 
	
	static int width; //각 카드 다 같음 (스태틱)
	static int height; 

	static { //생성자(public Card)대신 static block에서 초기화를 진행하는 것이 좋다.		
		
		width = 100;
		height = 200;
		System.out.println("static block called");	
	}

	public Card(String shape, int number) {

		this.shape = shape;
		this.number = number;

		System.out.println("constructor block called");
	}

	public static void changeCardSize(int width, int height) {

		//static method : 매개변수나 static 변수만 활용할 수 있는 메서드
		//인스턴스와 무관하게 항상 일정한 기능을 구현.
		//static 메서드에서는 아직 인스턴스가 생성되지 않았을 수도 있으므로 this가 존재하지 않는다.

		Card.width = width;
		Card.height = height;
	}

	public static int[] getCardSize() {
		return new int[] {width,height};
	}
}


class Coffee {

	int from; //각 커피의 원산지를 번호로 표현하기로 함.

	final static int SOUTH_KOREA = 0; 	//모든 커피들이 같은 원산지이다. => 정적 영역 (static)
	final static int COLUMBIA = 1;
	final static int BRAZIL = 2; 

}


