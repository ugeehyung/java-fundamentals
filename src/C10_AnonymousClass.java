import myobj.animal.Animal;

public class C10_AnonymousClass {

	//�͸� Ŭ����: Ŭ������ �ٷ� �����Ͽ� ����ϴ� ���. ���� ������� �ʰ� �ѹ��� ����Ѵ�.

	public static void useAnimal(Animal animal) {
		animal.breathe();
		animal.eat();
	}

	public static void main(String[] args) {

		Animal animal01 = new Animal();
		Animal animal02 = new Animal() { 
			public void breathe() { //override
				System.out.println("������� ������");
			}
			public void eat() {
				System.out.println("������� ���̸Ա�");
			}
		}; 	//�̷��� ������ Ŭ������ �ٽ� ����� �� ���� ������ �͸�. Animal�� ��ӹ��� �̸����� Ŭ���� �ۼ�.

		useAnimal(new Animal() { //�͸����� ������ ���ο� Ŭ������ �Լ��� ���ڷ� ����
			public void breathe() {
				System.out.println("������� ������");
			}
			public void eat() {
				System.out.println("������� ��ġ�Ա�");
			}
		});

		useAnimal(animal01);
		useAnimal(animal02);

		abstract class Monster { //�߻� Ŭ������ �ν��Ͻ�ȭ�� �Ұ���

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
				System.out.printf("%d�� ���ݷ����� �����մϴ�.\n", attack*150);
			}
			void attacked() {
				System.out.printf("ü���� %d�� �Ǿ����ϴ�.", hp-1);
			}
		};

		monster.attack();
		monster.attacked();

	}
}
