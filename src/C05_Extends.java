
public class C05_Extends {

	//클래스 상속 미리 만들어둔 클래스를 그대로 물려받아서 사용
	//상속해주는 클래스를 부모 클래스 = 슈퍼(super)클래스
	//상속받는 클래스를 자식 클래스 = 서브(sub)클래스
	//자식 클래스는 부모 클래스가 가진 모든 기능을 그대로 물러받는다.
	//자식 클래스는 부모에게 물려받는 기능을 마음대로 수정해서 쓸 수 있다.(= Override(오버라이드))
	//자식 클래스는 부모에게 없던 기능을 마음대로 추가해서 쓸 수 있다.

	public static void main(String[] args) {

		Person one = new Person();
		one.sayHi();
		
		Person minsu = new Person("김민수", 10);
		minsu.sayHi();


		Police police1 = new Police(); 
		police1.sayHi();


		Doctor doctor1 = new Doctor();
		doctor1.sayHi();


		Dentist dentist1 = new Dentist();
		dentist1.sayHi();

		
		dentist1.scaling(minsu);
		dentist1.scaling(police1);

		//police는 부모인 person의 모든 정보를 가지고 있기 때문에 아무 문제없이 person 타입이 될 수 있다.
		//※ 부모타입으로 올라가는 업캐스팅은 아무 문제없다.
		//person은 자식인 police에 모르는 기능이 존재할 수 있기 때문에 자식 타입이 될 수 없다(down casting)
		//※ 다운캐스팅은 특별한 경우를 제외하고는 불가능하다.

//		Person person1 = new Police();
//		Person person2 = new Dentist() 일 때, 
//		원래 police였던 인스턴스는 다시 police로 다운캐스팅 될 수 있다.
//		ex.
//		Police police = (Police)person1; (O)
//		Police police2 = (Police)person2; (X)
//		Doctor doctor = (Doctor)person2; (O)

		Person[] pArr = { new Person(), new Police(), new Doctor(), new Dentist()};
		
	}
}

class Person {

	String name;
	int age;

	public Person() {
		this("default" , 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sayHi() {
		System.out.printf("안녕! 내 이름은 %s이고, 나이는 %d살이야.\n", name, age);
	}
}


class Police extends Person {

	public Police() {
		super("김경찰", 20); //※ 부모의 생성자가 매개변수를 요구하는 생성자밖에 없는 경우, 반드시 값을 채워서 부모의 생성자를 호출해야 한다.
	}	

	public void sayHi() {
		System.out.printf("안녕하세요. 경찰 %s입니다\n", name);
	}
}


class Doctor extends Person { //기본생성자가 있는 부모클래스를 상속받는 경우 자동으로 부모의 기본생성자를 호출한다.

	String name = "김의사";
	int age = 30;
	
	public void sayHi() {
		System.out.printf("안녕하세요. 닥터 %s입니다\n", name);
		//Override: Person 클래스의 sayHi()를 마음대로 고쳐서 사용하고 있다.
		//원래의 sayHi()를 사용하고 싶다면 super.sayHi()를 사용할 수 있다.
	}
}

class Dentist extends Doctor {

	String name = "김치과";
	int age = 40;
	
	public void scaling(Person target) {
		System.out.printf("치과의사 %s가 %s에게 스케일링\n", name, target.name);
	}
	
	public void sayHi() {
		System.out.printf("안녕하세요. 치과의사 %s입니다\n", name);
	}
}


