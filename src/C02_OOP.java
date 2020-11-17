import java.util.Scanner;

//객체 지향 프로그래밍 (OOP: Object Oriented Programming) = 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법
//객체(object):세상에 존재하는 모든 개념 (사물, 개념, 알고리즘 등)
//변수와 함수를 무분별하게 사용하기보다는 현실에 존재하는 개체처럼 보이도록 하여 가독성을 올린다.

//클래스(Class) : 객체를 프로그래밍 언어로 표현한 것
//객체의 설계도이다 (만든 시점에서는 실체가 없음)
//클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다.
//클래스는 참조형 변수 타입이다. ===> 만약 사과 클래스를 만든다면 사과 '타입'을 사용할 수 있게 된다!

class Apple { 

	int size; //인스턴스 변수 (=필드, 멤버변수, 상태...) : 모든 인스턴스마다 각자 다른 값을 가지고 있는 변수
	int sweet;
	int calorie;
	int damage;
	String color;
	String eatday;

	void eat() { //인스턴스 메서드 (= 기능) : 인스턴스 변수를 활용하는 메서드

		System.out.println("사과를 먹었습니다.");
		System.out.println(this.sweet + "만큼 기분이 좋아졌습니다.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("크기 : %d  칼로리: %d\n\n", this.size, this.calorie);

	}

}

public class C02_OOP {

	public static void main(String[] args) {

		Apple ap = new Apple(); //Apple 설계도(클래스)로 실체를 만들어 그 실체 주소를 변수 ap에 저장
		Apple ap1 = new Apple();
		Apple ap2 = new Apple();
		Apple ap3 = new Apple();
		
		Apple[] applebox = new Apple[10]; //10칸짜리 배열생성
		for(int i=0; i<10;++i) {
			applebox[i] = new Apple();
		} //배열 안에 apple()이 들어감

		ap.eatday = "2020/10/29";
		ap.size = 10;
		ap.calorie = ap.size * 10;
		ap.color = "red";

		ap.sweet = 7;
		ap1.sweet = 8;
		ap2.sweet = 9;
		ap3.sweet = 10;

		ap.eat();
		ap1.eat();
		ap2.eat();
		ap3.eat();

	}
}

