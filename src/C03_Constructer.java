public class C03_Constructer {

	public static void main(String[] args) {

		Orange o1 = new Orange();
		//오른쪽: constructer = 클래스 생성자. 리턴 타입이 없고 클래스명과 같은 이름. 
		//인스턴스 생성시에 가장 먼저 호출. 주로 인스턴스 변수값을 초기화하는 용도로 사용한다.
		//생성자를 따로 정의하지 않으면 기본생성자가 자동으로 생성된다. (기본생성자: 매개변수가 없는 생성자)
		System.out.println(o1.color); 
		System.out.println(o1.size);
		System.out.println(o1.sweet);

		Grape g1 = new Grape(30);
		for (int i=0; i<31;++i) {
			g1.eat();
		}
		//String str = new String("a");
		//new와 함께 생성자를 호출하면 클래스에 정의된대로 인스턴스를 생성된다.
		//생성자가 모두 실행된 후에는 생성된 인스턴스의 주소가 반환된다.
	}
}

class Orange {

	int sweet;
	int size;
	String color;

	public Orange() {
		sweet = 10;
		size = 5;
		color = "orange";
	}

	public Orange(int sweet, int size, String color) {	
		//오버로딩: 하나의 클래스가 다양한 형태의 생성자를 가지고 있을 수 있다.
		//this : 클래스 내부에서 현재 인스턴스를 참조할 때 사용하는 키워드
		//필드값과 지역변수명이 겹치는 경우 this를 이용해 어느쪽 변수인지 명확하게 지정
		//this를 붙인 쪽이 인스턴스 변수가 된다.
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}

class Grape {

	int podo;
	int skin;

	public Grape(int podo) { //정의된 생성자가 있다면 기본 생성자가 자동으로 생성되지 않는다.
		this.podo = podo;
		this.skin = 0;
	}

	public Grape() {//자동으로 생성되지 않으므로, 기본 생성자를 사용하고 싶다면 직접 정의해야 한다.
		this(20); //생성자에서 this()를 통해 다른 생성자를 호출할 수 있다.
		//생성자에서 this()를 통해 다른 생성자를 호출할 수 있다.
		//다른 생성자는 반드시 생성자 맨 윗줄에서 호출해야 한다.
	}

	public void eat() {
		if(podo==0) {
			System.out.println("no grapes left");
			return;
		}
		podo--;
		skin++;
		System.out.println(podo + " grapes, " + skin + " skin(s) left");
	}
}




