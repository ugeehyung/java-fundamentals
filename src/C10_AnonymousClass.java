import myobj.animal.Animal;

public class C10_AnonymousClass {

	//익명 클래스: 클래스를 바로 구현하여 사용하는 방식. 따로 저장되지 않고 한번만 사용한다.

	public static void useAnimal(Animal animal) {
		animal.breathe();
		animal.eat();
	}

	public static void main(String[] args) {

		Animal animal01 = new Animal();
		Animal animal02 = new Animal() { 
			public void breathe() { //override
				System.out.println("물고기의 숨쉬기");
			}
			public void eat() {
				System.out.println("물고기의 먹이먹기");
			}
		}; 	//이렇게 생성한 클래스는 다시 사용할 수 없기 때문에 익명. Animal을 상속받은 이름없는 클래스 작성.

		useAnimal(new Animal() { //익명으로 선언한 새로운 클래스를 함수의 인자로 전달
			public void breathe() {
				System.out.println("고양이의 숨쉬기");
			}
			public void eat() {
				System.out.println("고양이의 참치먹기");
			}
		});

		useAnimal(animal01);
		useAnimal(animal02);

		abstract class Monster { //추상 클래스는 인스턴스화가 불가능

			public Monster (int attack, int hp) {
				this.attack = attack;
				this.hp = hp;
			}

			int attack;
			int hp;
			abstract void attack();
			abstract void attacked();
		}

		Monster monster = new Monster(30,50) {

			void attack() {
				System.out.printf("%d의 공격력으로 공격합니다.\n", attack*150);
			}
			void attacked() {
				System.out.printf("체력이 %d이 되었습니다.", hp-1);
			}
		};

		monster.attack();
		monster.attacked();

	}
}
