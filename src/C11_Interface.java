import myobj.animal.Animal;

public class C11_Interface {

	//인터페이스(interface) : abstract class와 유사하지만 여러개 상속받을 수 있는 것
	//추상을 통해 클래스에 성질을 부여하고 싶지만 이미 상속받은 클래스가 있는 경우 인터페이스를 사용한다.
	//업캐스팅이 가능하다. 

	public static void swimContest(Swimmer s) {
		s.swim();
		s.kick();
		s.front();
	}

	public static void main(String[] args) {
		swimContest(new Bear());
		swimContest(new Swimmer() {
			public void swim() {
				System.out.println("익명의 수영선수");
			}
			public void kick() {
				System.out.println("익명의 수셩선수 발차기");
			}
		});
	}
}

interface Swimmer {

	double water_regist = 123;	//인터페이스의 변수는 자동으로 'final static'이 된다.
	void swim(); //인터페이스의 메서드는 자동으로 'abstract public' 메서드가 된다.

	default void kick() {  	//인터페이스의 default : 오버라이드 할 수도 있지만, 안하면 기본동작을 사용
		System.out.println("발차기");
	}
	default void front() {
		System.out.println("팔젓기");
	}

	static long startTime() {
		return System.currentTimeMillis();
	}
	static long endTime() {
		return System.currentTimeMillis();
	}
}

interface CookFish {
	void cookfish();
}

interface BoatDriving {
	void driveboat();
	
}
interface Fishing extends BoatDriving{ //인터페이스끼리도 상속을 받을 수 있고, 여러개 받을 수 있다.
	void fish();
}

class Bear extends Animal implements Swimmer, Fishing { //Bear은 Swim, Fish 가능. Animal은 아님.
	@Override
	public void swim() {
		System.out.println("곰 수영");
	}
	@Override
	public void fish() {
		System.out.println("곰 낚시");
	}
	@Override
	public void driveboat() {
		
	}
}