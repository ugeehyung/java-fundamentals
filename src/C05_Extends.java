
public class C05_Extends {

	//Ŭ���� ��� �̸� ������ Ŭ������ �״�� �����޾Ƽ� ���
	//������ִ� Ŭ������ �θ� Ŭ���� = ����(super)Ŭ����
	//��ӹ޴� Ŭ������ �ڽ� Ŭ���� = ����(sub)Ŭ����
	//�ڽ� Ŭ������ �θ� Ŭ������ ���� ��� ����� �״�� �����޴´�.
	//�ڽ� Ŭ������ �θ𿡰� �����޴� ����� ������� �����ؼ� �� �� �ִ�.(= Override(�������̵�))
	//�ڽ� Ŭ������ �θ𿡰� ���� ����� ������� �߰��ؼ� �� �� �ִ�.

	public static void main(String[] args) {

		Person one = new Person();
		one.sayHi();
		
		Person minsu = new Person("��μ�", 10);
		minsu.sayHi();


		Police police1 = new Police(); 
		police1.sayHi();


		Doctor doctor1 = new Doctor();
		doctor1.sayHi();


		Dentist dentist1 = new Dentist();
		dentist1.sayHi();

		
		dentist1.scaling(minsu);
		dentist1.scaling(police1);

		//police�� �θ��� person�� ��� ������ ������ �ֱ� ������ �ƹ� �������� person Ÿ���� �� �� �ִ�.
		//�� �θ�Ÿ������ �ö󰡴� ��ĳ������ �ƹ� ��������.
		//person�� �ڽ��� police�� �𸣴� ����� ������ �� �ֱ� ������ �ڽ� Ÿ���� �� �� ����(down casting)
		//�� �ٿ�ĳ������ Ư���� ��츦 �����ϰ�� �Ұ����ϴ�.

//		Person person1 = new Police();
//		Person person2 = new Dentist() �� ��, 
//		���� police���� �ν��Ͻ��� �ٽ� police�� �ٿ�ĳ���� �� �� �ִ�.
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
		System.out.printf("�ȳ�! �� �̸��� %s�̰�, ���̴� %d���̾�.\n", name, age);
	}
}


class Police extends Person {

	public Police() {
		super("�����", 20); //�� �θ��� �����ڰ� �Ű������� �䱸�ϴ� �����ڹۿ� ���� ���, �ݵ�� ���� ä���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�.
	}	

	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�\n", name);
	}
}


class Doctor extends Person { //�⺻�����ڰ� �ִ� �θ�Ŭ������ ��ӹ޴� ��� �ڵ����� �θ��� �⺻�����ڸ� ȣ���Ѵ�.

	String name = "���ǻ�";
	int age = 30;
	
	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�\n", name);
		//Override: Person Ŭ������ sayHi()�� ������� ���ļ� ����ϰ� �ִ�.
		//������ sayHi()�� ����ϰ� �ʹٸ� super.sayHi()�� ����� �� �ִ�.
	}
}

class Dentist extends Doctor {

	String name = "��ġ��";
	int age = 40;
	
	public void scaling(Person target) {
		System.out.printf("ġ���ǻ� %s�� %s���� �����ϸ�\n", name, target.name);
	}
	
	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. ġ���ǻ� %s�Դϴ�\n", name);
	}
}


